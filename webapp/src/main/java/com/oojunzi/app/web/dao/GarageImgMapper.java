package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.GarageImg;
import com.oojunzi.app.web.model.GarageImgExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GarageImgMapper {
    int countByExample(GarageImgExample example);

    int deleteByExample(GarageImgExample example);

    int deleteByPrimaryKey(BigDecimal gimgId);

    int insert(GarageImg record);

    int insertSelective(GarageImg record);

    List<GarageImg> selectByExample(GarageImgExample example);

    GarageImg selectByPrimaryKey(BigDecimal gimgId);

    int updateByExampleSelective(@Param("record") GarageImg record, @Param("example") GarageImgExample example);

    int updateByExample(@Param("record") GarageImg record, @Param("example") GarageImgExample example);

    int updateByPrimaryKeySelective(GarageImg record);

    int updateByPrimaryKey(GarageImg record);
}