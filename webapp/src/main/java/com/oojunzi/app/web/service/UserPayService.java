package com.oojunzi.app.web.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserPayExample;

public interface UserPayService extends GenericService<User, Long> {

	/*
	 * 
	 * 向 t_user_pay 中插入数据
	 * 
	 * */
	
	 List<UserPay> selectByExampleAndPage(Page<UserPay> page, UserPayExample example);
	    
	int insertUserPay (UserPay userPay);
	List<UserPay> selectPayByWeek(Page<UserPay> page,BigDecimal userId);
	long selectPayId();
	int selectByUserId(BigDecimal id);
}
