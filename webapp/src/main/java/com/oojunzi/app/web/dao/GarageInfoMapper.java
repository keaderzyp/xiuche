package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.GarageInfo;
import com.oojunzi.app.web.model.GarageInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GarageInfoMapper {
    int countByExample(GarageInfoExample example);

    int deleteByExample(GarageInfoExample example);

    int deleteByPrimaryKey(BigDecimal garageId);

    int insert(GarageInfo record);

    int insertSelective(GarageInfo record);

    List<GarageInfo> selectByExample(GarageInfoExample example);

    GarageInfo selectByPrimaryKey(BigDecimal garageId);

    int updateByExampleSelective(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByExample(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByPrimaryKeySelective(GarageInfo record);

    int updateByPrimaryKey(GarageInfo record);
}