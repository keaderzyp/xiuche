package com.oojunzi.app.web.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.base.Predicate;
import com.oojunzi.app.core.util.FileUpload;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.CircleInfoExample;
import com.oojunzi.app.web.model.CircleUser;
import com.oojunzi.app.web.model.CircleUserExample;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.CircleInfoService;
import com.oojunzi.app.web.service.CircleUserService;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.web.service.UserService;

@Controller
@RequestMapping(value = "/circleAdd")
public class CircleInfoController {

	@Resource
	private CircleInfoService circleInfoService;

	@Resource
	private CircleUserService circleUserService;
	@Resource
	private UserService userService;
	@Autowired
	private FileUpload fileUpload;

	/*
	 * 
	 * 查询圈子中的所有信息
	 * 
	 */

	// public List<CircleInfo> circle(CircleUser user, Model
	// modle,HttpServletRequest request) {
	// CircleInfoExample example= new CircleInfoExample();
	// List<CircleInfo> circleInfos=CircleInfoService.selectByExample(example);
	// //return JSON.toJSONString(circlruser);
	// return circleInfos;

	/*
	 * 
	 * 增加圈子
	 * 
	 */
	@RequestMapping(value = "/add_friends")
	public String add_friends(Model model, @RequestParam("circleName") String circleName,
			@RequestParam("circleDesc") String circleDesc, HttpServletRequest request,
			@RequestParam("drivingLicenseVicePageFile") MultipartFile drivingLicenseVicePageFile) {
		CircleInfo circleInfo = new CircleInfo();
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		User circle = userService.selectById(user.getId());

		// zhwh 验证每一个人只能有一个圈
		if (circle.getHasCircle().equals("0")) {
			long circleId = circleInfoService.selectCircleId();
			circleInfo.setCircleId(new BigDecimal(circleId));
			String name = circleName;
			String desc = circleDesc;
//			try {
//				// 解决乱码问题
//				String circlename = new String(name.getBytes("ISO-8859-1"), "utf-8");
//				circleInfo.setCircleName(circlename);
//				String circledesc = new String(desc.getBytes("ISO-8859-1"), "utf-8");
//				circleInfo.setCircleDesc(circledesc);
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // 转码UTF8
			//  向圈子信息表中插入数据
			circleInfo.setCircleName(name);
			circleInfo.setCircleDesc(desc);
			circleInfo.setMaxNumber(new BigDecimal("10"));
			circleInfo.setStatus("1");
			circleInfo.setCreatTime(new Date());

			/**
			 * add LGQ 插入圈子头像
			 */
			fileUpload.setFileUploadPath("d:/fileupload/circleIcon/");
			String userIco = fileUpload.uploadFile(drivingLicenseVicePageFile);
			circleInfo.setCircleIco(userIco);
			model.addAttribute("tomcatImagesPath", fileUpload.getTomcatImagesPath());
			circleInfo.setUserFid(new BigDecimal(user.getId()));
			int a = circleInfoService.insertCircle(circleInfo);
			if (a == 0) {
				model.addAttribute("error", "新建圈子失败，请重试");
				return "add_friends";
			}

			model.addAttribute("circleInfo", circleInfo);

			/*
			 * 向小圈信息表中插入数据
			 * 
			 */

			CircleUser circleUser = new CircleUser();
			long cuserId = circleUserService.selectId();
			// System.out.println(cuserId);
			circleUser.setCuserId(new BigDecimal(cuserId));
			circleUser.setCircleFid(new BigDecimal(circleId));
			circleUser.setAddTime(new Date());
			circleUser.setUserFid(new BigDecimal(user.getId()));
			circleUser.setStatus("1");
			circleUser.setIsCreater("1");
			circleUserService.insertCircleUser(circleUser);

			user.setHasCircle("1");
			userService.update(user);

			return "redirect:/rest/Circle/index";
		} 

		return "add_friends";
		

	}
	//编辑圈子信息
	@RequestMapping(value = "/toUpdate_friends")
	public ModelAndView toUpdate_friends(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		ModelAndView mv = new ModelAndView();
		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
		CircleInfo circleInfo = circleInfoService.selectByUserId(new BigDecimal(user.getId()));
		if (circleInfo == null)
			return mv;
		mv.addObject("circleInfo", circleInfo);
		mv.setViewName("add_friends");
		return mv;
	}
	
	
	@RequestMapping(value = "/update_friends")
	public String update_friends(Model model, @RequestParam("circleName") String circleName,
			@RequestParam("circleDesc") String circleDesc, HttpServletRequest request,
			@RequestParam("drivingLicenseVicePageFile") MultipartFile drivingLicenseVicePageFile) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("userInfo");
		CircleInfo circleInfo = circleInfoService.selectByUserId(new BigDecimal(user.getId()));
		circleInfo.setCircleDesc(circleDesc);
		circleInfo.setCircleName(circleName);
		fileUpload.setFileUploadPath("d:/fileupload/circleIcon/");
		String userIco = fileUpload.uploadFile(drivingLicenseVicePageFile);
		circleInfo.setCircleIco(userIco);
		circleInfoService.updateByPrimaryKeySelective(circleInfo);
		
		return "redirect:/rest/Circle/index";
		}
}
