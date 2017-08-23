package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.HelpSpotimg;
import com.oojunzi.app.web.model.HelpSpotimgExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpSpotimgMapper {
    int countByExample(HelpSpotimgExample example);

    int deleteByExample(HelpSpotimgExample example);

    int deleteByPrimaryKey(BigDecimal spotimgId);

    int insert(HelpSpotimg record);

    int insertSelective(HelpSpotimg record);

    List<HelpSpotimg> selectByExample(HelpSpotimgExample example);

    HelpSpotimg selectByPrimaryKey(BigDecimal spotimgId);

    int updateByExampleSelective(@Param("record") HelpSpotimg record, @Param("example") HelpSpotimgExample example);

    int updateByExample(@Param("record") HelpSpotimg record, @Param("example") HelpSpotimgExample example);

    int updateByPrimaryKeySelective(HelpSpotimg record);

    int updateByPrimaryKey(HelpSpotimg record);
}