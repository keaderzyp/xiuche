package com.oojunzi.app.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 积分商城
 * @author yuhb
 **/
@Controller
@RequestMapping(value = "/scoreShop")
public class ScoreController {


	/**
	 * 积分商城首页
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String scoreIndex(Model model, HttpServletRequest request) {
		//model.addAttribute("gd_name", "这个可以有");
		return "score";
	}
	
	/**
	 * 商品详情
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/goodInfo")
	public String goodInfo(Model model, HttpServletRequest request) {
		model.addAttribute("gd_name", "这个可以有");
		return "good_info";
	}

}
