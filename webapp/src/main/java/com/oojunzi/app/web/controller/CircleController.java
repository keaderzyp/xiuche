package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oojunzi.app.core.util.ApplicationUtils;
import com.oojunzi.app.core.util.FileUpload;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.service.CircleInfoService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserService;
import com.oojunzi.app.web.service.UserTimerecodeService;

/**
 * 小圈控制器
 * 
 * @author yuhb
 * @since 2017年7月5日
 **/
@Controller
@RequestMapping(value = "/Circle")
public class CircleController {

	@Resource
	private UserAddService userAddService;

	@Resource
	private CircleInfoService circleInfoService;

	@Autowired
	private FileUpload fileUpload;

	@Resource
	private UserService userService;
	@Resource
	private UserTimerecodeService userTimerecodeService;

	/**
	 * 我的圈
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/index")
	public ModelAndView showMyCircle() {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");

		// 取圈内所有用户信息
		List<User> userList = new ArrayList<User>();
		userList = userAddService.selectUsersByCircle(user.getId());
		ModelAndView mv = new ModelAndView();

		mv.setViewName("my_friends");
		mv.addObject("userList", userList);
		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		mv.addObject("myIco", user.getUserIco());

		// 取小圈信息
		CircleInfo circleInfo = circleInfoService.selectByUserId(new BigDecimal(user.getId()));
		if (circleInfo == null)
			return mv;
		mv.addObject("circleInfo", circleInfo);
		mv.addObject("userNum", userList.size());
		if (circleInfo.getUserFid().compareTo(new BigDecimal(user.getId())) == 0) {
			mv.addObject("is_creater", 1);
		} else {
			mv.addObject("is_creater", 0);
		}
		// 取小圈车辆相关信息
		CircleInfo circleCarInfo = circleInfoService.selectCarInfoByUserId(new BigDecimal(user.getId()));
		// 取小圈车辆相关信息
		Date safeTime = circleInfoService.sltCircleNearHelpTime(new BigDecimal(user.getId()));
		
		mv.addObject("circleCarInfo", circleCarInfo);
		//把车辆均价分为整数和小数
		if (circleCarInfo.getAvg_price()!=null) {
			String a = circleCarInfo.getAvg_price();
			String[] aString = a.split("\\.");
			mv.addObject("priceZhengShu", aString[0]);
			mv.addObject("priceXiaoShu", aString[1]);
		}
		if (circleCarInfo.getDriver_year()!=null) {
			String a = circleCarInfo.getDriver_year();
			String[] aString = a.split("\\.");
			mv.addObject("yearZhengShu", aString[0]);
			mv.addObject("yearXiaoShu", aString[1]);
		}

		if (safeTime == null) {
			safeTime = circleInfo.getCreatTime();
		}

		Date endDate = new Date();
		long days = (endDate.getTime() - safeTime.getTime()) / (24 * 60 * 60 * 1000);
		mv.addObject("safeDays", days);

		/*
		 * String safeTime = circleCarInfo.getNearly_time();
		 * 
		 * if(circleCarInfo.getNearly_time() == null ||
		 * circleCarInfo.getNearly_time().length() == 0){ safeTime =
		 * circleInfo.getCreatTime().toString(); }else{ SimpleDateFormat sdf=new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); try { Date
		 * d1=sdf.parse(safeTime); Date d2=sdf.parse(new Date().toString());
		 * //daysBetween(d1,d2); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace();
		 * 
		 * } }
		 */

		return mv;
	}

	/**
	 * 
	 * 完成添加爱车功能，改变用户状态
	 * 
	 */
	@RequestMapping(value = "/updateState")
	public String addCarupdateState(Model model) {
		
		model.addAttribute("first", "0");
	    model.addAttribute("plate_num", null);
	    model.addAttribute("vin", null);

		return "upload";
	}
}