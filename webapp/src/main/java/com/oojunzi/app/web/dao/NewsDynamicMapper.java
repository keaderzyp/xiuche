package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsDynamicMapper {
    int countByExample(NewsDynamicExample example);

    int deleteByExample(NewsDynamicExample example);

    int deleteByPrimaryKey(String dynamicId);

    int insert(NewsDynamic record);

    int insertSelective(NewsDynamic record);

    List<NewsDynamic> selectByExampleWithBLOBs(NewsDynamicExample example);

    List<NewsDynamic> selectByExample(NewsDynamicExample example);
    List<NewsDynamic> selectByType(String id);
    List<NewsDynamic> selectByExampleAndPage(Page<NewsDynamic> page,NewsDynamicExample example);
    List<NewsDynamic> selectNewsAndType(Page<NewsDynamic> page,NewsDynamicExample example);
    NewsDynamic selectByPrimaryKey(String dynamicId);

    int updateByExampleSelective(@Param("record") NewsDynamic record, @Param("example") NewsDynamicExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsDynamic record, @Param("example") NewsDynamicExample example);

    int updateByExample(@Param("record") NewsDynamic record, @Param("example") NewsDynamicExample example);

    int updateByPrimaryKeySelective(NewsDynamic record);

    int updateByPrimaryKeyWithBLOBs(NewsDynamic record);

    int updateByPrimaryKey(NewsDynamic record);
}