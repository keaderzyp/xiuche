package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.oojunzi.app.core.util.ApplicationUtils;
import com.oojunzi.app.core.util.FileUpload;
import com.oojunzi.app.core.util.HttpUtils;
import com.oojunzi.app.core.util.MathUtils;
import com.oojunzi.app.core.util.SmsUtils;
import com.oojunzi.app.web.annotation.ControllerLog;
import com.oojunzi.app.web.model.AdminLog;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.model.SmsModel;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserWeather;
import com.oojunzi.app.web.security.PermissionSign;
import com.oojunzi.app.web.security.RoleSign;
import com.oojunzi.app.web.service.CarInfoService;
import com.oojunzi.app.web.service.CircleInfoService;
import com.oojunzi.app.web.service.LogService;
import com.oojunzi.app.web.service.MyHelpService;
import com.oojunzi.app.web.service.NewHelpService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserService;

/**
 * 用户控制器
 * 
 * @author michael
 * @since 2016年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService;

	// add yuhb 0712
	@Resource
	private CircleInfoService CircleInfoService;
	@Resource
	private UserAddService userAddService;
	@Autowired
	private FileUpload fileUpload;
	@Resource
	private CarInfoService carInfoService;
	@Autowired
	private MyHelpService myHelpService;
	@Resource
	private LogService logService;
	@Autowired
	private NewHelpService newHelpService;

	/**
	 * 用户登录
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
		try {
			Subject subject = SecurityUtils.getSubject();
			if (result.hasErrors()) {
				model.addAttribute("error", "参数错误！");
				return "login";
			}
			// 身份验证
			subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
			// 验证成功在Session中保存用户信息
			final User authUserInfo = userService.selectByUsername(user.getUsername());
			request.getSession().setAttribute("userInfo", authUserInfo);

			// 如果用户已经冻结，禁止登录
			if ("9".equals(authUserInfo.getState())) {
				model.addAttribute("error", "该用户已经冻结，请换个用户重新登录！");
				return "login";
			}

			model.addAttribute("user", authUserInfo);

			// add yuhb 0712
			// 取圈内所有用户信息
			List<User> userList = new ArrayList<User>();
			userList = userAddService.selectUsersByCircle(authUserInfo.getId());

			model.addAttribute("userList", userList);
			model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());

			// add lgq
			List<Map<String, Object>> carInfoLists = carInfoService.selectCarInfoAndTimeByUserId(authUserInfo.getId());
			// 如果该用户有一辆车则返回车辆id 其余返回0
			if (carInfoLists.size() == 1) {
				model.addAttribute("carId", carInfoLists.get(0).get("ID"));
			} else {
				model.addAttribute("carId", 0);
			}
			// add LGQ 查询天气
			UserWeather userWeather = getWeather("贵阳");
			model.addAttribute("userWeather", userWeather);
			model.addAttribute("carInfo", setCarInfoLists(carInfoLists));

			// add LGQ 主页显示最近账单
			List<HelpBill> helpBillOne = newHelpService.selectTopOneBillByUserId(authUserInfo.getId());
			List<HelpPartake> HelpPartakeList = newHelpService.selectPartakeByUserId(authUserInfo.getId());
			Map<Long, HelpPartake> PartakeMap = new HashMap<Long, HelpPartake>();
			for (HelpPartake helpPartake : HelpPartakeList) {
				PartakeMap.put(Long.parseLong(helpPartake.getParam1()), helpPartake);
			}
			model.addAttribute("helpBillOne", helpBillOne);
			model.addAttribute("PartakeMap", PartakeMap);

		} catch (AuthenticationException e) {
			// 身份验证失败
			model.addAttribute("error", "用户名或密码错误 ！");
			return "login";
		}
		// return "main_login";
		//return "index";
		 return "main_login";
	}

	/**
	 * 用户手机号登录 注意：功能未实现，依然与密码登录相同
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/codeLogin", method = RequestMethod.POST)
	public String codeLogin(@Valid User user, BindingResult result, Model model, HttpServletRequest request,
			@RequestParam("code") String code, @RequestParam("code2") String code2) {
		try {
			//add zhwh
			final User user2 = userService.selectByUsername(user.getUsername());

			model.addAttribute("user", user2);
			//判断手机号是否存在
			if (user2 == null) {
				model.addAttribute("error", "手机号不存在，请注册");
				return "register";
			} else if (code.equals(code2)&&code2!="") { //验证验证码
				request.getSession().setAttribute("userInfo", user2);
				Subject subject = SecurityUtils.getSubject();
				subject.login(new UsernamePasswordToken(user2.getUsername(), user2.getPassword()));
				// add yuhb 0712
				// 取圈内所有用户信息
				List<User> userList = new ArrayList<User>();
				userList = userAddService.selectUsersByCircle(user2.getId());

				model.addAttribute("userList", userList);
				model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());

				// add lgq
				List<Map<String, Object>> carInfoLists = carInfoService.selectCarInfoAndTimeByUserId(user2.getId());
				// 如果该用户有一辆车则返回车辆id 其余返回0
				if (carInfoLists.size() == 1) {
					model.addAttribute("carId", carInfoLists.get(0).get("ID"));
				} else {
					model.addAttribute("carId", 0);
				}
				// add LGQ 查询天气
				UserWeather userWeather = getWeather("贵阳");
				model.addAttribute("userWeather", userWeather);
				model.addAttribute("carInfo", setCarInfoLists(carInfoLists));

				// add LGQ 主页显示最近账单
				List<HelpBill> helpBillOne = newHelpService.selectTopOneBillByUserId(user2.getId());
				List<HelpPartake> HelpPartakeList = newHelpService.selectPartakeByUserId(user2.getId());
				Map<Long, HelpPartake> PartakeMap = new HashMap<Long, HelpPartake>();
				for (HelpPartake helpPartake : HelpPartakeList) {
					PartakeMap.put(Long.parseLong(helpPartake.getParam1()), helpPartake);
				}
				model.addAttribute("helpBillOne", helpBillOne);
				model.addAttribute("PartakeMap", PartakeMap);

			} else {
				model.addAttribute("error", "手机号或验证码错误，请重试");
				return "code";
			}

		} catch (AuthenticationException e) {
			// 身份验证失败

		}

		return "main_login";

	}

	/**
	 * 发送验证码
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/sendCode", method = RequestMethod.GET)
	@ResponseBody
	public String sendCode(@RequestParam("phone") String phone) {
		final User user = userService.selectByUsername(phone);
		Map<String, Object> map = new HashMap<>();
		if (user == null) {
			map.put("error", "手机号不存在，请注册");
			map.put("isSucc", "NO");
		} else {
			String code = MathUtils.code();
			//System.out.println("---------------------------------------");
			//System.out.println(phone);
			SmsModel smsModel = new SmsModel();
			smsModel.setPhone(phone);
			smsModel.setTemplateCode("SMS_84535005");
			smsModel.setParam1(code);
			SendSmsResponse response = null;
			try {
				response = SmsUtils.sendSms(smsModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put("isSucc", response.getCode());
			map.put("code", code);
			System.out.println(response.getCode());
		}

		return JSON.toJSONString(map);
	}
	/**
	 * 发送修改密码验证码
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/sendChangePassCode", method = RequestMethod.GET)
	@ResponseBody
	public String sendChangePassCode(@RequestParam("phone") String phone) {
		final User user = userService.selectByUsername(phone);
		Map<String, Object> map = new HashMap<>();
		if (user == null) {
			map.put("error", "手机号不存在，请注册");
			map.put("isSucc", "NO");
		} else {
			String code = MathUtils.code();
			//System.out.println("---------------------------------------");
			//System.out.println(phone);
			SmsModel smsModel = new SmsModel();
			smsModel.setPhone(phone);
			smsModel.setTemplateCode("SMS_88355002");
			smsModel.setParam1(code);
			SendSmsResponse response = null;
			try {
				response = SmsUtils.sendSms(smsModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put("isSucc", response.getCode());
			map.put("code", code);
			System.out.println(response.getCode());
		}

		return JSON.toJSONString(map);
	}
	/**
	 * 发送验证码 登录
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/verifyCode", method = RequestMethod.GET)
	@ResponseBody
	public String verifyCode(@RequestParam("phone") String phone) {
		final User user = userService.selectByUsername(phone);
		Map<String, Object> map = new HashMap<>();
		if (user == null) {
			map.put("error", "手机号不存在，请注册");
			map.put("isSucc", "NO");
		} else {
			String code = MathUtils.code();
			//System.out.println("---------------------------------------");
			//System.out.println(phone);
			SmsModel smsModel = new SmsModel();
			smsModel.setPhone(phone);
			smsModel.setTemplateCode("SMS_83440266");
			smsModel.setParam1(code);
			SendSmsResponse response = null;
			try {
				response = SmsUtils.sendSms(smsModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put("isSucc", response.getCode());
			map.put("code", code);
			System.out.println(response.getCode());
		}

		return JSON.toJSONString(map);
	}
	/**
	 * 用户登出
	 * 
	 * @param session
	 * @return
	 */
	@ControllerLog(description = "用户登出")
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("userInfo");
		// 登出操作
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}
	@RequestMapping(value = "/adminlogout", method = RequestMethod.GET)
	public String adminlogout(HttpSession session) {
		session.removeAttribute("user");
		// 登出操作
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login2";
	}
	/**
	 * 基于角色 标识的权限控制案例
	 */
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	public String admin(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
		
		try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                return "index";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login2";
            }
            // 身份验证
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            // 验证成功在Session中保存用户信息
            final User authUserInfo = userService.selectByUsername(user.getUsername());
            request.getSession().setAttribute("user", authUserInfo);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "login2";
        }
		return "index";
		
		
	}
    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }
	/**
	 * 基于权限标识的权限控制案例
	 */
	@RequestMapping(value = "/create")
	@ResponseBody
	@RequiresPermissions(value = PermissionSign.USER_CREATE)
	public String create() {
		return "拥有user:create权限,能访问";
	}

	/**
	 * 验证码登录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/code")
	public String code() {
		return "code";
	}

	/**
	 * 注册
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String register() {
		User user = new User();
		userService.insert(user);
		return "register";
	}

	/**
	 * 用户管理
	 * 
	 */
	@RequestMapping(value = "/manage")
	public String userManage(@Valid User user, String oper, Model model, HttpServletRequest request) {

		if (oper != null && oper.equals("edit")) { // 编辑
			userService.update(user);
		} else if (oper != null && oper.equals("add")) {

			userService.insert(user);

		} else if (oper != null && oper.equals("del")) {
			userService.delete(user.getId());
		}

		return "userManage";
	}

	/**
	 * 
	 * //TODO 所有用户查询
	 * 
	 * @param user
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/userAll")
	@ResponseBody
	public String userAll(User user, Model model, HttpServletRequest request) {
		UserExample example = new UserExample();
		List<User> userList = userService.selectByExample(example);

		return JSON.toJSONString(userList);

	}

	/**
	 * 
	 * 根据手机号查询用户
	 * 
	 * @param user
	 * @param model
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/userBytelehone")
	@ResponseBody
	public String userBytelephone(Model model, @RequestParam("filter") String telephone) {

		UserExample example = new UserExample();
		example.createCriteria().andTelphoneEqualTo(telephone);
		List<User> userList = userService.selectByExample(example);

		return JSON.toJSONString(userList);

	}

	/**
	 * 添加查询参数给页面
	 * 
	 * 
	 */
	@RequestMapping(value = "/addFilter")
	public String addFiltersIntoPage(@RequestParam("filter") String filter, Model model) {

		model.addAttribute("searchFilter", filter);

		return "userManage";
	}

	/**
	 * add yuhb 跳转到我的
	 * 
	 */
	@RequestMapping(value = "/gotoMainDeal")
	public String gotoMainDeal(Model model, HttpServletRequest request) {

		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User authUserInfo = (User) session.getAttribute("userInfo");

		if (authUserInfo == null) {
			return "login";
		}

		// 如果用户已经冻结，禁止登录
		if ("9".equals(authUserInfo.getState())) {
			model.addAttribute("error", "该用户已经冻结，请换个用户重新登录！");
			return "login";
		}

		model.addAttribute("user", authUserInfo);

		// add yuhb 0712
		// 取圈内所有用户信息
		List<User> userList = new ArrayList<User>();
		userList = userAddService.selectUsersByCircle(authUserInfo.getId());

		model.addAttribute("userList", userList);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());

		// add lgq
		List<Map<String, Object>> carInfoLists = carInfoService.selectCarInfoAndTimeByUserId(authUserInfo.getId());
		// 如果该用户有一辆车则返回车辆id 其余返回0
		if (carInfoLists.size() == 1) {
			model.addAttribute("carId", carInfoLists.get(0).get("ID"));
		} else {
			model.addAttribute("carId", 0);
		}
		// add LGQ 查询天气
		UserWeather userWeather = getWeather("贵阳");
		model.addAttribute("userWeather", userWeather);
		model.addAttribute("carInfo", setCarInfoLists(carInfoLists));
		// add LGQ 主页显示最近账单
		List<HelpBill> helpBillOne = newHelpService.selectTopOneBillByUserId(authUserInfo.getId());
		List<HelpPartake> HelpPartakeList = newHelpService.selectPartakeByUserId(authUserInfo.getId());
		Map<Long, HelpPartake> PartakeMap = new HashMap<Long, HelpPartake>();
		for (HelpPartake helpPartake : HelpPartakeList) {
			PartakeMap.put(Long.parseLong(helpPartake.getParam1()), helpPartake);
		}
		model.addAttribute("helpBillOne", helpBillOne);
		model.addAttribute("PartakeMap", PartakeMap);
		return "main_login";
	}

	/**
	 * 根据id查用户
	 * 
	 * @author michael
	 */
	@RequestMapping(value = "/getuserByid")
	public ModelAndView getUserByid(@RequestParam("id") String id, ModelAndView mv) {
		//用户信息
		User user = userService.selectById(id);
		mv.addObject("userinfo", user);
		mv.addObject("userId", id);
		
		
		
		
		//用户操作痕迹
		AdminLog aLog = new AdminLog();
		aLog.setAdminId(Integer.parseInt(id));
		List<AdminLog> adminLogs = logService.selectListByCondition(aLog);
		mv.addObject("logList", adminLogs);
		
		
		//用户车辆管理
		
		CarInfoExample example = new CarInfoExample();
		//BigDecimal id = new BigDecimal(user.getId());
		example.createCriteria().andUserIdEqualTo(new BigDecimal(id));
		List<CarInfo> carInfoList = carInfoService.selectByExample(example);
		mv.addObject("carInfoList", carInfoList);
		
		
		
		mv.setViewName("userDetail");
		return mv;
	}
	/**
	 * 根据id冻结用户
	 * 
	 * @author michael
	 */
	@RequestMapping(value = "/lockUserByid")
	public String lockUserByid(@RequestParam("id") String id, ModelAndView mv) {
		User user = userService.selectById(id);
		user.setState("9");
		
		userService.update(user);
		return "redirect:page/userManage";
	}
	/**
	 * 用户操作痕迹查询
	 * 
	 * @author michael
	 */
	@RequestMapping(value = "/getUserOper")
	@ResponseBody
	public String getUserOper(@RequestParam("id") String id) {
		/*
		 * Subject currentUser = SecurityUtils.getSubject(); Session session =
		 * currentUser.getSession(); User user = (User)
		 * session.getAttribute("user");
		 */

		AdminLog aLog = new AdminLog();
		aLog.setAdminId(Integer.parseInt(id));
		List<AdminLog> adminLogs = logService.selectListByCondition(aLog);

		return JSON.toJSONString(adminLogs);
	}

	/**
	 * 获取车管家数据 autocomplete
	 * 
	 * @return
	 * 
	 */
	/*
	 * @RequestMapping("/getCarManager") public @ResponseBody List<UserInfo>
	 * getOtherCompany(@RequestParam("cname") String cname, HttpServletRequest
	 * request) { List<UserInfo> tc =
	 * userService.getCarManagerListByLikeName(cname); return tc; }
	 */

	// add LGQ
	// 摘取方法
	public List<Map<String, Object>> setCarInfoLists(List<Map<String, Object>> carInfoLists) {
		for (Map<String, Object> map : carInfoLists) {
			// 为测试而用
			Object aa = map.get("STATUS");
			if (aa == null) {
				map.put("STATUS", 0);
			} else {
				// 正常使用时只保留这句
				map.put("STATUS", Long.parseLong(map.get("STATUS").toString().trim()));

			}
			Object carId = map.get("ID");
			String money = myHelpService.selectSumPayByCarId(Long.parseLong(carId.toString()));
			if (money == null) {
				money = "0";
			}
			map.put("money", money);
			if (map.get("PARAM1") != null) {
				// Date beginDate = (Date) map.get("PARAM1");
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

				Date beginDate;
				try {
					beginDate = fmt.parse(map.get("PARAM1").toString());
					Date endDate = new Date();
					long day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
					if (!map.get("STATUS").equals("3")) {
						if (day >= 0) {
							CarInfo carInfo = carInfoService.selectByPrimaryKey((BigDecimal) map.get("ID"));
							carInfo.setStatus("3");
							carInfoService.updateByPrimaryKeySelective(carInfo);
							map.put("STATUS", 3);
						}
					}
					map.put("day", day);
					if (map.get("PARTAKE_MAX") != null) {
						Object shangxian = map.get("PARTAKE_MAX");
						// 上限/52*第几周-花掉的
						// 上限/365*加入的天数-花掉的
						double a = Double.parseDouble(shangxian.toString()) / 365;
						double b = a * day;
						double c = Double.parseDouble(money);
						double jiesheng = b - c;
						DecimalFormat df = new DecimalFormat("#0.00");
						map.put("jiesheng", df.format(jiesheng));
					} else {
						map.put("jiesheng", 0);
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return carInfoLists;
	}

	// add LGQ
	// 查询天气信息
	public UserWeather getWeather(String city) {
		UserWeather userWeather = new UserWeather();
		userWeather.setCity(city);
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		userWeather.setHappydate(fmt.format(new Date()));
		UserWeather userWeathers = userService.selectByCityAndTime(userWeather);
		// 根据地点和当前日期查询数据库
		if (userWeathers == null) {
			// 调用天气接口
			// 数据库插入数据
			String host = "http://jisutianqi.market.alicloudapi.com";
			String path = "/weather/query";
			String method = "GET";
			String appcode = "175a13e860c34589827302e86f9c42d6";
			Map<String, String> headers = new HashMap<String, String>();
			// 最后在header中的格式(中间是英文空格)为Authorization:APPCODE
			// 83359fd73fe94948385f570e3c139105
			headers.put("Authorization", "APPCODE " + appcode);
			Map<String, String> querys = new HashMap<String, String>();
			querys.put("city", city);
			querys.put("citycode", "citycode");
			querys.put("cityid", "cityid");
			querys.put("ip", "ip");
			querys.put("location", "location");

			try {
				/**
				 * 重要提示如下: HttpUtils请从
				 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
				 * 下载
				 *
				 * 相应的依赖请参照
				 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
				 */
				String jsonWeather = HttpUtils.doGet(host, path, method, headers, querys);
				int begin = jsonWeather.indexOf("msg") + 6;
				// System.out.println(begin);
				int end = jsonWeather.indexOf("\"", begin);
				// System.out.println(end);
				String isSuccess = jsonWeather.substring(begin, end);
				// System.out.println("是否成功：" + isSuccess);
				if (isSuccess.equals("ok")) {
					begin = jsonWeather.indexOf("result") + 8;
					end = jsonWeather.indexOf("}}", begin) + 1;
					jsonWeather = jsonWeather.substring(begin, end);
					userWeather.setSuccFlag(isSuccess);
					userWeather.setCity(mySubString("city", jsonWeather));
					userWeather.setHappydate(fmt.format(new Date()));
					userWeather.setWeather(mySubString("weather", jsonWeather));
					userWeather.setTemp(mySubString("temp", jsonWeather));
					userWeather.setPm2p5day(mySubString("pm2_524", jsonWeather));
					userWeather.setPm2p5(mySubString("ipm2_5", jsonWeather));
					userWeather.setAffect(mySubString("affect", jsonWeather));
					userWeather.setWeatImg(mySubString("img", jsonWeather));
					userService.insertSelective(userWeather);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return userWeather;
		}
		return userWeathers;
	}

	public static String mySubString(String sunStr, String allStr) {
		int bbegin = allStr.indexOf(sunStr);
		int begin = allStr.indexOf(":\"", bbegin) + 2;
		int end = allStr.indexOf("\"", begin);
		String str = allStr.substring(begin, end);
		return str;
	}
}
