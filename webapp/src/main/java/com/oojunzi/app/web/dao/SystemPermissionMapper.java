package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.SystemPermission;
import com.oojunzi.app.web.model.SystemPermissionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemPermissionMapper {
    int countByExample(SystemPermissionExample example);

    int deleteByExample(SystemPermissionExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    List<SystemPermission> selectByExample(SystemPermissionExample example);

    SystemPermission selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SystemPermission record, @Param("example") SystemPermissionExample example);

    int updateByExample(@Param("record") SystemPermission record, @Param("example") SystemPermissionExample example);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);
}