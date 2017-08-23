package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ScoreUserinfo;
import com.oojunzi.app.web.model.ScoreUserinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreUserinfoMapper {
    int countByExample(ScoreUserinfoExample example);

    int deleteByExample(ScoreUserinfoExample example);

    int deleteByPrimaryKey(BigDecimal userId);

    int insert(ScoreUserinfo record);

    int insertSelective(ScoreUserinfo record);

    List<ScoreUserinfo> selectByExample(ScoreUserinfoExample example);

    ScoreUserinfo selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") ScoreUserinfo record, @Param("example") ScoreUserinfoExample example);

    int updateByExample(@Param("record") ScoreUserinfo record, @Param("example") ScoreUserinfoExample example);

    int updateByPrimaryKeySelective(ScoreUserinfo record);

    int updateByPrimaryKey(ScoreUserinfo record);
}