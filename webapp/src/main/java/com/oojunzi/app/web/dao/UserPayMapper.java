package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.model.UserPay;
import com.oojunzi.app.web.model.UserPayExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserPayMapper {
    int countByExample(UserPayExample example);

    int deleteByExample(UserPayExample example);

    int deleteByPrimaryKey(BigDecimal payId);

    int insert(UserPay record);

    int insertSelective(UserPay record);

    List<UserPay> selectByExample(UserPayExample example);

    UserPay selectByPrimaryKey(BigDecimal payId);

    int updateByExampleSelective(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByExample(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByPrimaryKeySelective(UserPay record);

    int updateByPrimaryKey(UserPay record);
    
    //add LGQ
    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<UserPay> selectByExampleAndPage(Page<UserPay> page, UserPayExample example);
    
	List<UserPay> selectPayByWeek(Page<UserPay> page,BigDecimal carId);
	long selectPayId();
	int selectByUserId(BigDecimal id);
}