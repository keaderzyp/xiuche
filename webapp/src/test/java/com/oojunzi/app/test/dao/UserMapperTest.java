package com.oojunzi.app.test.dao;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.feature.test.TestSupport;
import com.oojunzi.app.web.dao.UserMapper;
import com.oojunzi.app.web.dao.UserPayMapper;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserPay;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserPayMapper userPayMapper;
    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
    @Test
    public void test_selectPayByWeek() {
        start();
        Page<UserPay> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
		List<UserPay> userPayList = userPayMapper.selectPayByWeek(page,new BigDecimal("18"));
		for (UserPay userPay : userPayList) {
			System.out.println(userPay.getParam1());
		}
        end();
    }
  
}
