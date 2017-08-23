package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ScoreRecord;
import com.oojunzi.app.web.model.ScoreRecordExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreRecordMapper {
    int countByExample(ScoreRecordExample example);

    int deleteByExample(ScoreRecordExample example);

    int deleteByPrimaryKey(BigDecimal recordId);

    int insert(ScoreRecord record);

    int insertSelective(ScoreRecord record);

    List<ScoreRecord> selectByExample(ScoreRecordExample example);

    ScoreRecord selectByPrimaryKey(BigDecimal recordId);

    int updateByExampleSelective(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);

    int updateByExample(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);

    int updateByPrimaryKeySelective(ScoreRecord record);

    int updateByPrimaryKey(ScoreRecord record);
}