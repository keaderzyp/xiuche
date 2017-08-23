package com.oojunzi.app.web.service;


import java.util.List;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.User;

/**
 * 用户 业务 接口
 * 
 * @author yuhb
 * @since 2017年7月4日 
 **/
public interface UserAddService extends GenericService<User, Long> {

	
	/**
     * 用户注册
     * @param user
     * @return
     */
    int insertUser(User user);
  
    public List<User> selectUsersByCircle(Long userid);
    
}
