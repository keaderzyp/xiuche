package com.oojunzi.app.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;
import com.oojunzi.app.web.service.NewsDynamicService;

@Controller
@RequestMapping(value="/pc")
public class PCController {
	
	@Resource
	NewsDynamicService service;

	@RequestMapping(value="/index")
	public String index(Model model, HttpServletRequest request){
		return "pc/index";
	}
	
	@RequestMapping(value="/blockPublicity")
	public String blockPublicity(Model model, HttpServletRequest request){
		return "pc/qukuaigongshi";
	}
	@RequestMapping(value="/information")
	public String information(Model model, HttpServletRequest request){
		NewsDynamicTypeExample n = new NewsDynamicTypeExample();
		List<NewsDynamicType> list_news = service.queryMomentsByExample(n);
		model.addAttribute("list", list_news);
		return "pc/zixun";
	}
	
	@RequestMapping(value="/about")
	public String about(Model model, HttpServletRequest request){
		return "pc/about";
	}
	
	@RequestMapping(value="/downLoads")
	public String downLoads(Model model, HttpServletRequest request){
		return "pc/download";
	}
	@RequestMapping(value="/problem")
	public String problem(Model model, HttpServletRequest request){
		return "pc/problem";
	}
}
