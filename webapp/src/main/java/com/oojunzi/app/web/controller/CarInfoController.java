package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.aliyun.api.gateway.demo.util.CommonUtil;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.util.DateUtil;
import com.oojunzi.app.core.util.FileUpload;
import com.oojunzi.app.web.dao.CarMaxFormulaMapper;
import com.oojunzi.app.web.dao.SequencesMapper;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;
import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.CircleUser;
import com.oojunzi.app.web.model.CircleUserExample;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.service.CarInfoService;
import com.oojunzi.app.web.service.CircleInfoService;
import com.oojunzi.app.web.service.CircleUserService;
import com.oojunzi.app.web.service.HelpInfoService;
import com.oojunzi.app.web.service.HelpPartakeService;
import com.oojunzi.app.web.service.MyHelpService;
import com.oojunzi.app.web.service.NewHelpService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserPayService;
import com.oojunzi.app.web.service.UserService;
import com.oojunzi.app.web.service.UserTimerecodeService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.oojunzi.app.core.util.HttpUtils;
import com.oojunzi.app.core.util.MathUtils;

@Controller
@RequestMapping("/carInfo")
public class CarInfoController {

	@Autowired
	private CarInfoService carInfoService;
	@Autowired
	private FileUpload fileUpload;
	@Autowired
	private SequencesMapper sequencesMapper;
	@Autowired
	private HelpInfoService helpInfoService;
	@Autowired
	private CircleUserService circleUserService;
	@Autowired
	private CircleInfoService circleInfoService;
	@Autowired
	private MyHelpService myHelpService;
	@Autowired
	private NewHelpService newHelpService;
	@Autowired
	private HelpPartakeService helpPartakeService;
	@Resource
	private UserTimerecodeService userTimerecodeService;
	@Autowired
	private CarMaxFormulaMapper carMaxFormulaMapper;
	@Resource
	private UserAddService userAddService;
	@Resource
	private UserService userService;
	@Resource
	private UserPayService userPayService;

	@RequestMapping("/addCar")
	public String addCar() {
		return "add_car";
	}

	@RequestMapping("/help")
	public String help(Model model, @Valid String carInfoId) {
		model.addAttribute("carInfoId", carInfoId);
		return "help";
	}

	// @RequestMapping("/mainDeal")
	@RequestMapping("/mainLogin")
	public ModelAndView mainDeal() {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		CarInfoExample example = new CarInfoExample();
		BigDecimal id = new BigDecimal(user.getId());
		example.createCriteria().andUserIdEqualTo(id);
		List<CarInfo> carInfoList = carInfoService.selectByExample(example);
		CircleUserExample circleUserExample = new CircleUserExample();
		circleUserExample.createCriteria().andUserFidEqualTo(new BigDecimal(user.getId()));
		List<CircleUser> circleUserList = circleUserService.selectByExample(circleUserExample);
		List<CircleInfo> circleInfoList = new ArrayList<>();
		for (CircleUser circleUser : circleUserList) {
			BigDecimal circleFid = circleUser.getCircleFid();
			CircleInfo circleInfo = circleInfoService.selectByPrimaryKey(circleFid);
			circleInfoList.add(circleInfo);
		}
		// add yuhb 0712
		// 取圈内所有用户信息
		List<User> userList = new ArrayList<User>();
		userList = userAddService.selectUsersByCircle(user.getId());

		/**
		 * add LGQ
		 * 
		 */
		List<Map<String, Object>> carInfoLists = carInfoService.selectCarInfoAndTimeByUserId(user.getId());
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
			if (map.get("Param1") != null) {
				// Date beginDate = (Date) map.get("Param1");
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

				Date beginDate;
				try {
					beginDate = fmt.parse(map.get("Param1").toString());

					Date endDate = new Date();
					long day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
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
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main_login");
		mv.addObject("carInfo", carInfoLists);
		mv.addObject("carInfoList", carInfoList);
		mv.addObject("circleInfoList", circleInfoList);
		mv.addObject("userList", userList);
		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		return mv;
	}

	@RequestMapping("/mainJoin")
	public String mainJoin() {
		return "main_join";
	}

	@RequestMapping("/mainMakedeal")
	public String mainMakedeal(Model model, @Valid String carId) {
		CarInfo carInfo = carInfoService.selectByPrimaryKey(new BigDecimal(carId));
		model.addAttribute("carInfo", carInfo);
		model.addAttribute("carId", carId);

		String str = carInfo.getVin().substring(0, 1);
		System.out.println(str);
		double countChargeMax = countChargeMax(Double.parseDouble(carInfo.getCarPrice().toString()) * 10000, str);
		model.addAttribute("countChargeMax", countChargeMax);
		double jiesheng = countChargeMax - Double.parseDouble(carInfo.getPartakeMax().toString());
		model.addAttribute("jiesheng", jiesheng);
		model.addAttribute("partakeMax", carInfo.getPartakeMax());
		// 在签互助协议页面显示默认日期
		model.addAttribute("defaultTime", DefaultTime(carInfo.getRegisterDate()));

		return "main_makedeal";
	}

	public Date DefaultTime(Date registerDate) {
		// 在签互助协议页面显示默认日期
		int regMonth = registerDate.getMonth() + 1;
		int regDate = registerDate.getDate();
		String strDefaultTime = null;
		Calendar a = Calendar.getInstance();
		int nowYear = a.get(Calendar.YEAR);
		int nowMonth = a.get(Calendar.MONTH) + 1;
		int nowDate = a.get(Calendar.DATE);

		if (regMonth > nowMonth) {
			strDefaultTime = nowYear + "-" + regMonth + "-" + regDate;
		} else if (regMonth == nowMonth) {
			if (regDate >= nowDate) {
				strDefaultTime = nowYear + "-" + regMonth + "-" + regDate;
			} else {
				strDefaultTime = (nowYear + 1) + "-" + regMonth + "-" + regDate;
			}
		} else if (regMonth < nowMonth) {
			strDefaultTime = (nowYear + 1) + "-" + regMonth + "-" + regDate;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date defaultTime = new Date();
		try {
			defaultTime = sdf.parse(strDefaultTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultTime;

	}

	@RequestMapping("/mainPay")
	public String mainPay() {
		return "main_pay";
	}

	@RequestMapping("/mainPay2")
	public String mainPay2() {
		return "main_pay2";
	}

	@RequestMapping(value = "/myPayInfo")
	public ModelAndView myPayInfo(@Valid String titleId, Model model) {
		ModelAndView mv = new ModelAndView();
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		// add yuhb 总账单
		HelpBill helpBill = newHelpService.selectBillByTitleId(titleId);
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", user.getId() + "");
		map.put("titleId", titleId);
		// add yuhb 该用户账单
		HelpPartake helpPartake = newHelpService.selectPartakeBytitleId(map);
		model.addAttribute("status", helpPartake.getStatus());
		String[] helpIds = helpBill.getParam10().split(",");
		List<HelpInfo> helpInfoList = new ArrayList<HelpInfo>();
		for (String helpId : helpIds) {
			HelpInfo helpInfo = new HelpInfo();
			helpInfo = newHelpService.selectHelpInfoByHelpId(helpId);
			Map<String, String> map1 = new HashMap<String, String>();
			map1.put("userId", user.getId() + "");
			map1.put("titleId", titleId);
			map1.put("helpId", helpId);
			List<CarInfo> carInfoList = carInfoService.selectPartakeList(map1);
			helpInfo.setCarInfo(carInfoList);
			helpInfoList.add(helpInfo);
		}

		mv.addObject("helpBill", helpBill);
		mv.addObject("helpPartake", helpPartake);
		mv.addObject("helpInfoList", helpInfoList);
		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		mv.setViewName("my_pay_info");
		return mv;
	}

	@RequestMapping("/upload")
	public String upload() {
		return "upload";
	}

	@RequestMapping("/test")
	public String test(String name, String stock, String ship, String note) {
		System.out.println("+++++++++++++++++: " + name);
		System.out.println("+++++++++++++++++: " + stock);
		System.out.println("+++++++++++++++++: " + ship);
		System.out.println("+++++++++++++++++: " + note);
		return "true";
	}

	/**
	 * 插入
	 * 
	 */
	@RequestMapping("/insert")
	public String insert() {
		// HelpInfo helpInfo = new HelpInfo();
		// helpInfo.setHelpId(new BigDecimal("258"));
		// helpInfo.setArea1("1");
		// helpInfo.setArea2("2");
		// helpInfo.setArea3("3");
		// helpInfo.setHappenPosition("1234");
		// helpInfo.setHelpTime(new Date());
		// helpInfo.setHappenTime(new Date());
		// System.out.println(new Date());
		// helpInfo.setRemark("车损");
		// helpInfo.setFactCost(new BigDecimal("300"));
		// helpInfo.setHavePay(new BigDecimal("13"));
		// helpInfoService.insertSelective(helpInfo);
		// HelpSpot helpSpot = new HelpSpot();
		// helpSpot.setSpotId(new BigDecimal("159"));
		// helpSpot.setHelpFid(new BigDecimal("123"));
		// helpSpot.setSpotId(new BigDecimal("154"));
		// helpSpot.setHelpFid(new BigDecimal("456"));

		return "rest/user/userManage";
	}

	@RequestMapping("/showMyPay")
	@ResponseBody
	public String showMyPay(Model model, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		model.addAttribute("user", user);

		Page<HelpBill> page = new Page<>(pageNo, pageSize);
		List<HelpBill> helpBillList = newHelpService.selectBillByUserId(page, user.getId());
		List<HelpPartake> HelpPartakeList = newHelpService.selectPartakeByUserId(user.getId());
		for (HelpBill helpBill : helpBillList) {
			for (HelpPartake helpPartake : HelpPartakeList) {
				if (helpBill.getTitleid().toString().equals(helpPartake.getParam1())) {
					helpBill.setParam10(helpPartake.getStatus());
					DecimalFormat df = new DecimalFormat("#0.00");
					helpBill.setParam9(df.format(helpPartake.getFactPay()));
				}
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", helpBillList);
		map.put("pageTotal", page.getTotalPages());
		JSONArray json_news = JSONArray.fromObject(map);
		return json_news.toString();

	}
	/**
	 * 查询
	 */
	@RequestMapping("/myPay")
	public ModelAndView myPay(Model model) {
		ModelAndView mv = new ModelAndView();
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		// add LGQ 显示my_pay两页效果
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "我的求助");
		map1.put("id", "1");
		map1.put("title", "my-help");
		Map<String, String> map2 = new HashMap<>();
		map2.put("name", "互助账单");
		map2.put("id", "2");
		map2.put("title", "my-pay");
		List<Map<String, String>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);
		mv.addObject("list", list);
//		List<HelpBill>  help=newHelpService.selectStatusByUserID(user.getId());
//		model.addAttribute("status", help.get(0));
		int count = carInfoService.countCarByUserId(user.getId());
		List<HelpInfo> helpInfoList = myHelpService.selectByExample(user.getId());

		// add yuhb 我的求助
		List<HelpInfo> helpNewList = newHelpService.selectHelpInfoByUserId(user.getId());

		List<Map<String, Object>> carInfoLists = carInfoService.selectCarInfoAndTimeByUserId(user.getId());
		Double totalFactPay = (double) 0;
		Double totalPaxtakeMax = (double) 0;
		Double jiesheng = (double) 0;
		for (Map<String, Object> map : carInfoLists) {
			Object carId = map.get("ID");
			String money = myHelpService.selectSumPayByCarId(Long.parseLong(carId.toString()));
			if (money == null) {
				money = "0";
			}
			totalFactPay += Double.parseDouble(money);
			if (map.get("PARAM1") != null) {
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				Date beginDate;
				try {
					beginDate = fmt.parse(map.get("PARAM1").toString());
					Date endDate = new Date();
					long day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
					if (map.get("PARTAKE_MAX") != null) {
						Object shangxian = map.get("PARTAKE_MAX");
						// 上限/365*加入的天数-花掉的
						if (day >= 0) {
							double a = Double.parseDouble(shangxian.toString()) / 365;
							double b = a * day;
							double c = Double.parseDouble(money);
							double e = b - c;
							jiesheng += e;
						}
						totalPaxtakeMax += Double.parseDouble(shangxian.toString());
						DecimalFormat df = new DecimalFormat("#0.00");
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		DecimalFormat df = new DecimalFormat("#0.00");
		mv.addObject("totalFactPay", df.format(totalFactPay));
		mv.addObject("jiesheng", df.format(jiesheng));
		mv.addObject("totalPaxtakeMax", df.format(totalPaxtakeMax));

		mv.addObject("userId", user.getId());
		mv.addObject("count", count);
		mv.addObject("helpInfoList", helpNewList); // change yuhb

		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		// mv.addObject("helpPartakes", helpPartakes);
		mv.setViewName("my_pay");
		return mv;
	}

	// 计算车辆现在市价
	public double countCarPrice(double price, Date buyDate) {
		long a = buyDate.getTime();
		long b = (new Date()).getTime();
		long c = b - a;
		long month = c / (24 * 60 * 60 * 1000) / 30 + 1;
		// 大于72个月，折旧按72个月计算。
		month = month > 72 ? 72 : month;

		// 折旧价=（1-使用月数（不满一个月按一个月计算）*0.006）*市场价
		double now_price = (1 - month * 0.006) * price;

		return (now_price);
	}

	// 计算车辆分摊上限
	public double countPartakeMax(double now_price, double price, Date buyDate) {
		// 计算分摊系数
		BigDecimal formula = carMaxFormulaMapper.selectFormulaByPrice(new BigDecimal(price));

		return (now_price * formula.doubleValue());
	}

	/**
	 * 求助记录
	 * 
	 */
	@RequestMapping("/insertHelpInfo")
	public String insertHelpInfo(@RequestParam("carInfoId") String carInfoId, Model model) {
		HelpInfo helpInfo = new HelpInfo();
		helpInfo.setHelpId(new BigDecimal(helpInfoService.selectHelpInfoId()));
		helpInfo.setStatus("1");   //发起求助状态是1
		// helpInfo.setHappenTime();
		helpInfo.setHelpTime(DateUtil.getTime());
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		helpInfo.setCarFid(new BigDecimal(carInfoId));  
		helpInfo.setParam1(user.getId().toString()); // Param1代表用户ID
		int a = helpInfoService.insertSelective(helpInfo);
		if (a == 0) {
			model.addAttribute("error", "求救失败，请电话联系客服");
			return "help";
		}

		// user表中的helpcount+1
		int n = Integer.parseInt(user.getHelpCount().toString());
		// BigDecimal no1 = user.getHelpCount();
		BigDecimal no2 = new BigDecimal(n + 1);   //每求助一次在t_system_user 表中将次数加1
		user.setHelpCount(no2);
		userService.update(user);

		return "redirect:/rest/user/gotoMainDeal";

	}

	/**
	 * 扫描行驶证
	 * 
	 */
	@RequestMapping("/scanCard")
	public String scanCard(@RequestParam("drivingLicenseVicePageFile") MultipartFile drivingLicenseVicePageFile,
			Model model, HttpServletRequest request) {
		fileUpload.setFileUploadPath("d:/fileupload/drivingLicense/");
		String drivingLicenseVicePage = fileUpload.uploadFile(drivingLicenseVicePageFile);
		String imgPath = fileUpload.getFileUploadPath() + drivingLicenseVicePage;
		CommonUtil commonUtil = new CommonUtil(HOST, URL, APP_KEY, APP_SECRET, CUSTOM_HEADERS_TO_SIGN_PREFIX, imgPath);
		CarInfo carInfo = new CarInfo();
		try {
			String aa = commonUtil.sendPostRequestWithBody();
			int begin = aa.indexOf("dataValue");
			int end = aa.indexOf("}}]}");
			String bb = aa.substring(begin + 13, end - 1);

			String plate_num = mySubString("plate_num", bb);
			String vin = mySubString("vin", bb);
			List<String> plist = new ArrayList<String>();
			if (plate_num.length() == 0) {
				for (int i = 0; i < 7; i++) {
					plist.add("");
				}

			} else {
				for (int i = 0; i < plate_num.length(); i++) {
					plist.add(plate_num.substring(i, i + 1));
				}
			}
			model.addAttribute("plate_num", plist);
			List<String> vlist = new ArrayList<String>();
			if (vin.length() == 0) {
				for (int i = 0; i < 17; i++) {
					vlist.add("");
				}
			} else {
				for (int i = 0; i < vin.length(); i++) {
					vlist.add(vin.substring(i, i + 1));
				}
			}
			model.addAttribute("vin", vlist);

			String registerDateStr = myFormitDate(mySubString("register_date", bb));
			String certificateDateStr = myFormitDate(mySubString("issue_date", bb));
			carInfo.setPlateNumber(plate_num);// 车牌号
			carInfo.setBrandModel(mySubString("model", bb));// 品牌型号
			carInfo.setOwner(mySubString("owner", bb));// 所有人
			carInfo.setVin(vin);// 车辆识别码 vin
			carInfo.setEngineType(mySubString("engine_num", bb));// 发动机型号

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			carInfo.setRegisterDate(sdf.parse(registerDateStr));
			carInfo.setCertificateDate(sdf.parse(certificateDateStr));
			carInfo.setDrivingLicenseHomepage(drivingLicenseVicePage);
			model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
			model.addAttribute("carInfo", carInfo);
			model.addAttribute("first", "1");

			// System.out.println(plate_num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("first", "0");
		}
		return "upload";

	}

	// 添加爱车
	@RequestMapping("/insertCarInfo")
	public String insertCarInfo(CarInfo carInfo, Model model, HttpServletRequest request) throws ParseException {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		// 验证添加车牌的唯一性
		CarInfo car = carInfoService.selectPlateNumber(carInfo.getPlateNumber());
		if (car == null) {
			// 扫描vin获取车辆信息，成功返回json串(转小写后)，失败返回失败原因
			String jsonStr = scanVin(carInfo.getVin());
			if (jsonStr.length() < 100) {
				model.addAttribute("first", "0");
				model.addAttribute("errorInfo", "添加爱车失败：Vin" + jsonStr);
				return "upload";
			}

			// 将扫描vin返回的json串转为carInfo
			JSONObject jsonBean = JSONObject.fromObject(jsonStr);
			CarInfo carByVin = (CarInfo) JSONObject.toBean(jsonBean, CarInfo.class);
			carByVin.setFdjxh(carByVin.getFdjxh().toUpperCase());
			carByVin.setVin(carByVin.getVin().toUpperCase());

			String buyPrice = carByVin.getZdjg();
			long carId = sequencesMapper.selectSeqCarInfo();
			model.addAttribute("carId", carId);
			carByVin.setId(new BigDecimal(carId));

			Date date = carInfo.getRegisterDate();// fmt.parse(registerDate);
			double carPrice = countCarPrice(Double.parseDouble(buyPrice) * 10000, date);
			double partakeMax = this.countPartakeMax(carPrice, Double.parseDouble(buyPrice) * 10000, date);
			carByVin.setCarPrice(new BigDecimal((int) carPrice / 10000.0));
			carByVin.setPartakeMax(new BigDecimal((int) partakeMax));
			carByVin.setRegisterDate(carInfo.getRegisterDate());
			carByVin.setCertificateDate(carInfo.getCertificateDate());
			carByVin.setCreateTime(new Date());
			carByVin.setUserId(new BigDecimal(user.getId()));
			carByVin.setDrivingLicenseHomepage(carInfo.getDrivingLicenseHomepage());
			carByVin.setPlateNumber(carInfo.getPlateNumber());
			carByVin.setBrandModel(carInfo.getBrandModel());
			carByVin.setOwner(carInfo.getOwner());
			carByVin.setEngineType(carInfo.getEngineType());
			carByVin.setStatus("1");

			int isInsert = carInfoService.insertCarInfo(carByVin);
			if (isInsert == 0) {
				model.addAttribute("first", "0");
				model.addAttribute("errorInfo", "添加爱车失败：爱车信息插入数据库失败。请您稍后重试或联系管理员。");
				return "upload";
			}

			// add zhwh  添加爱车 将 system_user 中状态改为3
        
			user.setState("3");    
			userService.update(user);
             //向日志表中插入记录
			UserTimerecode userTimerecode = new UserTimerecode();
			userTimerecode.setHappenType("3");
			userTimerecode.setHappenTime(new Date());
			long trecodeId = userTimerecodeService.selectUserTimerecode();
			userTimerecode.setTrecodeId(new BigDecimal(trecodeId));
			userTimerecode.setParam1(carId + "");// param1 表示的是carId
			userTimerecode.setUserFid(new BigDecimal(user.getId()));
			userTimerecodeService.insertUser(userTimerecode);

			// add LGQ
			carInfo.setId(new BigDecimal(carId));
			model.addAttribute("carInfo", carInfo);
			String str = carInfo.getVin().substring(0, 1);
			double countChargeMax = countChargeMax(carPrice, str);
			model.addAttribute("countChargeMax", countChargeMax);
			model.addAttribute("partakeMax", (int) partakeMax);
			double jiesheng = countChargeMax - (int) partakeMax;
			model.addAttribute("jiesheng", MathUtils.round(jiesheng, 2));

			// 在签互助协议页面显示默认日期
			model.addAttribute("defaultTime", DefaultTime(carInfo.getRegisterDate()));
			return "main_makedeal";
		}

		carInfo = new CarInfo();
		carInfo.setRegisterDate(new Date());
		carInfo.setCertificateDate(new Date());
		model.addAttribute("first", "0");
		model.addAttribute("carInfo", carInfo);
		List<String> plist = new ArrayList<String>();
		for (int i = 0; i < 7; i++) {
			plist.add("");
		}
		model.addAttribute("plate_num", plist);
		List<String> vlist = new ArrayList<String>();
		for (int i = 0; i < 17; i++) {
			vlist.add("");
		}
		model.addAttribute("vin", vlist);

		model.addAttribute("errorInfo", "添加爱车失败：该车牌号已经加入互助计划。");

		return "upload";
	}

	// APP KEY
	private final static String APP_KEY = "24552365";
	// APP密钥
	private final static String APP_SECRET = "967776259d5b96752eb94cb14bae7a4b";
	// API域名
	private final static String HOST = "dm-53.data.aliyun.com";
	// url
	private final static String URL = "/rest/160601/ocr/ocr_vehicle.json";
	// 自定义参与签名Header前缀（可选,默认只有"X-Ca-"开头的参与到Header签名）
	private final static List<String> CUSTOM_HEADERS_TO_SIGN_PREFIX = new ArrayList<String>();

	static {
		CUSTOM_HEADERS_TO_SIGN_PREFIX.add("Custom");
	}

	// 以下为根据vin号获取车辆信息用
	private final static String host_vin = "http://vinservice.market.alicloudapi.com";
	private final static String path_vin = "/efficient/vinservice";
	private final static String method_vin = "POST";
	private final static String appcode_vin = "175a13e860c34589827302e86f9c42d6";

	public Map<String, String> toMap(Object object) {
		Map<String, String> data = new HashMap<String, String>();
		// 将json字符串转换成jsonObject
		JSONObject jsonObject = JSONObject.fromObject(object);
		Iterator ite = jsonObject.keys();
		// 遍历jsonObject数据,添加到Map对象
		while (ite.hasNext()) {
			String key = ite.next().toString();
			String value = jsonObject.get(key).toString();
			data.put(key, value);
		}
		// 或者直接将 jsonObject赋值给Map
		// data = jsonObject;
		return data;
	}

	public String mySubString(String sunStr, String allStr) {
		int bbegin = allStr.indexOf(sunStr);
		int begin = allStr.indexOf(":\\\"", bbegin) + 3;
		int end = allStr.indexOf("\\\"", begin);
		String str = allStr.substring(begin, end);
		return str;
	}

	// 更新日期处理方法
	public String myFormitDate(String oldDate) {
		StringBuffer ss = new StringBuffer();
		if (oldDate.length() == 6) {
			ss.append(oldDate.substring(0, 4)).append("-0").append(oldDate.substring(4, 5)).append("-0")
					.append(oldDate.substring(5, 6));
		} else {
			ss.append(oldDate.substring(0, 4)).append("-").append(oldDate.substring(4, 6)).append("-")
					.append(oldDate.substring(6, 8));
		}
		return ss.toString();
	}

	public String scanVin(String vinStr) {
		Map<String, String> headers = new HashMap<String, String>();
		// 最后在header中的格式(中间是英文空格)为Authorization:APPCODE
		// 83359fd73fe94948385f570e3c139105
		headers.put("Authorization", "APPCODE " + appcode_vin);
		Map<String, String> querys = new HashMap<String, String>();
		querys.put("vin", vinStr);
		Map<String, String> bodys = new HashMap<String, String>();
		CarInfo car = new CarInfo();

		try {
			/**
			 * 重要提示如下: HttpUtils请从
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
			 * 下载
			 *
			 * 相应的依赖请参照
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
			 */
			HttpResponse response = HttpUtils.doPost(host_vin, path_vin, method_vin, headers, querys, bodys);
			// System.out.println(response.toString());
			// 获取response的body
			String jsonStr = EntityUtils.toString(response.getEntity());
			int begin = jsonStr.indexOf("reason") + 9;
			int end = jsonStr.indexOf("\"", begin);
			String isSuccess = jsonStr.substring(begin, end);
			if (!"成功".equals(isSuccess)) {
				return isSuccess;
			}

			begin = jsonStr.indexOf("result") + 8;
			end = jsonStr.indexOf("}}", begin) + 1;
			jsonStr = jsonStr.substring(begin, end);
			jsonStr = jsonStr.replaceAll("null", "\"\"").toLowerCase();
			return jsonStr;

		} catch (Exception e) {
			e.printStackTrace();
			return "扫描vin过程中出现异常。";
		}
	}

	public CarInfo setCarInfo(String vinStr) throws Exception {
		Map<String, String> headers = new HashMap<String, String>();
		// 最后在header中的格式(中间是英文空格)为Authorization:APPCODE
		// 83359fd73fe94948385f570e3c139105
		headers.put("Authorization", "APPCODE " + appcode_vin);
		Map<String, String> querys = new HashMap<String, String>();
		querys.put("vin", vinStr);
		Map<String, String> bodys = new HashMap<String, String>();
		CarInfo car = new CarInfo();

		try {
			/**
			 * 重要提示如下: HttpUtils请从
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
			 * 下载
			 *
			 * 相应的依赖请参照
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
			 */
			HttpResponse response = HttpUtils.doPost(host_vin, path_vin, method_vin, headers, querys, bodys);
			// System.out.println(response.toString());
			// 获取response的body
			String jsonStr = EntityUtils.toString(response.getEntity());
			int begin = jsonStr.indexOf("reason") + 9;
			int end = jsonStr.indexOf("\"", begin);
			String isSuccess = jsonStr.substring(begin, end);
			if (!"成功".equals(isSuccess)) {
				throw new Exception("扫描vin失败");
			}

			begin = jsonStr.indexOf("result") + 8;
			end = jsonStr.indexOf("}}", begin) + 1;
			jsonStr = jsonStr.substring(begin, end);
			jsonStr = jsonStr.replaceAll("null", "\"\"").toLowerCase();
			JSONObject jsonBean = JSONObject.fromObject(jsonStr);
			car = (CarInfo) JSONObject.toBean(jsonBean, CarInfo.class);
			car.setFdjxh(car.getFdjxh().toUpperCase());
			car.setVin(car.getVin().toUpperCase());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return car;
	}

	/**
	 * 按标准收费计算最高上限
	 */
	public double countChargeMax(double carPrice, String isL) {
		// 车损险
		// 现存车辆价值× 1.41%+594
		double a = carPrice * 0.0141 + 594;
		// 车损不计免赔
		// 车损险保费×15%
		double b = a * 0.15;
		// 全车盗抢险
		// 现存车辆价值× 0.49%+120
		double c = carPrice * 0.0049 + 120;
		// 全车盗抢险不计免赔
		// 全车盗抢保费× 20%
		double d = c * 0.2;
		// 自燃损失险
		// 现存车辆价值×0.2%
		double e = carPrice * 0.002;
		// 自燃损失险 不计免赔
		// 自燃损失保费× 20%
		double f = e * 0.2;
		// 涉水损失险
		// 车损险保费×5%
		double g = a * 0.05;
		// 涉水损失险 不计免赔
		// 涉水险保费× 15%
		double h = g * 0.15;
		// 玻璃破损险
		// 现存车辆价值×0.31%【进口】
		// 现存车辆价值×0.19%【国产】
		// L代表中国
		double i = 0;
		if (isL.equals("L")) {
			i = carPrice * 0.0019;
		} else {
			i = carPrice * 0.0031;
		}
		double j = a + b + c + d + e + f + g + h + i;

		return MathUtils.round(j, 2);
	}

	/**
	 * 根据用户id查询车辆
	 * 
	 * @author michael
	 * 
	 */
	@RequestMapping(value = "/getCarsFromUser")
	@ResponseBody
	public String getCarsByUserId(@RequestParam("id") String id) {

		/*
		 * Subject currentUser = SecurityUtils.getSubject(); Session session =
		 * currentUser.getSession(); User user = (User)
		 * session.getAttribute("user");
		 */
		CarInfoExample example = new CarInfoExample();
		// BigDecimal id = new BigDecimal(user.getId());
		example.createCriteria().andUserIdEqualTo(new BigDecimal(id));
		List<CarInfo> carInfoList = carInfoService.selectByExample(example);

		return JSON.toJSONString(carInfoList);
	}
//黔币支付
	@RequestMapping("/helpPay")
	public String helpPay(@RequestParam("money") String money, Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		String save = user.getParam1(); //余额
		String mone = money;  //需要支付的钱数
		double a = Double.parseDouble(mone);
		double b = Double.parseDouble(save);
		if (b > a) {
			user.setParam1(b - a + "");   //更改余额
			userService.update(user);
			UserPay userPay = new UserPay();
			userPay.setPayTime(new Date());   //支付表中插入数据
			userPay.setParam1("分摊"); 
			userPay.setPayReason("2");
			userPay.setPay(new BigDecimal(a + ""));
			userPay.setUserFid(new BigDecimal(user.getId()));
			userPayService.insertUserPay(userPay);
			helpPartakeService.updateByUserId(user.getId());//将状态改为1

		} else {
			model.addAttribute("error", "余额不足，请充值");
			return "rest/user/gotoMainDeal";

		}

		return "redirect:/rest/carInfo/myPay";
	}
}
