package com.oojunzi.app.web.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;

/**
 * 用户Dao接口
 * 
 * @author michael
 * @since 2016年7月5日 上午11:49:57
 **/
public interface UserMapper extends GenericDao<User, Long> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
     User selectByUsername(User record);
    User selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
    
    
    /**
     * 查询用户所在圈的圈友信息
     */
    //add yuhb
    List<User> selectUsersByCircle(Long userid);
   /*查询用户表ID*/
    
    //add zhwh

    long selectUserId();
    
}