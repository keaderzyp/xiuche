package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.MoneyDiscount;
import com.oojunzi.app.web.model.MoneyDiscountExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyDiscountMapper {
    int countByExample(MoneyDiscountExample example);

    int deleteByExample(MoneyDiscountExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(MoneyDiscount record);

    int insertSelective(MoneyDiscount record);

    List<MoneyDiscount> selectByExample(MoneyDiscountExample example);

    MoneyDiscount selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") MoneyDiscount record, @Param("example") MoneyDiscountExample example);

    int updateByExample(@Param("record") MoneyDiscount record, @Param("example") MoneyDiscountExample example);

    int updateByPrimaryKeySelective(MoneyDiscount record);

    int updateByPrimaryKey(MoneyDiscount record);
    //add zhwh
    List<MoneyDiscount> selectBystate(String state);
    
}