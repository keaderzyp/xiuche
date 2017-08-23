package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ScorePlan;
import com.oojunzi.app.web.model.ScorePlanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScorePlanMapper {
    int countByExample(ScorePlanExample example);

    int deleteByExample(ScorePlanExample example);

    int deleteByPrimaryKey(BigDecimal planId);

    int insert(ScorePlan record);

    int insertSelective(ScorePlan record);

    List<ScorePlan> selectByExample(ScorePlanExample example);

    ScorePlan selectByPrimaryKey(BigDecimal planId);

    int updateByExampleSelective(@Param("record") ScorePlan record, @Param("example") ScorePlanExample example);

    int updateByExample(@Param("record") ScorePlan record, @Param("example") ScorePlanExample example);

    int updateByPrimaryKeySelective(ScorePlan record);

    int updateByPrimaryKey(ScorePlan record);
}