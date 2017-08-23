package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.OrderInfo;
import com.oojunzi.app.web.model.OrderInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(BigDecimal orderId);

    int insert(OrderInfo record);
    int insert1(OrderInfo record);
    long  selectNextSEQ();
    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(BigDecimal orderId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}