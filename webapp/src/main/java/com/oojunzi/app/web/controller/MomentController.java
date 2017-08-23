package com.oojunzi.app.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;
import com.oojunzi.app.web.model.NewsDynamicTypeExample.Criteria;
import com.oojunzi.app.web.service.NewsDynamicService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * 积分商城
 * @author yuhb
 **/
@Controller
@RequestMapping(value = "/moments")
public class MomentController {
	@Resource
	NewsDynamicService service;

	/**
	 * 积分商城首页
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String momentIndex(Model model, HttpServletRequest request) {
		//model.addAttribute("gd_name", "这个可以有");
		NewsDynamicTypeExample n = new NewsDynamicTypeExample();
		List<NewsDynamicType> list_news = service.queryMomentsByExample(n);
		model.addAttribute("list", list_news);
		return "moments";
	}
	@RequestMapping(value = "/queryNewsByType")
	@ResponseBody
	public String queryNewsByType(Model model,@RequestParam(value = "type") String type, HttpServletRequest request,@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
//		String id = request.getParameter("id");
//		System.out.println("------->"+id); 
		System.out.println(type);
		System.out.println(pageNo+" "+pageSize);
		Page<NewsDynamic> page = new Page<>(pageNo,pageSize);
		NewsDynamicExample ne = new NewsDynamicExample();
		ne.setType(type);
		ne.setOrderByClause("issue_time");
		List<NewsDynamic>list_news = service.queryMomentsByType(page,ne);
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("list", list_news);
		map.put("pageTotal", page.getTotalPages());
		JSONArray json_news = JSONArray.fromObject(map);
		System.out.println(json_news);
		return json_news.toString();
	}
	/**
	 * 数据表格查询动态种类
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/momentsType")
	@ResponseBody
	public String selectMomentsType(Model model, HttpServletRequest request,@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		//model.addAttribute("gd_name", "这个可以有");
		NewsDynamicTypeExample n = new NewsDynamicTypeExample();
		Page<NewsDynamicType> page = new Page<>(pageNo,pageSize);
		List<NewsDynamicType>list_news = service.queryMomentsByPageAndExample(page,n);
		System.out.println(list_news);
		List<Map<String,Object>> list_res = new ArrayList<Map<String,Object>>();
		for(int i=0;i<list_news.size();i++){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("id", list_news.get(i).getTypeId());
			List<String> list = new ArrayList<String>();
			list.add(list_news.get(i).getTypeId());
			list.add(list_news.get(i).getTypeName());
			list.add(list_news.get(i).getTypeIcon());
			map.put("cell", list);
			list_res.add(map);
		}
		Map<String,Object> map_res = new HashMap<String,Object>();
		map_res.put("page", pageNo);
		map_res.put("total", page.getTotalPages());
		map_res.put("records", page.getTotalCount());
		map_res.put("rows", list_res);
		JSONObject json_res = JSONObject.fromObject(map_res);
		System.out.println(json_res);
		return json_res.toString();
	}
	/**
	 * 商品详情
	 * 
	 * @param user
	 * @param result
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/momentInfo")
	public String momentInfo(Model model, HttpServletRequest request,@RequestParam("id") String id,@RequestParam(value="pc",defaultValue="0") String pc) throws UnsupportedEncodingException {
		System.out.println(id);
		NewsDynamic news = service.queryMomentsById(id);
		System.out.println(news.getTitle());
		System.out.println(news.getType().getTypeId());
		try {
			byte[] b = news.getContent();
			String content = new String(b,"gb2312");
			System.out.println(content);
			model.addAttribute("content",content);
		} catch (Exception e) {
			// TODO: handle exception
		}
		String typeName = service.queryTypeName(news.getType().getTypeId());
		model.addAttribute("news",news);
		model.addAttribute("type",typeName);
		if(pc.equals("0")){
			return "moments_info";
		}else{
			return "pc/zixun_xiangqing";
		}
		
	}

}
