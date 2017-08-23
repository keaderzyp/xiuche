package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.HelpHelpimg;
import com.oojunzi.app.web.model.HelpHelpimgExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpHelpimgMapper {
    int countByExample(HelpHelpimgExample example);

    int deleteByExample(HelpHelpimgExample example);

    int deleteByPrimaryKey(BigDecimal helpimgId);

    int insert(HelpHelpimg record);

    int insertSelective(HelpHelpimg record);

    List<HelpHelpimg> selectByExample(HelpHelpimgExample example);

    HelpHelpimg selectByPrimaryKey(BigDecimal helpimgId);

    int updateByExampleSelective(@Param("record") HelpHelpimg record, @Param("example") HelpHelpimgExample example);

    int updateByExample(@Param("record") HelpHelpimg record, @Param("example") HelpHelpimgExample example);

    int updateByPrimaryKeySelective(HelpHelpimg record);

    int updateByPrimaryKey(HelpHelpimg record);
}