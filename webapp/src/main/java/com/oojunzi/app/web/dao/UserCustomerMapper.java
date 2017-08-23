package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserCustomer;
import com.oojunzi.app.web.model.UserCustomerExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustomerMapper {
    int countByExample(UserCustomerExample example);

    int deleteByExample(UserCustomerExample example);

    int deleteByPrimaryKey(BigDecimal gcustomerId);

    int insert(UserCustomer record);

    int insertSelective(UserCustomer record);

    List<UserCustomer> selectByExample(UserCustomerExample example);

    UserCustomer selectByPrimaryKey(BigDecimal gcustomerId);

    int updateByExampleSelective(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    int updateByExample(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    int updateByPrimaryKeySelective(UserCustomer record);

    int updateByPrimaryKey(UserCustomer record);
}