package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.CarMaxFormula;
import com.oojunzi.app.web.model.CarMaxFormulaExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMaxFormulaMapper {
    int countByExample(CarMaxFormulaExample example);

    int deleteByExample(CarMaxFormulaExample example);

    int deleteByPrimaryKey(String formulaId);

    int insert(CarMaxFormula record);

    int insertSelective(CarMaxFormula record);

    List<CarMaxFormula> selectByExample(CarMaxFormulaExample example);

    CarMaxFormula selectByPrimaryKey(String formulaId);

    int updateByExampleSelective(@Param("record") CarMaxFormula record, @Param("example") CarMaxFormulaExample example);

    int updateByExample(@Param("record") CarMaxFormula record, @Param("example") CarMaxFormulaExample example);

    int updateByPrimaryKeySelective(CarMaxFormula record);

    int updateByPrimaryKey(CarMaxFormula record);
    
    //add yuhb 取对应价格车的折旧率
    BigDecimal selectFormulaByPrice(BigDecimal price);
}