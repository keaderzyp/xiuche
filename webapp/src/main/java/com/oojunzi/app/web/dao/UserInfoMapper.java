package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserInfo;
import com.oojunzi.app.web.model.UserInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper extends GenericDao<User, Long>  {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(BigDecimal userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}