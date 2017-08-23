package com.oojunzi.app.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.dao.UserTimerecodeMapper;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.model.UserTimerecodeExample;
import com.oojunzi.app.web.service.UserTimerecodeService;

@Service
public class UserTimerecodeServiceImpl  implements UserTimerecodeService{

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
	private UserTimerecodeMapper userTimerecodeMapper;
	@Override
	public int insertUser(UserTimerecode usertimerecode) {
		// TODO Auto-generated method stub
		int a=userTimerecodeMapper.insertNewRecode(usertimerecode);
		return 0;
	}

	@Override
	public long selectUserTimerecode() {
		// TODO Auto-generated method stub
		long  a=userTimerecodeMapper.selectUserTimerecode();
		return a;
	}

}
