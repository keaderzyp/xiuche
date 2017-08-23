package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.HelpSpot;
import com.oojunzi.app.web.model.HelpSpotExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpSpotMapper {
    int countByExample(HelpSpotExample example);

    int deleteByExample(HelpSpotExample example);

    int deleteByPrimaryKey(BigDecimal spotId);

    int insert(HelpSpot record);

    int insertSelective(HelpSpot record);

    List<HelpSpot> selectByExample(HelpSpotExample example);

    HelpSpot selectByPrimaryKey(BigDecimal spotId);

    int updateByExampleSelective(@Param("record") HelpSpot record, @Param("example") HelpSpotExample example);

    int updateByExample(@Param("record") HelpSpot record, @Param("example") HelpSpotExample example);

    int updateByPrimaryKeySelective(HelpSpot record);

    int updateByPrimaryKey(HelpSpot record);
}