package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserGroup;
import com.oojunzi.app.web.model.UserGroupExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    int countByExample(UserGroupExample example);

    int deleteByExample(UserGroupExample example);

    int deleteByPrimaryKey(BigDecimal groupId);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    List<UserGroup> selectByExample(UserGroupExample example);

    UserGroup selectByPrimaryKey(BigDecimal groupId);

    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
}