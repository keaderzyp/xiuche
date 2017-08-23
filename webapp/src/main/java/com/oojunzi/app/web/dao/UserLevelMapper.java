package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserLevel;
import com.oojunzi.app.web.model.UserLevelExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLevelMapper {
    int countByExample(UserLevelExample example);

    int deleteByExample(UserLevelExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(UserLevel record);

    int insertSelective(UserLevel record);

    List<UserLevel> selectByExample(UserLevelExample example);

    int updateByExampleSelective(@Param("record") UserLevel record, @Param("example") UserLevelExample example);

    int updateByExample(@Param("record") UserLevel record, @Param("example") UserLevelExample example);
}