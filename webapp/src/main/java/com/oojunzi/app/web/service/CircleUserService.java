package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.web.model.CircleUser;
import com.oojunzi.app.web.model.CircleUserExample;

public interface CircleUserService {

    List<CircleUser> selectByExample(CircleUserExample example);
    int  insertCircleUser (CircleUser record);
    long   selectId();
}
