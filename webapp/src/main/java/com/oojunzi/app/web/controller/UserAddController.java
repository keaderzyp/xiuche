package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.management.BadBinaryOpValueExpException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.groups.Default;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oojunzi.app.core.util.ApplicationUtils;
import com.oojunzi.app.web.dao.UserTimerecodeMapper;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.OrderInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserInfo;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.service.CarInfoService;
import com.oojunzi.app.web.service.OrderInfoService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserPayService;
import com.oojunzi.app.web.service.UserService;
import com.oojunzi.app.web.service.UserTimerecodeService;

/**
 * 用户状态控制器
 * 
 * @author yuhb
 * @since 2017年7月4日
 **/
@Controller
@RequestMapping(value = "/userAdd")
public class UserAddController {

	@Resource
	private UserAddService userAddService;
	@Resource
	private UserTimerecodeService userTimerecodeService;
	@Resource
	private UserService userService;
	@Resource
	private OrderInfoService orderInfoService;
	@Resource
	private UserPayService userPayService;
	@Resource
	private CarInfoService carInfoService;

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/register_done")
	public String register(Model model, User user, HttpServletRequest request,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam(value = "code2",defaultValue = "1") String code2,@RequestParam(value = "code",defaultValue = "1") String code) {
		// User user = new User();
		long id=userService.selectUserId();
		user.setUsername(username);
		// 验证用户名是否存在     验证码是否正确
		if (userService.selectByUsername(username) == null&&code.equals(code2)) {
			
			user.setId(id);
			user.setState("1");
			user.setCreateTime(new Date());
			user.setUsername(username);
			user.setPassword(ApplicationUtils.sha256Hex(password));
			user.setHelpCount(new BigDecimal("0"));
			user.setHasCircle("0");
			user.setParam1("0");
			user.setPetName(username);
			user.setUserIco("UserPicture.png");
		int a=	userAddService.insertUser(user);
		
		if(a==0){
			model.addAttribute("Syserror", "注册失败，请稍后重试！");
			return "register";
			}
		} else {
			model.addAttribute("error", "该用户已经存在 或验证码错误，请重试！");
			return "register";
		}
		/*
		 * 向 usertimerecode中插入数据
		 * 
		 */

		// 根据用户名查user
//		User u = userService.selectByUsername(user.getUsername());

		UserTimerecode usertimerecode = new UserTimerecode();
		long trecodeId = userTimerecodeService.selectUserTimerecode(); 
		usertimerecode.setTrecodeId(new BigDecimal(trecodeId));
		usertimerecode.setUserFid(new BigDecimal(id));
		usertimerecode.setHappenTime(new Date());
		usertimerecode.setHappenType("1");
		usertimerecode.setUserType("1");

		userTimerecodeService.insertUser(usertimerecode);

		// 存放用户登录信息
		Subject subject = SecurityUtils.getSubject();
		// 身份验证
		subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
		// 验证成功在Session中保存用户信息
		final User authUserInfo = userService.selectByUsername(user.getUsername());
		request.getSession().setAttribute("userInfo", authUserInfo);

		return "register_done1";
	}

	/*
	 * 
	 * 入会支付1元  的后台处理
	 */
	@RequestMapping(value = "/add_car")
	public String add_car(Model model, User user, HttpServletRequest request) {
		OrderInfo orderInfo = new OrderInfo();
		// User u = userService.selectByUsername(user.getUsername());
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user1 = (User) session.getAttribute("userInfo");
		// User user2=(User) request.getSession().getAttribute("user");
		// System.out.println(user.getId());
		orderInfo.setBuyUserFid(new BigDecimal(user1.getId()));
		orderInfo.setOrderType("1");
		orderInfo.setBuyType("1");
		orderInfo.setCreateTime(new Date());
		orderInfo.setUpdateTime(new Date());
		long orderId = orderInfoService.selectId(); // 从xml中查出一个id
		orderInfo.setOrderId(new BigDecimal(orderId));
		orderInfoService.insertOrderInfo(orderInfo);
		//支付记录表，日志表插入数据
		UserPay userPay = new UserPay();
		userPay.setPayReason("1");
		userPay.setPayTime(new Date());
		userPay.setPayType("1");
		userPay.setPay(new BigDecimal(1));
		userPay.setHelpFid(new BigDecimal(orderId));
		userPay.setUserFid(new BigDecimal(user1.getId()));
		userPayService.insertUserPay(userPay);

		UserTimerecode usertimerecode = new UserTimerecode();
		long trecodeId = userTimerecodeService.selectUserTimerecode();
		usertimerecode.setTrecodeId(new BigDecimal(trecodeId));
		usertimerecode.setUserFid(new BigDecimal(user1.getId()));
		usertimerecode.setHappenTime(new Date());
		usertimerecode.setHappenType("2");

		userTimerecodeService.insertUser(usertimerecode);

		user1.setState("2");
		userService.update(user1);

		return "add_car";
	}

	/**
	 * 用户：我的页面
	 */
	@RequestMapping(value = "/mainIndex")
	public String mainIndex(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		model.addAttribute("user", user);
		return "main_unlogin";
	}

	/**
	 * 签订用户协议
	 */
	@RequestMapping(value = "/toUserShow")
	public String toUserShow(long carId, HttpServletRequest request) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		/*
		 * 判断当前时间和用户所选择的时间是否一致 一致 time 表中新增两条记录 状态为4,5 不一致，time表中新增加一条记录 状态为4
		 * 
		 */
		long trecodeId = userTimerecodeService.selectUserTimerecode();
		UserTimerecode userTimerecode = new UserTimerecode();
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String SelTime = request.getParameter("time");
		Date Time;
		try {
			Time = fmt.parse(SelTime);
			Date now = new Date();
			String ds1 = fmt.format(Time);
			String ds2 = fmt.format(now);
			if (fmt.parse(ds1).getTime() <= fmt.parse(ds2).getTime()) {
                //互助生效时间和当前时间 一致，插入两条数据，状态为  4,5
				userTimerecode.setTrecodeId(new BigDecimal(trecodeId));
				userTimerecode.setHappenTime(new Date());
				userTimerecode.setHappenType("4");
				userTimerecode.setUserFid(new BigDecimal(user.getId()));
				userTimerecode.setParam1(carId + "");

				userTimerecodeService.insertUser(userTimerecode);
				userTimerecode.setTrecodeId(new BigDecimal(trecodeId));
				userTimerecode.setHappenTime(new Date());
				userTimerecode.setHappenType("5");
				userTimerecode.setUserFid(new BigDecimal(user.getId()));
				userTimerecode.setParam1(carId + "");
				CarInfo carInfo = new CarInfo();
				carInfo.setId(new BigDecimal(carId));
				carInfo.setParam1(ds2); // 互助生效时间
				carInfo.setStatus("3");
				User u = userService.selectById(user.getId());
				int state = Integer.parseInt(u.getState());
				if (state < 5) {
					user.setState("5");
					userService.update(user);
				}

				carInfoService.updateByPrimaryKeySelective(carInfo);
				userTimerecodeService.insertUser(userTimerecode);
			} else {

				
				 //互助生效时间和当前时间 不一致，插入一条数据，状态为  4
				userTimerecode.setTrecodeId(new BigDecimal(trecodeId));
				userTimerecode.setHappenTime(new Date());
				userTimerecode.setHappenType("4");
				userTimerecode.setUserFid(new BigDecimal(user.getId()));
				userTimerecode.setParam1(carId + "");
				CarInfo carInfo = new CarInfo();
				carInfo.setId(new BigDecimal(carId));
				carInfo.setStatus("2");
				carInfo.setParam1(ds1);
				User u = userService.selectById(user.getId());
				int state = Integer.parseInt(u.getState());
				if (state < 4) {
					user.setState("4");
					userService.update(user);
				}
				carInfoService.updateByPrimaryKeySelective(carInfo);
				userTimerecodeService.insertUser(userTimerecode);

			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 此处需要以后加取得用户车信息并展示 重定向
		return "redirect:/rest/user/gotoMainDeal";

	}

	// add yuhb 跳转至付1元入会页面
	@RequestMapping(value = "/gotoPayJoin")
	public String gotoPayJoin() {

		// 此处需要以后加取得用户车信息并展示
		return "register_done";
	}

	// add yuhb 跳转至添加爱车页面
	@RequestMapping(value = "/gotoAddCar")
	public String gotoAddCar() {

		// 此处需要以后加取得用户车信息并展示
		return "add_car";
	}

	// add yuhb 跳转至签订互助协议页面
	@RequestMapping(value = "/gotoUserDeal")
	public String gotoUserDeal() {

		// 此处需要以后加取得用户车信息并展示
		return "main_makedeal";
	}
	//用来跳转界面
	@RequestMapping(value = "/gotoRegister_done")
	public String gotoRegister_done() {

		
		return "register_done";
	}

}
