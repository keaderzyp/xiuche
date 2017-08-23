package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.SystemRole;
import com.oojunzi.app.web.model.SystemRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRoleMapper {
    int countByExample(SystemRoleExample example);

    int deleteByExample(SystemRoleExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SystemRole record);

    int insertSelective(SystemRole record);

    List<SystemRole> selectByExample(SystemRoleExample example);

    SystemRole selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SystemRole record, @Param("example") SystemRoleExample example);

    int updateByExample(@Param("record") SystemRole record, @Param("example") SystemRoleExample example);

    int updateByPrimaryKeySelective(SystemRole record);

    int updateByPrimaryKey(SystemRole record);
}