package com.oojunzi.app.test.service;

import java.util.Date;
import javax.annotation.Resource;

import org.junit.Test;

import com.oojunzi.app.core.feature.test.TestSupport;
import com.oojunzi.app.core.util.ApplicationUtils;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.UserService;

public class UserServiceTest extends TestSupport {

    @Resource
    private UserService userService;

//    @Test
    public void test_insert() {
        User model = new User();
        model.setUsername("michael");
        model.setPassword(ApplicationUtils.sha256Hex("123456"));
        model.setCreateTime(new Date());
        userService.insert(model);
    }

//    @Test
    public void test_10insert() {
        for (int i = 0; i < 10; i++) {
            User model = new User();
            model.setUsername("michael" + i);
            model.setPassword(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            userService.insert(model);
        }
    }

}
