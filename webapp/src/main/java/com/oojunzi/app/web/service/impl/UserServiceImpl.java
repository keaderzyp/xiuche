package com.oojunzi.app.web.service.impl;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.core.generic.GenericServiceImpl;
import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.dao.UserWeatherMapper;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserWeather;
import com.oojunzi.app.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author michael
 * @since 2016年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserWeatherMapper userWeatherMapper;
    
    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        if(list.size() == 0)
        	return null;
        return list.get(0);
    }

	@Override
	public List<User> selectByExample(UserExample example) {
		List<User> users = userMapper.selectByExample(example);
	
		return users;
	}
	@Override
	public User selectById(String id) {
		
		return userMapper.selectByPrimaryKey(new BigDecimal(id));
	}

	@Override
	public long selectUserId() {
		// TODO Auto-generated method stub
		return userMapper.selectUserId();
	}

	@Override
	public UserWeather selectByCityAndTime(UserWeather userWeather) {
		// TODO Auto-generated method stub
		return userWeatherMapper.selectByCityAndTime(userWeather);
	}

	@Override
	public int insertSelective(UserWeather record) {
		// TODO Auto-generated method stub
		return userWeatherMapper.insertSelective(record);
	}

	@Override
	public List<User> selectByExampleAndPage(Page<User> page, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExampleAndPage(page, example);
	}
	

}
