package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ScorePlandt;
import com.oojunzi.app.web.model.ScorePlandtExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScorePlandtMapper {
    int countByExample(ScorePlandtExample example);

    int deleteByExample(ScorePlandtExample example);

    int deleteByPrimaryKey(BigDecimal plandtId);

    int insert(ScorePlandt record);

    int insertSelective(ScorePlandt record);

    List<ScorePlandt> selectByExample(ScorePlandtExample example);

    ScorePlandt selectByPrimaryKey(BigDecimal plandtId);

    int updateByExampleSelective(@Param("record") ScorePlandt record, @Param("example") ScorePlandtExample example);

    int updateByExample(@Param("record") ScorePlandt record, @Param("example") ScorePlandtExample example);

    int updateByPrimaryKeySelective(ScorePlandt record);

    int updateByPrimaryKey(ScorePlandt record);
}