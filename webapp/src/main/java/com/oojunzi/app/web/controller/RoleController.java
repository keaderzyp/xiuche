package com.oojunzi.app.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.oojunzi.app.web.model.Role;
import com.oojunzi.app.web.model.RoleExample;
import com.oojunzi.app.web.service.RoleService;

/**
 * 
 * //TODO 角色控制器
 * @author michael
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {
	@Resource
	private RoleService roleService;
	
	
	
	
	@RequestMapping(value = "/roleAll")
	@ResponseBody
	public String roleList(){
		RoleExample rxExample  = new RoleExample();
		List<Role> roleList = roleService.selectByExample(rxExample);
		return JSON.toJSONString(roleList);
	}
}
