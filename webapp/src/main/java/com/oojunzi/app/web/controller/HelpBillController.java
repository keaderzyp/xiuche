package com.oojunzi.app.web.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.Bidi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.hibernate.validator.cfg.defs.AssertFalseDef;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.jmx.LoadBalanceConnectionGroupManager;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.util.DateUtil;
import com.oojunzi.app.web.dao.HelpPartakeMapper;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpBillExample;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.CarInfoService;
import com.oojunzi.app.web.service.HelpBillService;
import com.oojunzi.app.web.service.HelpInfoService;
import com.oojunzi.app.web.service.HelpPartakeService;


@Controller
@RequestMapping(value = "/bill")
public class HelpBillController {
	
	
	@Resource
	private HelpBillService helpBillService;
	@Resource
	HelpInfoService helpInfoService;
	@Resource
	private CarInfoService carInfoService;
	@Resource 
	HelpPartakeService helpPartakeService;
	@Resource
	HelpPartakeMapper helpPartakeMapper;
    /**
     * 账单管理
     */
    @RequestMapping("/billManage")
    public String billManage(Model model, HelpBillExample helpBillExample, HttpServletRequest httpServletRequest, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
    	
    	Page<User> page = new Page<>(pageNo,pageSize);
    	
    	HelpBillExample example = new HelpBillExample();
    	com.oojunzi.app.web.model.HelpBillExample.Criteria criteria = example.createCriteria();
    	
    	
    	if ( !(StringUtils.isEmpty(helpBillExample.getBillName()) )) {
    		criteria.andBillnameLike("%" +helpBillExample.getBillName() + "%");
		}
    	if ( !(StringUtils.isEmpty(helpBillExample.getStatus()))) {
    		criteria.andStatusEqualTo(helpBillExample.getStatus());
		} 		
    	
    		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    		
    		
    		
    		if(!(StringUtils.isEmpty(helpBillExample.getBeginTime())) || !(StringUtils.isEmpty(helpBillExample.getEndTime() ))  ){
    			try {
					example.createCriteria().andCreatetimeBetween(sdf.parse(helpBillExample.getBeginTime().trim()), sdf.parse(helpBillExample.getEndTime().trim()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			//example.createCriteria().andCreatetimeBetween(helpBillExample.getBeginTime().trim(), helpBillExample.getEndTime().trim());
			}*/
    	example.setOrderByClause("timezone desc");
    		List<HelpBill> helpBills = helpBillService.selectBillList(page,example);
    	
    		model.addAttribute("billList", helpBills);
        	model.addAttribute("page", page);
        	model.addAttribute("h", helpBillExample);
    	
        return "billManage";
    }
/**
 * 增加账单
 * @author michael
 * @throws ParseException 
 * 
 */
	@RequestMapping("/new")
	public String addBillInfo(HelpBill helpBill,@RequestParam(value = "id[]", required = false) String[] ids) throws ParseException{
		//主题id
		Long titleId = helpBillService.selectHelpBillId();
		//账单开始日期
		String begindate = null;
		//账单结束日期
		String enddate =null;
		if (helpBill.getParam2() != null ) {
			
			begindate = strToDateFormat(helpBill.getParam2());
		}
		
		if (helpBill.getParam3() != null ) {
			
			 enddate = strToDateFormat(helpBill.getParam3());
		}
		
		
		
		//参与分摊车辆 账单结束日期之前 car 状态为5的车辆
		int total = helpBillService.selectCarJoinList(enddate);
		String carids="";
		List list = helpBillService.selectCarIdsList(enddate);
		for (int i = 0; i < list.size(); i++) {
			
			carids +=  list.get(i) + ","; 
			
		}
		
		if (ids != null && ids.length != 0) {
		
		for (int i = 0; i < ids.length; i++) {
			
			HelpInfo helpInfo = helpInfoService.selectByPrimaryKey(new BigDecimal(ids[i]));
			helpBill.setBillid(helpBillService.selectHelpBillIdForPK());
			//主题id
			helpBill.setTitleid(titleId);
			//分摊费用
			helpBill.setCostdone(new BigDecimal(sub(helpInfo.getFactCost().doubleValue(),helpInfo.getOwnerPay().doubleValue())));
			//参与分摊车辆
			helpBill.setParam4(String.valueOf(total));
			//状态
			helpBill.setStatus("0");
			//创建时间
			helpBill.setCreatetime(new Date());
			//事故次数
			helpBill.setParam1(String.valueOf(ids.length));
			//是否有事故 0: 无事故 1:有事故
			helpBill.setAccidenttype("1");
			//区间字段
			helpBill.setTimezone(begindate+"-"+enddate);
			//参与分摊车辆id集合
			helpBill.setParam5(carids);
			//发起求助的车俩id
			helpBill.setParam6(String.valueOf(helpInfo.getCarFid()));
			//车主承担费用
			helpBill.setParam7(String.valueOf(helpInfo.getOwnerPay()));	
			//事故总费用
			helpBill.setParam8(String.valueOf(helpInfo.getFactCost()));
			//事故id
			helpBill.setHelpid(helpInfo.getHelpId().longValue());
			
			helpBillService.insertHelpBillInfo(helpBill);
			}
		}
		else {
			helpBill.setBillid(helpBillService.selectHelpBillIdForPK());
			helpBill.setCostdone(new BigDecimal(0));
			helpBill.setTitleid(titleId);
			helpBill.setAccidenttype("0");
			helpBill.setStatus("3");
			helpBill.setCreatetime(new Date());
			helpBill.setParam1("0");
			helpBill.setTimezone(begindate+"-"+enddate);
		}
		
		//to do 
		//生成对应条数的账单记录
		//参与车辆为 互助协议生效截止到区间的end
		//System.out.println(ids);
		
		
		return "index";
	}
	
	/**
	 * 查询账单 for grid
	 * 
	 */
	/*@RequestMapping("/getBillInfoList")
	@ResponseBody
	public String getBillInfoList() {

		List<HelpBill> helpBills = helpBillService.selectBillList();
		return JSON.toJSONString(helpBills);
	}*/

	public static String strToDateFormat(String date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		formatter.setLenient(false);
		Date newDate = formatter.parse(date);
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(newDate);
	}
	   
	/**
	 * 计算账单 插入分摊详情表
	 * @author michael
	 * 
	 */
	   @RequestMapping("/calculate")
	   public String calculateBill(@RequestParam("id") String titleId){
		   //计算当前用户记录 名下车辆 分摊金额
		   	/*Subject currentUser = SecurityUtils.getSubject();
			Session session = currentUser.getSession();
			User user = (User) session.getAttribute("user");
			CarInfoExample example = new CarInfoExample();
			BigDecimal id = new BigDecimal(user.getId());
			example.createCriteria().andUserIdEqualTo(id);
			List<CarInfo> carInfoList = carInfoService.selectByExample(example);*/
		   
			//此次主题账单分摊费用总额
			
			HelpBill helpBill = helpBillService.selectBillByTitleId(titleId);
			BigDecimal totalCost = helpBill.getCostdone();
			
			
			//取出发起车辆id 
			List helpCarids = helpBillService.selectCarIdsFromHelpByTitleId(titleId);
			
			//计算此次账单分摊的所有车辆ids
			String carIds = "";
			List queryString = new ArrayList<>();
			List list = helpBillService.selectCarListByTitleId(titleId);
			
			
			for (int i = 0; i < helpCarids.size(); i++) {
				
				for (int j = 0; j < list.size(); j++) {
					
					if (helpCarids.get(i).equals(list.get(j))){
						
						list.remove(j);
					}
					
				}
				
			}
			
			
			for (int i = 0; i < list.size(); i++) {
				
				carIds += list.get(i);
				
			}
			
			String[] array = carIds.split(",");
			
			for (int i = 0; i < array.length; i++) {
				
				queryString.add(array[i]); 
				
			}
			
			//所有此次账单日截止之前互助生效车辆分摊上限的和
			double totalmax = helpBillService.selectPartakeTotalByCarIds(queryString);
			
			List<CarInfo> carInfoList = carInfoService.selectCarJoinByCarids(queryString);
			
			
			
			//计算每起事故 需要分摊的车辆的分摊金额
			
			List<HelpBill> helpBills = helpBillService.selectBillListByTitleId(titleId);
			
			HelpPartake helpPartake = new HelpPartake();
			
			SimpleDateFormat sdfTime = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			
			
			for (HelpBill helpBill2 : helpBills) {
				
					   for (CarInfo carInfo : carInfoList) {
							   //获得当前车辆权值
								  double costscale = div(carInfo.getPartakeMax().doubleValue(),totalmax,2);
								  
								  //计算该车辆此次事故需分摊金额
								  double partake = round(mul(costscale, helpBill2.getCostdone().doubleValue()), 2);   
								  
								  helpPartake.setPayId(new BigDecimal(helpPartakeMapper.selectHelpPartakeId()));
								  //求助id
								  helpPartake.setHelpFid(new BigDecimal(helpBill2.getHelpid()));
								  //车辆id
								  helpPartake.setCarFid(carInfo.getId());
								  //此次事故中该车需分摊的费用
								  helpPartake.setFactPay(new BigDecimal(partake));
								  //主题id
								  helpPartake.setParam1(titleId);
								  //是否支付 1 已支付 2 未支付
								  helpPartake.setStatus("2");
								  //下达时间
								  helpPartake.setInformTime((new Date()));
								  
								  helpPartakeMapper.insert(helpPartake);
			
						  
						
					}
					   
					   helpBill2.setStatus("3");
					   helpBillService.updateHelpStatus(helpBill2);
					   
			}
		   
		   
		   
		   return "billManage";
	   }
	   
	   /**
		 * 维护账单状态
		 * @author michael
		 */
		@RequestMapping(value="/verify")
		public String maintainBillStatus(@RequestParam("id") String titleId){
			
			List<HelpBill> helpBills = helpBillService.selectBillListByTitleId(titleId);
			
			for (HelpBill helpBill : helpBills) {
				
				helpBill.setStatus("1");
				helpBillService.updateHelpStatus(helpBill);
			}
			
			return "billManage";
			
		}
		@RequestMapping(value="/unverify")
		public String cancelBillStatus(@RequestParam("id") String titleId){
			
			List<HelpBill> helpBills = helpBillService.selectBillListByTitleId(titleId);
			
			for (HelpBill helpBill : helpBills) {
				
				helpBill.setStatus("0");
				helpBillService.updateHelpStatus(helpBill);
			}
			
			return "billManage";
			
		}
		/**
		 * 删除账单
		 * @param titleId
		 * @return
		 */
		@RequestMapping(value="/del")
		public String delBillByTitle(@RequestParam("id") String titleId){
			
			List<HelpBill> helpBills = helpBillService.selectBillListByTitleId(titleId);
			
			for (HelpBill helpBill : helpBills) {
				
				helpBillService.deleteByBillId(helpBill.getBillid());
			}
			
			return "billManage";
			
		}
		
		/**
		 * 
		 * 根据主题名称查询
		 * @return
		 * @throws UnsupportedEncodingException 
		 */
		
		
		@RequestMapping(value = "/billByTitle")
		@ResponseBody
		public String userBytelephone(Model model, @RequestParam("filter") String title) throws UnsupportedEncodingException {
			
			String titleString =java.net.URLDecoder.decode(title, "UTF-8");
			HelpBillExample example = new HelpBillExample();
			example.createCriteria().andBillnameLike("%" + URLDecoder.decode(titleString,"UTF-8") + "%");
			
			List<HelpBill> userList = helpBillService.selectBillListByBillName(example);

			return JSON.toJSONString(userList);

		}
		/**
		 * 添加查询参数给页面
		 * @throws UnsupportedEncodingException 
		 * 
		 * 
		 */
		@RequestMapping(value = "/addFilter")
		public String addFiltersIntoPage(@RequestParam("filter") String filter ,Model model) throws UnsupportedEncodingException{
			
			String filterStr = java.net.URLDecoder.decode(filter);
			
			model.addAttribute("searchFilter", URLDecoder.decode(filterStr,"UTF-8"));
			
			
			return "billManage";
		}
		
		
		
		
	   public static double div(double v1,double v2,int scale){   
		   if(scale<0){   
		   throw new IllegalArgumentException(   
		   "The scale must be a positive integer or zero");   
		   }   
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));   
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));   
		   return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();   
		   }   
	   
	   public static double round(double v,int scale){   
		   if(scale<0){   
		   throw new IllegalArgumentException("The scale must be a positive integer or zero");   
		   }   
		   BigDecimal b = new BigDecimal(Double.toString(v));   
		   BigDecimal one = new BigDecimal("1");   
		   return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();   
		   }   
	   public static double mul(double v1,double v2){   
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));   
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));   
		   return b1.multiply(b2).doubleValue();   
		   }   
	   public static double sub(double v1,double v2){   
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));   
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));   
		   return b1.subtract(b2).doubleValue();   
		   }   
}
