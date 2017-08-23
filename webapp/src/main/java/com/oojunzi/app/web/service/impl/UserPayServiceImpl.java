package com.oojunzi.app.web.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.dao.UserPayMapper;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserPayExample;
import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.service.UserPayService;
import com.oojunzi.app.web.service.UserTimerecodeService;
@Service
public class UserPayServiceImpl  implements UserPayService{

	@Override
	public int insert(User model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	  @Resource
	    private UserPayMapper userPayMapper;
	@Override
	public int insertUserPay(UserPay userPay) {
		
		return userPayMapper.insert(userPay);
	}

	@Override
	public List<UserPay> selectPayByWeek(Page<UserPay> page,BigDecimal userId) {
		// TODO Auto-generated method stub
		return userPayMapper.selectPayByWeek(page,userId);
	}

	@Override
	public long selectPayId() {
		// TODO Auto-generated method stub
		return userPayMapper.selectPayId();
	}

	@Override
	public int selectByUserId(BigDecimal id) {
		// TODO Auto-generated method stub
		return userPayMapper.selectByUserId(id);
	}

	@Override
	public List<UserPay> selectByExampleAndPage(Page<UserPay> page, UserPayExample example) {
		// TODO Auto-generated method stub
		return userPayMapper.selectByExampleAndPage(page, example);
	}

}
