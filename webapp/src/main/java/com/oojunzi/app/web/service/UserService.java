package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserWeather;

/**
 * 用户 业务 接口
 * 
 * @author michael
 * @since 2016年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
       
    
    
    /**
     * 
     * //TODO 查询所有用户
     * @param example
     * @return
     */
    
    List<User> selectByExample(UserExample example);
    /**
     * 
     * //TODO 查询所有用户and page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
    
    
    /*根据用户名查id
     * 
     * 
     * */
    
    User selectById(String id);
    

    long selectUserId();
   
  //add LGQ  根据城市和时间查天气
    UserWeather selectByCityAndTime(UserWeather userWeather);
    
    int insertSelective(UserWeather record);
    
	//List<UserInfo> getCarManagerListByLikeName(String cname);
}
