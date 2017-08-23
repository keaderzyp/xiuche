package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpInfoMapper {
    int countByExample(HelpInfoExample example);

    int deleteByExample(HelpInfoExample example);

    int deleteByPrimaryKey(BigDecimal helpId);

    int insert(HelpInfo record);

    int insertSelective(HelpInfo record);

    List<HelpInfo> selectByExample(HelpInfoExample example);

    HelpInfo selectByPrimaryKey(BigDecimal helpId);

    int updateByExampleSelective(@Param("record") HelpInfo record, @Param("example") HelpInfoExample example);

    int updateByExample(@Param("record") HelpInfo record, @Param("example") HelpInfoExample example);

    int updateByPrimaryKeySelective(HelpInfo record);

    int updateByPrimaryKey(HelpInfo record);
    //add zhwh

    long  selectHelpInfoId();

	List<HelpInfo> selectByExampleAndPage(Page<HelpInfo> page, HelpInfoExample example);
}