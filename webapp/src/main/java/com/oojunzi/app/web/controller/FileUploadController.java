package com.oojunzi.app.web.controller;

import java.text.SimpleDateFormat;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.oojunzi.app.core.util.FileUpload;

@Controller
public class FileUploadController {
	@Autowired
	private FileUpload fileUpload;

	@RequestMapping("/fileUpload")
	@ResponseBody
	public String fileUpload(@RequestParam("uploadFile") MultipartFile file) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String fileName = fileUpload.uploadFile(file);
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
//		User user = (User) session.getAttribute("user");
//		ima.setName(user.getUsername());
//		ima.setMasterId(String.valueOf(user.getId()));
//		ima.setPath(fileName);
//		ima.setCreatetime(df.format(new Date()));// new Date()为获取当前系统时间
//		images.insert(ima);
//		if (fileName != null) {
//			return fileName + ima.getName();
//		}
		return "false";
	}

	@RequestMapping("/goFileUpload")
	public String goFileUpload() {
		return "FileUpload";
	}
	
	@RequestMapping("/fileUploads")
	@ResponseBody
	public String fileUploads(@RequestParam("uploadFile") MultipartFile[] file) {
		for (MultipartFile multipartFile : file) {
			String fileName=fileUpload.uploadFile(multipartFile);
		}
		return "false";
	}
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll() {
		ModelAndView mv = new ModelAndView();
//		List<Images> imagesList = images.selectAll();
//		for (Images images : imagesList) {
//			System.out.println("图片地址："  + images.getPath());
//		}
//		mv.addObject("tomcatImagesPath", fileUpload.getTomcatImagesPath());
//		mv.setViewName("FileUpload");
//		mv.addObject("imagesList", imagesList);
		return mv;
	}
	
}
