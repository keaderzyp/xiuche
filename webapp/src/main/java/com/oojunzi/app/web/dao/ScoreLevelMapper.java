package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ScoreLevel;
import com.oojunzi.app.web.model.ScoreLevelExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreLevelMapper {
    int countByExample(ScoreLevelExample example);

    int deleteByExample(ScoreLevelExample example);

    int deleteByPrimaryKey(BigDecimal slevelId);

    int insert(ScoreLevel record);

    int insertSelective(ScoreLevel record);

    List<ScoreLevel> selectByExample(ScoreLevelExample example);

    ScoreLevel selectByPrimaryKey(BigDecimal slevelId);

    int updateByExampleSelective(@Param("record") ScoreLevel record, @Param("example") ScoreLevelExample example);

    int updateByExample(@Param("record") ScoreLevel record, @Param("example") ScoreLevelExample example);

    int updateByPrimaryKeySelective(ScoreLevel record);

    int updateByPrimaryKey(ScoreLevel record);
}