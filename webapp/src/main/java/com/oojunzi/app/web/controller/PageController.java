package com.oojunzi.app.web.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.util.StringUtils;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpBillExample;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import com.oojunzi.app.web.model.NewsDynamicExample.Criteria;
import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.security.RoleSign;
import com.oojunzi.app.web.service.NewsDynamicService;
import com.oojunzi.app.web.service.UserService;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author michael
 * @since 2016年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/page")
public class PageController {
	@Resource
	UserService useService;
	
	@RequestMapping("/dev")
	public String dev(){
		return "dev";
	}

	/**
	 * 登录页
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * dashboard页
	 */
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	/**
	 * druid
	 */
	@RequiresRoles(value = RoleSign.ADMIN)
	@RequestMapping("/druid")
	public String druid() {
		// return "redirect:/druid/index.html";
		return "druid";
	}

	/**
	 * 404页
	 */
	@RequestMapping("/404")
	public String error404() {
		return "404";
	}

	/**
	 * 401页
	 */
	@RequestMapping("/401")
	public String error401() {
		return "401";
	}

	/**
	 * 500页
	 */
	@RequestMapping("/500")
	public String error500() {
		return "500";
	}

/*	*//**
	 * jdgrid
	 *//*
	@RequestMapping("/userManage")
	public String userManage() {
		return "userManage";
	}*/

	// add yuhb
	/**
	 * 跳转至用户未登录页面
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/toMainUnLogin")
	public String toMainUnLogin(Model model, HttpServletRequest request) {
		model.addAttribute("name", "try");
		return "main_unlogin";
	}

	/**
	 * 跳转至用户登录页面
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/toMainLogin")
	public String toMainLogin(Model model, HttpServletRequest request) {
		model.addAttribute("name", "try");
		return "main_login";
	}

	/**
	 * 跳转至手机号登录
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/toCodeLogin")
	public String toCodeLogin(Model model, HttpServletRequest request) {
		model.addAttribute("name", "try");
		return "code";
	}

	/**
	 * 跳转至密码登录
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/toPassLogin")
	public String toPassLogin(Model model, HttpServletRequest request) {
		model.addAttribute("name", "try");
		return "login";
	}

	/**
	 * 跳转至注册
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/toRegister")
	public String toRegister(Model model, HttpServletRequest request) {
		model.addAttribute("name", "try");

		return "register";
	}

	/*
	 * 跳转到fix_car
	 * 
	 */
	@RequestMapping("/fix_car")
	public String fix_car() {
		return "fix_car";
	}

	/*
	 * 跳转到my_friends
	 * 
	 */
	@RequestMapping("/my_friends")
	public String my_friends() {
		return "my_friends";
	}

	/*
	 * 跳转到add_car
	 * 
	 */
	@RequestMapping("/add_car")
	public String add_car() {
		return "add_car";
	}

	/*
	 * 跳转到add_friends
	 * 
	 */
	@RequestMapping("/add_friends")
	public String add_friends() {
		return "add_friends";
	}
	/**
	 * 跳转到quick_learn-1
	 * 
	 */
	@RequestMapping("/quick_learn-1")
	public String quick_learn1(Model model,@Valid String isGo) {
		model.addAttribute("isGo", isGo);
		return "quick_learn-1";
	}
	/**
	 * 跳转到quick_learn-2-1
	 * 
	 */
	@RequestMapping("/quick_learn-2-1")
	public String quick_learn2(Model model,@Valid String isGo) {
		model.addAttribute("isGo", isGo);
		return "quick_learn-2-1";
	}
	/**
	 * 跳转到quick_learn-2-2
	 * 
	 */
	@RequestMapping("/quick_learn-2-2")
	public String quick_learn3(Model model,@Valid String isGo) {
		model.addAttribute("isGo", isGo);
		return "quick_learn-2-2";
	}
	   /**
     * 用户管理
     * @author michael
     */
    @RequestMapping("/userManage")
	public String userManage(Model model, UserExample userExample, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {

    	Page<User> page = new Page<>(pageNo,pageSize);
    	
    	UserExample example = new UserExample();
    	
    	if ( !(StringUtils.isEmpty(userExample.getUsername()) )) {
    		example.createCriteria().andUsernameEqualTo(userExample.getUsername());
		}
    		
    	
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    		
    		
    	try {
    		
    		if(!(StringUtils.isEmpty(userExample.getBeginTime())) || !(StringUtils.isEmpty(userExample.getEndTime() ))  ){
    			example.createCriteria().andCreateTimeBetween(sdf.parse(userExample.getBeginTime().trim()), sdf.parse(userExample.getEndTime().trim()));
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
		List<User> userList = userService.selectByExampleAndPage(page, example);
    	
		model.addAttribute("userList", userList);
    	model.addAttribute("page", page);
    	model.addAttribute("u", userExample);
        return "userManage";
    }
    /**
     * 角色管理
     * @author michael
     */
    @RequestMapping("/roleManage")
    public String roleManage() {
        return "roleManage";
    }
    /**
     * 职员管理
     * @author michael
     */
    @RequestMapping("/staffManage")
    public String staffManage() {
        return "staffManage";
    }
    /**
     * 分享管理
     * @author michael
     */
    @RequestMapping("/shareManage")
    public String shareManage() {
        return "shareManage";
    }
    /**
     * 积分方案管理
     * @author michael
     */
    @RequestMapping("/storePlanManage")
    public String storePlanManage() {
        return "storePlanManage";
    }
    /**
     * 验证码登录
     * @author zhwh
     */
    @RequestMapping("/code")
    public String code() {
    	//to do from pc or mobile
        return "code";
    }
    

    /**
     *  新增账单页面
     */
    @RequestMapping("/addBill")
    public String addBill() {
        return "addBill";
    }
    /**
     *  事故弹出页面
     */
    @RequestMapping("/accident")
    public String accidentPage() {
        return "accident_info";
    }
    @Resource
    NewsDynamicService newService;
    /**
     * 资讯类别页面
     * @return
     */
    
    @RequestMapping("/informationType")
    public String informationType(Model m,NewsDynamicTypeExample n, @RequestParam(value="pageNo",defaultValue="1")int pageNo,@RequestParam(value="pageSize",defaultValue="10")int pageSize) {
    	//NewsDynamicTypeExample n = new NewsDynamicTypeExample();
    	System.out.println(n.getTypeName());
    	Page<NewsDynamicType>page = new Page<>(pageNo,pageSize);
    	List<NewsDynamicType> list_news = newService.queryMomentsByPageAndExample(page, n);
    	m.addAttribute("list", list_news);
    	m.addAttribute("page",page);
    	m.addAttribute("n",n);
        return "informationType";
    }
    /**
     * 资讯类别跳转添加修改页面
     * @return
     */
    @RequestMapping("/informationPage")
    public String informationTypePage(Model m,@RequestParam(value="id",defaultValue="#")String id) {
    	if(!id.equals("#")){
    		NewsDynamicType newsType = newService.queryInformationTypeById(id);
    		System.out.println(newsType.toString());
    		m.addAttribute("obj",newsType);
    	}
        return "informationTypeAdd";
    }
    /**
     * 资讯类别处理增加和修改数据
     * @return
     */
    @RequestMapping("/informationSave")
    public String informationSave(HttpServletRequest request,Model m,NewsDynamicType newsType,@RequestParam(value = "file", required = false) MultipartFile file) {
    	
    	//根据源文件名取后缀
    	String fileName = file.getOriginalFilename();
    	System.out.println(fileName);
    	String houZhui = fileName.substring(fileName.lastIndexOf("."));
    	//赋予页面设置的图标名字
    	String fName = newsType.getTypeIcon()+houZhui;
    	//获得保存图片的路径
    	String path = request.getSession().getServletContext().getRealPath("/")+"img";
//    	System.out.println(path);
    	 File targetFile = new File(path, fName);
    	//如果是增加就生成新id
     	if(newsType.getTypeId().trim().length()==0){
     		newsType.setTypeId(UUID.randomUUID().toString());
     		 newService.saveNews(newsType);
     	}else{
     		newService.updateNews(newsType);
     	}
         //保存  
         try {  
             file.transferTo(targetFile); 
         } catch (Exception e) {  
             e.printStackTrace(); 
         }  
         return "redirect:informationType";
    }
    /**
     * 删除资讯分类
     * @param m
     * @param id
     * @return
     */
    @RequestMapping("/delInformation")
    public String delInformation(Model m,@RequestParam(value="ids[]")String[] ids,HttpServletRequest request) {
    	System.out.println(Arrays.toString(ids));
		//获得保存图片的路径
    	String path = request.getSession().getServletContext().getRealPath("/")+"img";
    	newService.deleteMoments(ids,path);
    	return "redirect:informationType";
    }
    @Resource
    UserService userService;
    /**
     * 资讯内容页面
     * @return
     */
    @RequestMapping("/information")
    public String information(Model m,NewsDynamicExample n,HttpServletRequest request,@RequestParam(value="pageNo",defaultValue="1")int pageNo,@RequestParam(value="pageSize",defaultValue="10")int pageSize) {
    	//创造条件查询对象
    	
    	
    	
    	Page<NewsDynamic>page = new Page<>(pageNo,pageSize);
    	List<NewsDynamic> list_news = newService.queryMomentsContentByExample(page,n);
    	NewsDynamicTypeExample nt = new NewsDynamicTypeExample();
    	List<NewsDynamicType> list_type = newService.queryMomentsByExample(nt);
    	UserExample u = new UserExample();
    	List<User> list_user = userService.selectByExample(u);
    	m.addAttribute("list", list_news);
    	m.addAttribute("list_type", list_type);
    	m.addAttribute("list_user", list_user);
    	m.addAttribute("page",page);
    	m.addAttribute("n",n);
    	
        return "information";
    }
    /**
     * 资讯详情跳转添加修改页面
     * @return
     */
    @RequestMapping("/informationContentPage")
    public String informationContentPage(HttpServletRequest request,Model m,@RequestParam(value="id",defaultValue="#")String id) {
    	NewsDynamicTypeExample nt = new NewsDynamicTypeExample();
    	List<NewsDynamicType> list_type = newService.queryMomentsByExample(nt);
    	if(!id.equals("#")){
    		NewsDynamic news = newService.queryMomentsById(id);
    		System.out.println(news.toString());
    		try {
    			if(news.getContent()!=null){
    				String content = new String(news.getContent(),"gb2312");
    				m.addAttribute("content",content);
    			}
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				m.addAttribute("content","文章获取失败");
				e.printStackTrace();
				
			}
    		String path = request.getSession().getServletContext().getRealPath("/")+"img";
    		String imgs = news.getImgs();
    		//处理文章内部的图片
    		if(imgs!=null){
    			List<Map<String,Object>> imgList = new ArrayList<Map<String,Object>>();
    			if(imgs.indexOf(",")!=-1){
    				String[] imgObjs = imgs.split(",");
            		for(int i=0;i<imgObjs.length;i++){
            			Map<String,Object>map = new HashMap<String,Object>();
            			map.put("path",path+"/"+imgObjs[i].trim());
            			map.put("id",imgObjs[i].substring(0,imgObjs[i].indexOf(".")));
            			map.put("name",imgObjs[i]);
            			imgList.add(map);
            		}
            		
    			}else{
    				
    				try {
    					Map<String,Object>map = new HashMap<String,Object>();
        				map.put("path",path+"/"+imgs.trim());
        				map.put("id",imgs.substring(0,imgs.indexOf(".")));
            			map.put("name",imgs);
            			imgList.add(map);
					} catch (Exception e) {
						// TODO: handle exception
					}
        			
    			}
    			m.addAttribute("imgs",imgList);
    		}
    		
    		m.addAttribute("obj",news);
    	}
    	m.addAttribute("list_type", list_type);
        return "informationAdd";
    }
    /**
     * 资讯类别处理增加和修改数据
     * @return
     */
    @RequestMapping("/infContentSave")
    public String informationContentSave(HttpServletRequest request,@RequestParam(value = "icon", required = false) MultipartFile file) {
    	//获得保存图片的路径
    	String path = request.getSession().getServletContext().getRealPath("/")+"img";
    	System.out.println(path);
    	//根据源文件名取后缀
    	String fileName = file.getOriginalFilename();
    	String houZhui =fileName.substring(fileName.lastIndexOf("."));
    	String icon =  UUID.randomUUID().toString()+houZhui;
    	//接值
    	String title = request.getParameter("title");
    	String type = request.getParameter("type");
    	String desciption = request.getParameter("desciption");
    	String content = request.getParameter("content");
    	String remark = request.getParameter("remark");
    	String id = request.getParameter("id");
    	String userid = request.getParameter("userid");
    	System.out.println(userid);
    	//接收传输的文章图片数组
    	String[] imgs = request.getParameterValues("imgs");
    	System.out.println(Arrays.toString(imgs));
    	//获取用户信息
		User authUserInfo = useService.selectById(userid);
		//得到用户的名称和主键
		String issuer = authUserInfo.getUsername();
		String userFid = authUserInfo.getId().toString();
		
		//保存到用户对象
		NewsDynamic news = new NewsDynamic();
		try {
			news.setContent(content.getBytes("gb2312"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		news.setBynamicIco(icon);
		news.setDesciption(desciption);
		news.setIssuer(issuer);
		news.setImgs(Arrays.toString(imgs).substring(1, Arrays.toString(imgs).length()-1));
		User u = new User();
		u.setId((long)(Integer.parseInt(userFid)));
		news.setUserFid(u);
		news.setTitle(title);
		NewsDynamicType nt = new NewsDynamicType();
		nt.setTypeId(type);
		news.setType(nt);
		news.setIssueTime(new Date());
		System.out.println(news.toString());
		news.setRemark(remark);
		news.setDynamicUrl("rest/moments/momentInfo");
		//如果有主键就调用修改 新创建主键就调用新增
		if(id==null||"".equals(id)){
			news.setDynamicId(UUID.randomUUID().toString());
			newService.saveNewsContent(news);
		}else{
			NewsDynamic n = newService.queryMomentsById(id);
			File f = new File(path+"/"+n.getBynamicIco());
			if(f.exists()){
				f.delete();
			}
			news.setDynamicId(id);
			newService.updateNewsContent(news);
		}
		
         //保存  
         try {  
        	 File targetFile = new File(path,icon);
             file.transferTo(targetFile); 
         } catch (Exception e) {  
             e.printStackTrace(); 
         }  
         return "redirect:information";
    }
    /**
     * 删除资讯详情
     * @param m
     * @param id
     * @return
     */
    @RequestMapping("/delInfContent")
    public String delInfContent(Model m,@RequestParam(value="ids[]")String[] ids,HttpServletRequest request) {
		//获得保存图片的路径
    	String path = request.getSession().getServletContext().getRealPath("/")+"img";
    	newService.deleteMomentsContent(ids,path);
    	return "redirect:information";
    }
    /**
     * 富文本编辑器上传图片使用的接口
     * @param request
     * @param file
     * @return
     */
    @RequestMapping("/informationImg")
    @ResponseBody
    public String informationImg(HttpServletRequest request,@RequestParam(value = "file", required = false) MultipartFile file) {
    	String fileName = file.getOriginalFilename();
    	String path = request.getSession().getServletContext().getRealPath("/")+"img";
    	String houZhui =fileName.substring(fileName.lastIndexOf("."));
    	String icon =  UUID.randomUUID().toString()+houZhui;
    	 //保存  
        try {  
       	 File targetFile = new File(path,icon);
            file.transferTo(targetFile); 
        } catch (Exception e) {  
            e.printStackTrace(); 
        }  
    	return "{\"filePath\":\""+path+"/"+icon+"\",\"imgName\":\""+icon+"\"}";
    }
    /**
     * 点击文章中图片列表的删除按钮时执行删除服务器文件的接口
     * @param request
     * @param path
     * @return
     */
    @RequestMapping("/informationImgDel")
    @ResponseBody
    public String informationImgDel(HttpServletRequest request,@RequestParam(value = "path") String path) {
    	File f = new File(path);
    	if(f.exists()){
    		f.delete();
    	}
    	return "{\"success\":true}";
    }
}