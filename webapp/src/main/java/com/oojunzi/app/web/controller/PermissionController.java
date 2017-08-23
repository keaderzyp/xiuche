package com.oojunzi.app.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.oojunzi.app.web.model.Permission;
import com.oojunzi.app.web.service.PermissionService;
@Controller
@RequestMapping("/permission")
public class PermissionController {
	@Resource
	private PermissionService permissionService;
	
	
	
	@RequestMapping("/getPerByRoleId")
	@ResponseBody
	public String getPermissionByRoleId(@RequestParam("id") String id){
		
		
	List<Permission> permissions = permissionService.selectPermissionsByRoleId(Long.parseLong(id));
		
		return  JSON.toJSONString(permissions);
	}

}
