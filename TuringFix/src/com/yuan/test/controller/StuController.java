package com.yuan.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yuan.test.entity.ClassTeam;
import com.yuan.test.entity.Student;
import com.yuan.test.page.StuPage;
import com.yuan.test.service.IStuService;


@Controller
@RequestMapping("/stu")
@Scope(value="prototype")
@SessionAttributes("page")
public class StuController {
	


	@Autowired
	private IStuService service;
	
	@ModelAttribute("page")
	public StuPage initPage(){
		return new StuPage();
	}
	

	@RequestMapping("addOrEditPage")
	public String addOrEditPage(ModelMap mm,String id){
		System.out.println(id);
		
		if (id!=null  &&   id.trim().length()>0) {
			Student stu = (Student) service.queryById(id);
			mm.put("stu", stu);
		}
		List ctList = service.queryCt();
		mm.put("ctList", ctList);
		
		return "jsp/test/stu/page_stu";
	}
	
	

	
	@RequestMapping("save")
	public String save(Student stu,String xx){
		
		System.out.println("id:"+stu.getStuId());//null
		
		if(stu.getStuId()==null   ||   stu.getStuId().trim().length()<=0){
			stu.setStuId(UUID.randomUUID().toString());
			
			if (stu.getCtId()==null   ||   stu.getCtId().trim().length()<=0) {
				stu.setCtId("1");
			}
			
			service.save(stu);
		}else{
			service.update(stu);
		}
		
		return "redirect:query.do";
	}


	
	@RequestMapping("query")
	public String query(@ModelAttribute("page")StuPage page,ModelMap mm) {
		System.out.println("page:"+page);
		//List<Student> list = service.queryAll();
		List<Student> list =service.queryPage(page);
		
		
		List<ClassTeam> ctList=service.queryCt();
		
		mm.put("list", list);
		mm.put("ctList", ctList);
		
		System.out.println("page:"+page);

		return "jsp/test/stu/query_stu";
	}
	@RequestMapping("ajaxPage")
	@ResponseBody
	public List<Student> ajaxPage(@ModelAttribute("page")StuPage page,ModelMap mm,HttpServletResponse response) throws IOException {
		System.out.println("page:"+page);
		//List<Student> list = service.queryAll();
		List<Student> list =service.queryPage(page);
		
		
		List<ClassTeam> ctList=service.queryCt();
		
		mm.put("list", list);
		mm.put("ctList", ctList);
		
		System.out.println("page:"+page);
		return list;
	}


	@RequestMapping("delete")
	public String delete(String id){
		service.delete(id);
		return "redirect:query.do";
	}
	
	@RequestMapping("delRows")
	public String delRows(String ids){
		System.out.println("ids:"+ids);
		service.delRows(ids);
		return "redirect:query.do";
	}
}
