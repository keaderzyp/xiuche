package com.oojunzi.app.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.OrderInfoMapper;
import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.model.OrderInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.OrderInfoService;
@Service
public class OrderInfoServiceImpl  implements OrderInfoService{

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
	    private OrderInfoMapper orderInfoMapper;
	@Override
	public int insertOrderInfo(OrderInfo orderInfo) {
		// TODO Auto-generated method stub
		int  a=orderInfoMapper.insert(orderInfo);
		return 0;
	}

	@Override
	public long selectId() {
		// TODO Auto-generated method stub\
		long b=orderInfoMapper.selectNextSEQ();
		return b;
	}

}
