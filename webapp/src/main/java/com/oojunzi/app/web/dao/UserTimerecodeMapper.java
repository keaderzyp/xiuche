package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserTimerecode;
import com.oojunzi.app.web.model.UserTimerecodeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTimerecodeMapper {
    int countByExample(UserTimerecodeExample example);

    int deleteByExample(UserTimerecodeExample example);

    int deleteByPrimaryKey(BigDecimal trecodeId);

    int insert(UserTimerecode record);
    int insertNewRecode(UserTimerecode record);

    int insertSelective(UserTimerecode record);

    List<UserTimerecode> selectByExample(UserTimerecodeExample example);

    UserTimerecode selectByPrimaryKey(BigDecimal trecodeId);

    int updateByExampleSelective(@Param("record") UserTimerecode record, @Param("example") UserTimerecodeExample example);

    int updateByExample(@Param("record") UserTimerecode record, @Param("example") UserTimerecodeExample example);

    int updateByPrimaryKeySelective(UserTimerecode record);

    int updateByPrimaryKey(UserTimerecode record);
    long selectUserTimerecode();
}