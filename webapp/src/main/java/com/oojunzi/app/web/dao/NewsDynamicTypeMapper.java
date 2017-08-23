package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;
import java.util.List;

public interface NewsDynamicTypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(NewsDynamicType record);

    int insertSelective(NewsDynamicType record);

    List<NewsDynamicType> selectByExample(NewsDynamicTypeExample example);
    List<NewsDynamicType> selectByExampleAndPage(Page<NewsDynamicType> page,NewsDynamicTypeExample example);
    NewsDynamicType selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(NewsDynamicType record);

    int updateByPrimaryKey(NewsDynamicType record);
}