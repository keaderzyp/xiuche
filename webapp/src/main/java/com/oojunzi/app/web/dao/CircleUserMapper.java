package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.CircleUser;
import com.oojunzi.app.web.model.CircleUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleUserMapper {
    int countByExample(CircleUserExample example);

    int deleteByExample(CircleUserExample example);

    int deleteByPrimaryKey(BigDecimal cuserId);

    int insert(CircleUser record);

    int insertSelective(CircleUser record);

    List<CircleUser> selectByExample(CircleUserExample example);

    CircleUser selectByPrimaryKey(BigDecimal cuserId);

    int updateByExampleSelective(@Param("record") CircleUser record, @Param("example") CircleUserExample example);

    int updateByExample(@Param("record") CircleUser record, @Param("example") CircleUserExample example);

    int updateByPrimaryKeySelective(CircleUser record);

    int updateByPrimaryKey(CircleUser record);
    long  selectId ();
}