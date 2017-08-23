package com.oojunzi.app.core.util;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.oojunzi.app.web.annotation.ControllerLog;
import com.oojunzi.app.web.annotation.ServiceLog;
import com.oojunzi.app.web.model.AdminLog;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.LogService;



	@Aspect
	@Component
	public  class LogAspect {
	    //注入Service用于把日志保存数据库
	    @Resource
	    private LogService logService;
	    //本地异常日志记录对象
	    private  static  final Logger logger = LoggerFactory.getLogger(LogAspect. class);
	 
	    //Service层切点
	    @Pointcut("@annotation(com.oojunzi.app.web.annotation.ServiceLog)")
	    public  void serviceAspect() {
	    }
	 
	    //Controller层切点
	    @Pointcut("@annotation(com.oojunzi.app.web.annotation.ControllerLog)")
	    public  void controllerAspect() {
	    }
	 
	    /**
	     * 前置通知 用于拦截Controller层记录用户的操作
	     *
	     * @param joinPoint 切点
	     */
	    @Before("controllerAspect()")
	    public  void doBefore(JoinPoint joinPoint) {
	        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	        Subject currentUser = SecurityUtils.getSubject();
	        Session session = currentUser.getSession();
	        // TODO 获取更多属性
	        
	        /* PrincipalCollection principalCollection = SecurityUtils.getSubject()  
	                .getPrincipals();  
	         
	            if (principalCollection != null) {        
	              List principals = principalCollection.asList();  
	              // 这里获取到的list有两个元素，  
	              //一个是cas返回来的用户名，举                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      例是aaa，  
	              //一个是cas返回的更多属性的map对象，举例是{uid:aaa,username:aaa,email:aaa}  
	              //通过principals.get(1)来获得属性集合的map对象  
	              Map<String,String> attributes = (Map<String,String>) principals.get(1);  
	              if (principals != null) {  
	                String email = attributes.get("email");  
	                String username = attributes.get("username");  
	                String uid = attributes.get("uid");  
	                //对获取到的信息进行再处理  
	              }  
	            }     
	        
	        String username = (String)principalCollection.getPrimaryPrincipal();*/ 
	        
	        //读取session中的用户
	        User user = (User) session.getAttribute("user");
	        //请求的IP
	        String ip = request.getRemoteAddr();
	        try {
	            //*========控制台输出=========*//
	            //System.out.println("=====前置通知开始=====");
	            //System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
	            //System.out.println("方法描述:" + getControllerMethodDescription(joinPoint));
	            //System.out.println("请求人:" + user.getUsername());
	            //System.out.println("请求IP:" + ip);
	            //*========数据库日志=========*//
	            AdminLog log = new AdminLog();
	            //需要转换成Json的HashMap
	            Map<String, Object> maps = new HashMap<String, Object>();
	            Map<String, Object> parammaps = new HashMap<String, Object>();
	            Object[] args = joinPoint.getArgs();
	            maps.put("description",getControllerMethodDescription(joinPoint));
	            maps.put("方法名", (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
	            parammaps.put("方法名",joinPoint.getTarget().getClass().getName());
	            //循环获得所有参数对象
	            /*for(int i=0; i<args.length; i++){
	                if (null != args[i]) {
	                    parammaps.put("args["+i+"]", args[i]);
	                }
	                else {
	                    parammaps.put("args["+i+"]", "空参数");
	                }
	            }*/
	            maps.put("参数", parammaps);
	            log.setIp(ip);
	            log.setContent(JSON.toJSONString(maps));
	            log.setAdminId(Integer.parseInt(user.getId().toString()));
	            log.setAdminName(user.getUsername());
	            log.setCreatetime(DateUtil.getTime());
	            log.setUrl(request.getRequestURI());
	            //保存数据库
	            logService.insert(log);
	            //System.out.println("=====前置通知结束=====");
	        }  catch (Exception e) {
	            //记录本地异常日志
	            logger.error("==前置通知异常==");
	            logger.error("异常信息:{}", e.getMessage());
	        }
	    }
	 
	    /**
	     * 异常通知 用于拦截service层记录异常日志
	     *
	     * @param joinPoint
	     * @param e
	     */
	    @AfterThrowing(pointcut = "serviceAspect()", throwing = "e")
	    public  void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
	    	
	        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	        //读取session中的用户
	        Subject currentUser = SecurityUtils.getSubject();
	        Session session = currentUser.getSession();
	        
	        User user = (User) session.getAttribute("user");
	        //获取请求ip
	        String ip = request.getRemoteAddr();
	        //获取用户请求方法的参数并序列化为JSON格式字符串
	        String params = "";
	        if (joinPoint.getArgs() !=  null && joinPoint.getArgs().length > 0) {
	            for ( int i = 0; i < joinPoint.getArgs().length; i++) {
	                params += JSON.toJSONString((joinPoint.getArgs()[i]) + ";");
	            }
	        }
	        try {
	              /*========控制台输出=========*/
	            //System.out.println("=====异常通知开始=====");
	            //System.out.println("异常代码:" + e.getClass().getName());
	            //System.out.println("异常信息:" + e.getMessage());
	            //System.out.println("异常方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
	            //System.out.println("方法描述:" + getServiceMthodDescription(joinPoint));
	            //System.out.println("请求人:" + user.getUsername());
	            //System.out.println("请求IP:" + ip);
	            //System.out.println("请求参数:" + params);
	               /*==========数据库日志=========*/
	            AdminLog log =  new AdminLog();
	            Map<String, Object> maps = new HashMap<String, Object>();
	            Map<String, Object> parammaps = new HashMap<String, Object>();
	            Object[] args = joinPoint.getArgs();
	 
	            //循环获得所有参数对象
	            for(int i=0; i<args.length; i++){
	                if (null != args[i]) {
	                    parammaps.put("args["+i+"]", args[i]);
	                }
	                else {
	                    parammaps.put("args["+i+"]", "空参数");
	                }
	            }
	            maps.put("方法名", (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
	            parammaps.put("方法名",joinPoint.getTarget().getClass().getName());
	            maps.put("参数", parammaps);
	            maps.put("ExceptionCode",e.getClass().getName());
	            maps.put("ExceptionDetail",e.getMessage());
	            maps.put("description",getServiceMthodDescription(joinPoint));
	            log.setIp(ip);
	            log.setContent(JSON.toJSONString(maps));
	            log.setAdminId(Integer.parseInt(user.getId().toString()));
	            log.setAdminName(user.getUsername());
	            log.setCreatetime(DateUtil.getTime());
	            log.setUrl(request.getRequestURI());
	            //保存数据库
	            logService.insert(log);
	            //System.out.println("=====异常通知结束=====");
	        }  catch (Exception ex) {
	            //记录本地异常日志
	            logger.error("==异常通知异常==");
	            logger.error("异常信息:{}", ex.getMessage());
	        }
	         /*==========记录本地异常日志==========*/
	        //logger.error("异常方法:{}异常代码:{}异常信息:{}参数:{}", joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName(), e.getClass().getName(), e.getMessage(), params);
	 
	    }
	 
	 
	    /**
	     * 获取注解中对方法的描述信息 用于service层注解
	     *
	     * @param joinPoint 切点
	     * @return 方法描述
	     * @throws Exception
	     */
	    public  static String getServiceMthodDescription(JoinPoint joinPoint)
	            throws Exception {
	        String targetName = joinPoint.getTarget().getClass().getName();
	        String methodName = joinPoint.getSignature().getName();
	        Object[] arguments = joinPoint.getArgs();
	        Class targetClass = Class.forName(targetName);
	        Method[] methods = targetClass.getMethods();
	        String description = "";
	        for (Method method : methods) {
	            if (method.getName().equals(methodName)) {
	                Class[] clazzs = method.getParameterTypes();
	                if (clazzs.length == arguments.length) {
	                    description = method.getAnnotation(ServiceLog. class).description();
	                    break;
	                }
	            }
	        }
	        return description;
	    }
	 
	    /**
	     * 获取注解中对方法的描述信息 用于Controller层注解
	     *
	     * @param joinPoint 切点
	     * @return 方法描述
	     * @throws Exception
	     */
	    public  static String getControllerMethodDescription(JoinPoint joinPoint)  throws Exception {
	        String targetName = joinPoint.getTarget().getClass().getName();
	        String methodName = joinPoint.getSignature().getName();
	        Object[] arguments = joinPoint.getArgs();
	        Class targetClass = Class.forName(targetName);
	        Method[] methods = targetClass.getMethods();
	        String description = "";
	        for (Method method : methods) {
	            if (method.getName().equals(methodName)) {
	                Class[] clazzs = method.getParameterTypes();
	                if (clazzs.length == arguments.length) {
	                    description = method.getAnnotation(ControllerLog. class).description();
	                    break;
	                }
	            }
	        }
	        return description;
	    }
}
