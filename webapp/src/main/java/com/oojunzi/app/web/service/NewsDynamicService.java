package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;

public interface NewsDynamicService {


	List<NewsDynamicType> queryMomentsByExample(NewsDynamicTypeExample n);

	List<NewsDynamic> queryMomentsByType(Page<NewsDynamic> page,NewsDynamicExample n);

	NewsDynamic queryMomentsById(String id);

	String queryTypeName(String type);

	List<NewsDynamicType> queryMomentsByPageAndExample(Page<NewsDynamicType> page, NewsDynamicTypeExample n);

	void deleteMoments(String[] ids, String path);

	NewsDynamicType queryInformationTypeById(String id);

	void saveNews(NewsDynamicType newsType);

	void updateNews(NewsDynamicType newsType);

	List<NewsDynamic> queryMomentsContentByExample(Page<NewsDynamic> page, NewsDynamicExample n);

	void saveNewsContent(NewsDynamic news);

	void updateNewsContent(NewsDynamic news);

	void deleteMomentsContent(String[] ids, String path);

}
