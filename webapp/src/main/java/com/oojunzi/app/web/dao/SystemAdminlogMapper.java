package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.SystemAdminlog;
import com.oojunzi.app.web.model.SystemAdminlogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdminlogMapper {
    int countByExample(SystemAdminlogExample example);

    int deleteByExample(SystemAdminlogExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SystemAdminlog record);

    int insertSelective(SystemAdminlog record);

    List<SystemAdminlog> selectByExample(SystemAdminlogExample example);

    SystemAdminlog selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SystemAdminlog record, @Param("example") SystemAdminlogExample example);

    int updateByExample(@Param("record") SystemAdminlog record, @Param("example") SystemAdminlogExample example);

    int updateByPrimaryKeySelective(SystemAdminlog record);

    int updateByPrimaryKey(SystemAdminlog record);
}