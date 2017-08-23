package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.Account;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
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

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.util.ApplicationUtils;
import com.oojunzi.app.core.util.FileUpload;
import com.oojunzi.app.core.util.MathUtils;
import com.oojunzi.app.core.util.SmsUtils;
import com.oojunzi.app.web.annotation.ControllerLog;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;
import com.oojunzi.app.web.model.MoneyDiscount;
import com.oojunzi.app.web.model.SmsModel;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserPayExample;
import com.oojunzi.app.web.security.PermissionSign;
import com.oojunzi.app.web.security.RoleSign;
import com.oojunzi.app.web.service.CarInfoService;
import com.oojunzi.app.web.service.CircleInfoService;
import com.oojunzi.app.web.service.HelpInfoService;
import com.oojunzi.app.web.service.MoneyDiscountService;
import com.oojunzi.app.web.service.MyHelpService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserPayService;
import com.oojunzi.app.web.service.UserService;

import net.sf.json.JSONArray;

/**
 * 用户控制器
 * 
 * @author michael
 * @since 2016年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {

	@Resource
	private UserService userService;
	@Resource
	private UserPayService userPayService;
	@Resource
	private HelpInfoService helpInfoService;
	@Autowired
	private FileUpload fileUpload;
	@Resource
	private MoneyDiscountService moneyDiscountService;
	@Resource
	private CarInfoService carInfoService;

	/**
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
	 *                       String login(@Valid User user, BindingResult
	 *                       result, Model model, HttpServletRequest request) {
	 *                       try { Subject subject = SecurityUtils.getSubject();
	 *                       if (result.hasErrors()) {
	 *                       model.addAttribute("error", "参数错误！"); return
	 *                       "login"; }
	 * 
	 *                       } catch (AuthenticationException e) { // 身份验证失败
	 *                       model.addAttribute("error", "用户名或密码错误 ！"); return
	 *                       "login"; } return "main_login"; }
	 */

	/**
	 * 保存用户昵称
	 */
	@RequestMapping(value = "/savePetName")
	public String savePetName(Model model, HttpServletRequest request, @RequestParam("petName") String petName) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		if (petName.length() < 3) {
			model.addAttribute("error", "昵称过短！");
			return "nickname";
		} else if (petName.length() > 16) {
			model.addAttribute("error", "昵称过长！");
			return "nickname";
		}

		String regex = "^[a-zA-Z0-9\u4E00-\u9FA5]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(petName);
		boolean b = match.matches();
		if (!b) {
			model.addAttribute("error", "昵称不符合要求！");
			return "nickname";
		}

		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		System.out.println(fileUpload.getTomcatImagesPath());
		user.setPetName(petName);
		userService.update(user);
		return "user_info";
	}

	/**
	 * 跳转到修改用户昵称
	 */
	@RequestMapping(value = "/toNickname")
	public String toNickname(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		return "nickname";
	}

	/**
	 * 跳转到用户基本信息展示
	 */
	@RequestMapping(value = "/toUserInfo")
	public String toUserInfo(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		model.addAttribute("user", user);
		return "user_info";
	}

	/**
	 * 跳转到用户基本信息展示
	 */
	@RequestMapping(value = "/toBindtel")
	public String toBindtel(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		return "bind_tel";
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
		if (user != null) {
			map.put("error", "手机号已注册");
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
	 * 保存绑定手机
	 */
	@RequestMapping(value = "/saveTelphone")
	public String saveTelphone(Model model, HttpServletRequest request, @RequestParam("telphone") String telphone) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		user.setTelphone(telphone);
		user.setUsername(telphone);
		userService.update(user);
		model.addAttribute("user", user);
		return "bind_complete";
	}

	/**
	 * 返回值示例
	 * 
	 * @RequestMapping(value ="/userAll")
	 * @ResponseBody public String userAll(User user, Model
	 *               model,HttpServletRequest request) { UserExample example=
	 *               new UserExample(); List<User> userList =
	 *               userService.selectByExample(example);
	 * 
	 *               return JSON.toJSONString(userList);
	 * 
	 *               }
	 * 
	 */

	/**
	 * 用户上传图像
	 */
	@RequestMapping(value = "/uploadUserIco")
	public String uploadUserIco(Model model, HttpServletRequest request,
			@RequestParam("drivingLicenseVicePageFile") MultipartFile drivingLicenseVicePageFile) {

		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		fileUpload.setFileUploadPath("d:/fileupload/userIcon/");
		String userIco = fileUpload.uploadFile(drivingLicenseVicePageFile);
		if (userIco != null) {
			user.setUserIco(userIco);
		}
		userService.update(user);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		model.addAttribute("user", user);
		return "redirect:/rest/user/gotoMainDeal";
	}

	// add zhwh
	/*
	 * 修改密码 验证码 界面
	 */
	@RequestMapping(value = "/updatePassword")
	public String updatePassword(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		return "change_pass";

	}

	/*
	 * 修改密码 修改界面
	 */
	@RequestMapping(value = "/updatePassword2")
	public String updatePassword1() {
		return "change_pass2";
	}

	/*
	 * 修改密码
	 */
	@RequestMapping(value = "/changePassword")
	public String changePassword(Model model, @RequestParam("pass3") String pass3) {

			Subject currentUser = SecurityUtils.getSubject();
			Session session = currentUser.getSession();
			User user = (User) session.getAttribute("userInfo");
			user.setPassword(ApplicationUtils.sha256Hex(pass3));
			userService.update(user);
			return "login";
		
	}

	/*
	 * 跳转到互助币详情显示
	 */
	@RequestMapping(value = "/toMoneyInfo")
	public String toMoneyInfo(Model model,	@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		//在页面显示优惠活动
		List<MoneyDiscount> moneyDiscount = moneyDiscountService.selectBystate("0");
		model.addAttribute("moneyDiscount", moneyDiscount);
		List<MoneyDiscount> secmoneyDiscount = moneyDiscountService.selectBystate("1");
		model.addAttribute("secmoneyDiscount", secmoneyDiscount);
		return "money_info";

	}
	/*
	 * 操作记录
	 */
	@RequestMapping(value = "/operateManage")
	public String operateManage(Model model, String id, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		
		User user = userService.selectById(id);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
    	model.addAttribute("page", page);
    	model.addAttribute("user", user);
		return "user_operate";
		//return userPayList;
	}
	@RequestMapping(value = "/controlInfo")
	public String controlInfo(Model model, String id, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		
		User user = userService.selectById(id);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
    	model.addAttribute("page", page);
    	model.addAttribute("user", user);
		return "control_info";
		//return userPayList;
	}
	
	//车辆管理
	@RequestMapping("/carManage")
	public String userManage(Model model,String id,CarInfoExample carInfoExample, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize ) {
	  	Page<CarInfo> p = new Page<>(pageNo,pageSize);
	  	List<CarInfo>listCarInfo = carInfoService.selectByIdAndPage(carInfoExample,id,p);
	  	System.out.println(listCarInfo);
	  	model.addAttribute("list",listCarInfo);
	  	model.addAttribute("page",p);
	  	model.addAttribute("u", carInfoExample);
	  	model.addAttribute("id", id);
        return "carManage";
    }
	@RequestMapping("/delCarInfo")
	public String delCarInfo(Model model, @RequestParam(value = "ids[]") String[] ids, @RequestParam(value = "id") String id ) {
		System.out.println(Arrays.toString(ids));
		carInfoService.deleteCarInfo(ids);
        return "redirect:carManage?id="+id;
    }
	/*
	 * 求助记录
	 */
	@RequestMapping(value = "/helpManage")
	public String helpManage(Model model, String id,HelpInfoExample helpInfoExample, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Page<HelpInfo> page = new Page<>(pageNo,pageSize);
		
    	List<HelpInfo> helpInfoList = helpInfoService.selectByExampleAndPage(page,id, helpInfoExample);
    	
    	model.addAttribute("helpInfoList", helpInfoList);
    	model.addAttribute("page", page);
    	model.addAttribute("u", helpInfoExample);
    	model.addAttribute("id", id);
		return "user_help";
		//return userPayList;
	}
	/*
	 * 求助记录
	 */
	@RequestMapping(value = "/scoreManage")
	public String scoreManage(Model model, String id, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		
		User user = userService.selectById(id);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
    	model.addAttribute("page", page);
    	model.addAttribute("user", user);
		return "user_score";
		//return userPayList;
	}
	/*
	 * 支付记录
	 */
	@RequestMapping(value = "/showUserPay")
	public String showUserPay(Model model, String id,UserPayExample userPayExample, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		
		UserPayExample example = new UserPayExample();
		com.oojunzi.app.web.model.UserPayExample.Criteria criteria = example.createCriteria();
		criteria.andUserFidEqualTo(new BigDecimal(id));
		User user = userService.selectById(id);
		model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		if ( !(StringUtils.isEmpty(userPayExample.getMoneyName()) )) {
			criteria.andPayReasonEqualTo(userPayExample.getMoneyName());
		}
		if ( !(StringUtils.isEmpty(userPayExample.getMoneyType()) )) {
			criteria.andPayTypeEqualTo(userPayExample.getMoneyType());
		}
    	
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    		
    		
    	try {
    		
    		if(!(StringUtils.isEmpty(userPayExample.getBeginTime())) || !(StringUtils.isEmpty(userPayExample.getEndTime() ))  ){
    			criteria.andPayTimeBetween(sdf.parse(userPayExample.getBeginTime().trim()), sdf.parse(userPayExample.getEndTime().trim()));
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		List<UserPay> userPayList = userPayService.selectByExampleAndPage(page, example);
		model.addAttribute("userPayList", userPayList);
    	model.addAttribute("page", page);
    	model.addAttribute("u", userPayExample);
    	model.addAttribute("user", user);
		return "user_pay";
		//return userPayList;
	}
	@RequestMapping(value = "/showUserMoney")
	@ResponseBody
	public String showUserMoney(Model model,	@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		
		Page<UserPay> page = new Page<>(pageNo,pageSize);
		
		List<UserPay> userPayList = userPayService.selectPayByWeek(page,new BigDecimal(user.getId()));
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("list", userPayList);
		map.put("pageTotal", page.getTotalPages());
		JSONArray json_news = JSONArray.fromObject(map);
		return json_news.toString();
		//return userPayList;
	}
	
	/*
	 * 跳转到互助币详情显示
	 */


	@RequestMapping(value = "/toMoneyPay")
	public String toMoneyPay(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);
		//在页面显示优惠活动    1是首冲优惠    0是非首冲优惠
		List<MoneyDiscount> moneyDiscount = moneyDiscountService.selectBystate("0");
		model.addAttribute("moneyDiscount", moneyDiscount);
		List<MoneyDiscount> secmoneyDiscount = moneyDiscountService.selectBystate("1");
		model.addAttribute("secmoneyDiscount", secmoneyDiscount);

		return "money_pay";
	}
	/*
	 * 互助币充值
	 */
	@RequestMapping(value = "/AddMoney")
	public String AddMoney(Model model, @RequestParam("pay") String pay) {
		double give = 0;
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		double money = Double.valueOf(user.getParam1());
		double newPay;
		double base;
		UserPay userPay = new UserPay();
		List<MoneyDiscount> moneyDiscount = new ArrayList<MoneyDiscount>();
		//取充值次数
		int useCount = userPayService.selectByUserId(new BigDecimal(user.getId()));

		//判断首充
		if (useCount == 0 ) {
			//取首充优惠
			moneyDiscount = moneyDiscountService.selectBystate("1");
			//没有对应优惠，取非首充对应优惠
			if(	moneyDiscount == null){
				moneyDiscount = moneyDiscountService.selectBystate("0");
			}
		}else{
			moneyDiscount = moneyDiscountService.selectBystate("0");
		}

		int len = moneyDiscount.size();
		MoneyDiscount maxMoney = (MoneyDiscount) moneyDiscount.get(len - 1);

		// 如果可叠加
		if (maxMoney.getParam1().equals("1")) {
			MoneyDiscount minMoney = (MoneyDiscount) moneyDiscount.get(0);
			double min = Double.valueOf(minMoney.getBaseMoney().toString());
			double mingive = Double.valueOf(minMoney.getGiveMoney().toString());
			int times = Integer.parseInt(pay) / (int) min;
			give = times * mingive; // 计算总赠送

		} else {
			// 如果不可叠加
			double mm = Double.valueOf(pay);
			base = Double.valueOf(moneyDiscount.get(len - 1).getBaseMoney().toString());
			if (mm >= base) {
				give = Double.valueOf(moneyDiscount.get(len - 1).getGiveMoney().toString());
			} else {
				int i = 0;
				for (; i < moneyDiscount.size(); i++) {
					base = Double.valueOf(moneyDiscount.get(i).getBaseMoney().toString());
					if (base > mm) {
						give = i == 0 ? 0 : Double.valueOf(moneyDiscount.get(i - 1).getGiveMoney().toString());
						break;
					} else if (base == mm) {
						give = Double.valueOf(moneyDiscount.get(i).getGiveMoney().toString());
						break;
					}
				}
			}
		}

		//修改用户表用户余额
		newPay = money + Double.valueOf(pay) + give;
		user.setParam1(newPay + "");
		userService.update(user);
		//插入充值记录
		userPay.setPayTime(new Date());
		userPay.setParam1("充值");
		userPay.setPayReason("5");
		userPay.setPay(new BigDecimal(pay + ""));
		userPay.setUserFid(new BigDecimal(user.getId()));
		userPayService.insertUserPay(userPay);
		//插入赠送记录
		if(give !=0 ){
			userPay.setPayTime(new Date());
			userPay.setParam1("赠送");
			userPay.setPayReason("6");
			userPay.setPay(new BigDecimal(give + ""));
			userPay.setUserFid(new BigDecimal(user.getId()));
			userPayService.insertUserPay(userPay);
		}

		return "redirect:/rest/user/gotoMainDeal";
	}
}
