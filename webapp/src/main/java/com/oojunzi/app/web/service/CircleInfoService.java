package com.oojunzi.app.web.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.CircleInfoExample;

public interface CircleInfoService {
	
    List<CircleInfo> selectByExample(CircleInfoExample example);

    CircleInfo selectByPrimaryKey(BigDecimal circleId);

    CircleInfo selectByUserId(BigDecimal userId);
    long selectCircleId();
    int insertCircle(CircleInfo record);  
    
	//根据用户id获取对应小圈车辆统计信息
    CircleInfo selectCarInfoByUserId(BigDecimal userId);
    
    //根据用户id获取小圈最新求助时间
  	public Date  sltCircleNearHelpTime(BigDecimal userId);
  	
    int updateByPrimaryKeySelective(CircleInfo record);
}
