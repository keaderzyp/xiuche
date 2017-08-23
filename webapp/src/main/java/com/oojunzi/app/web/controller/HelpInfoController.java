package com.oojunzi.app.web.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.HelpInfoService;
import com.oojunzi.app.web.service.UserService;
@Controller
@RequestMapping("/help")
public class HelpInfoController {
	@Resource
	HelpInfoService helpInfoService;
	@Resource
	private UserService userService;
	
	/**
	 * 用户求助记录查询
	 * @author michael
	 */
	@RequestMapping("/getHelpInfo")
	@ResponseBody
	public String getUserHelpInfo(@RequestParam("id") String id){
		/*Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("user");
		*/
		
		HelpInfoExample helpInfoExample = new HelpInfoExample();
		
		helpInfoExample.createCriteria().andParam1EqualTo(id);
		List<HelpInfo> helpInfos =  helpInfoService.selectByExample(helpInfoExample);
		
		return JSON.toJSONString(helpInfos);
	}
	/**
	 * 用户求助记录查询for bill
	 * @author michael
	 */
	@RequestMapping("/getHelpInfoForBill")
	public ModelAndView getUserHelpInfoForBill(	@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
/*		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = (User) session.getAttribute("user");*/
		Page<HelpInfo> page = new Page<>(pageNo,pageSize);
		
		ModelAndView mv = new ModelAndView();
		
		HelpInfoExample helpInfoExample = new HelpInfoExample();
		
		helpInfoExample.setOrderByClause("happen_time desc");
		List<HelpInfo> helpInfos =  helpInfoService.selectByExampleAndPage(page,helpInfoExample);
		mv.addObject("page", page);
		mv.addObject("helpInfos", helpInfos);
		mv.setViewName("accident_info");
		
		return mv;
	}
	
	/**
	 * 新增求助记录页面
	 * @author michael
	 */
	@RequestMapping("/addHelpPage")
	public String goToAddHelp(){
		
		
		
		return "addHelp";
	}

	/**
	 * 维护求助地址
	 * @author michael
	 */
	@RequestMapping(value="/goToMaintainAddr")
	public String goToMaintainAddr(Model model,HelpInfo helpInfo,String helpId,String id){
		System.out.println(id);
		User user = userService.selectById((long)Integer.parseInt(id));
		model.addAttribute("helpInfo", helpInfo);
		model.addAttribute("user", user);
		return "maintainHelpAddr";
	}
	@RequestMapping(value="/maintainAddr")
	public String maintainHelpAddr(HelpInfo helpInfo ,String time){
		//System.out.println(addrId);
		helpInfo.setStatus("2");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			helpInfo.setHappenTime(sdf.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = helpInfoService.updateHelpInfobyId(helpInfo);
		if (i==1) {
			return "redirect:getHelpInfoForBill";
		}
		return "maintainHelpAddr";
	}
	
	@RequestMapping(value="/maintainInfo")
	@ResponseBody
	public int maintainHelpInfo(HelpInfo helpInfo ,String infoId, @RequestParam("files") MultipartFile[] files ,MultipartHttpServletRequest multipartHttpServletRequest){
		//System.out.println(infoId);
		helpInfo.setStatus("3");
		//int i = helpInfoService.updateHelpInfobyId(helpInfo);
		
		return 0;
		
	}
	/**
	 * 根据id 获取求助记录
	 * 
	 */
	@RequestMapping(value="/getHelpInfoByHelpId")
	public HelpInfo getHelpInfoById(String id){
		
		return helpInfoService.selectByPrimaryKey(new BigDecimal(id));
	};
	
}
