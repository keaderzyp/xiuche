package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.CarType;
import com.oojunzi.app.web.model.CarTypeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTypeMapper {
    int countByExample(CarTypeExample example);

    int deleteByExample(CarTypeExample example);

    int deleteByPrimaryKey(BigDecimal typeId);

    int insert(CarType record);

    int insertSelective(CarType record);

    List<CarType> selectByExample(CarTypeExample example);

    CarType selectByPrimaryKey(BigDecimal typeId);

    int updateByExampleSelective(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByExample(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}