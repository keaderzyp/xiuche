package com.oojunzi.app.web.service;

import java.math.BigDecimal;
import java.util.List;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;

public interface HelpInfoService {

    List<HelpInfo> selectByExample(HelpInfoExample example);
    List<HelpInfo> selectByExampleAndPage(Page<HelpInfo> page,String id, HelpInfoExample example);
    List<HelpInfo> selectByExampleAndPage(Page<HelpInfo> page, HelpInfoExample example);
    int countByExample(HelpInfoExample example);
    int insertSelective(HelpInfo record);
    long  selectHelpInfoId();
    int updateHelpInfo(HelpInfo record);
    int updateHelpInfobyId(HelpInfo record);
    
    HelpInfo selectByPrimaryKey(BigDecimal helpId);
}
