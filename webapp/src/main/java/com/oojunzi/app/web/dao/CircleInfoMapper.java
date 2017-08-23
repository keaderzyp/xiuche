package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.CircleInfoExample;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleInfoMapper {
    int countByExample(CircleInfoExample example);

    int deleteByExample(CircleInfoExample example);

    int deleteByPrimaryKey(BigDecimal circleId);

    int insert(CircleInfo record);

    int insertSelective(CircleInfo record);

    List<CircleInfo> selectByExample(CircleInfoExample example);

    CircleInfo selectByPrimaryKey(BigDecimal circleId);

    int updateByExampleSelective(@Param("record") CircleInfo record, @Param("example") CircleInfoExample example);

    int updateByExample(@Param("record") CircleInfo record, @Param("example") CircleInfoExample example);

    int updateByPrimaryKeySelective(CircleInfo record);

    int updateByPrimaryKey(CircleInfo record);
    
    //add yuhb
    
    CircleInfo selectByUserId(BigDecimal circleId);
    //add zhwh
    public long selectCircleId();
    //add yuhb
        
	//根据用户id获取对应小圈车辆统计信息
    CircleInfo selectCarInfoByUserId(BigDecimal userId);
    
    Date  sltCircleNearHelpTime(BigDecimal userId);
}