package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserDepart;
import com.oojunzi.app.web.model.UserDepartExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDepartMapper {
    int countByExample(UserDepartExample example);

    int deleteByExample(UserDepartExample example);

    int deleteByPrimaryKey(BigDecimal departId);

    int insert(UserDepart record);

    int insertSelective(UserDepart record);

    List<UserDepart> selectByExample(UserDepartExample example);

    UserDepart selectByPrimaryKey(BigDecimal departId);

    int updateByExampleSelective(@Param("record") UserDepart record, @Param("example") UserDepartExample example);

    int updateByExample(@Param("record") UserDepart record, @Param("example") UserDepartExample example);

    int updateByPrimaryKeySelective(UserDepart record);

    int updateByPrimaryKey(UserDepart record);
}