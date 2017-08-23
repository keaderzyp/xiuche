package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserStaff;
import com.oojunzi.app.web.model.UserStaffExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStaffMapper {
    int countByExample(UserStaffExample example);

    int deleteByExample(UserStaffExample example);

    int deleteByPrimaryKey(BigDecimal staffId);

    int insert(UserStaff record);

    int insertSelective(UserStaff record);

    List<UserStaff> selectByExample(UserStaffExample example);

    UserStaff selectByPrimaryKey(BigDecimal staffId);

    int updateByExampleSelective(@Param("record") UserStaff record, @Param("example") UserStaffExample example);

    int updateByExample(@Param("record") UserStaff record, @Param("example") UserStaffExample example);

    int updateByPrimaryKeySelective(UserStaff record);

    int updateByPrimaryKey(UserStaff record);
}