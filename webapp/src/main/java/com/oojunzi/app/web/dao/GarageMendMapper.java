package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.GarageMend;
import com.oojunzi.app.web.model.GarageMendExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GarageMendMapper {
    int countByExample(GarageMendExample example);

    int deleteByExample(GarageMendExample example);

    int deleteByPrimaryKey(BigDecimal mendId);

    int insert(GarageMend record);

    int insertSelective(GarageMend record);

    List<GarageMend> selectByExample(GarageMendExample example);

    GarageMend selectByPrimaryKey(BigDecimal mendId);

    int updateByExampleSelective(@Param("record") GarageMend record, @Param("example") GarageMendExample example);

    int updateByExample(@Param("record") GarageMend record, @Param("example") GarageMendExample example);

    int updateByPrimaryKeySelective(GarageMend record);

    int updateByPrimaryKey(GarageMend record);
}