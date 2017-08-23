package com.oojunzi.app.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.UserAddService;
import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.core.generic.GenericServiceImpl;
import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.UserService;
@Service
public class UserAddServiceImpl implements UserAddService {

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
    private UserMapper userMapper;
	//***********一下add yuhb
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
        int a= userMapper.insertSelective(user);
		return a ;
	}


	
	//***********以下add yuhb
	@Override
	public List<User> selectUsersByCircle(Long userid) {
		// TODO Auto-generated method stub
		List<User> userList = userMapper.selectUsersByCircle(userid);
		return userList;
	}

	

}
