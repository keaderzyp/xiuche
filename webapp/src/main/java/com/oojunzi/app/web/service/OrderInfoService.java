package com.oojunzi.app.web.service;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.OrderInfo;
import com.oojunzi.app.web.model.User;

public interface OrderInfoService extends GenericService<User, Long>{
/*
 * 想订单表中插入数据
 * */
	
	 int insertOrderInfo (OrderInfo orderInfo); 
	 
	 
	 /*
	  * 解决id问题
	  * 
	  * */
	 long selectId();
}
