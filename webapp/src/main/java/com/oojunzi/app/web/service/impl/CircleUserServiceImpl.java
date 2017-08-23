package com.oojunzi.app.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.CircleUserMapper;
import com.oojunzi.app.web.model.CircleUser;
import com.oojunzi.app.web.model.CircleUserExample;
import com.oojunzi.app.web.service.CircleUserService;

@Service
public class CircleUserServiceImpl implements CircleUserService {
	
	@Autowired
	private CircleUserMapper circleUserMapper;

	@Override
	public List<CircleUser> selectByExample(CircleUserExample example) {
		return circleUserMapper.selectByExample(example);
	}
	@Override
	public int insertCircleUser(CircleUser record) {
		// TODO Auto-generated method stub
		int a=circleUserMapper.insert(record);
		return 0;
	}

	@Override
	public long selectId() {
		// TODO Auto-generated method stub
		long a=circleUserMapper.selectId();
		return a;
	}

}
