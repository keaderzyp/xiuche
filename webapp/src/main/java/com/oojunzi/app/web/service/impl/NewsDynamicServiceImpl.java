package com.oojunzi.app.web.service.impl;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.NewsDynamicMapper;
import com.oojunzi.app.web.dao.NewsDynamicTypeMapper;
import com.oojunzi.app.web.model.NewsDynamic;
import com.oojunzi.app.web.model.NewsDynamicExample;
import com.oojunzi.app.web.model.NewsDynamicType;
import com.oojunzi.app.web.model.NewsDynamicTypeExample;
import com.oojunzi.app.web.model.NewsDynamicTypeExample.Criteria;
import com.oojunzi.app.web.service.NewsDynamicService;
@Service
public class NewsDynamicServiceImpl implements NewsDynamicService {
	@Autowired
	NewsDynamicTypeMapper mapper;
	@Autowired
	NewsDynamicMapper mappern;
	@Override
	public List<NewsDynamicType> queryMomentsByExample(NewsDynamicTypeExample n) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(n);
	}

	@Override
	public List<NewsDynamic> queryMomentsByType(Page<NewsDynamic> page,NewsDynamicExample n) {
		// TODO Auto-generated method stub
		return mappern.selectByExampleAndPage(page, n);
	}

	@Override
	public NewsDynamic queryMomentsById(String id) {
		// TODO Auto-generated method stub
		return mappern.selectByPrimaryKey(id);
	}

	@Override
	public String queryTypeName(String type) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(type).getTypeName();
	}

	@Override
	public List<NewsDynamicType> queryMomentsByPageAndExample(Page<NewsDynamicType> page, NewsDynamicTypeExample n) {
		String typeName = n.getTypeName();
		Criteria criteria = n.createCriteria();
		if(typeName!=null&&typeName.trim().length()>0){
			criteria.andTypeNameLike("%"+typeName.trim()+"%");
		}
		// TODO Auto-generated method stub
		return mapper.selectByExampleAndPage(page, n);
	}

	@Override
	public void deleteMoments(String[] ids,String path) {
		// TODO Auto-generated method stub
		for(int i=0;i<ids.length;i++){
			String [] strs = ids[i].split("@");
			mapper.deleteByPrimaryKey(strs[0]);
			File f = new File(path+"/"+strs[1]+".png");
			if(f.exists()){
				f.delete();
			}
		}
	}

	@Override
	public NewsDynamicType queryInformationTypeById(String id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveNews(NewsDynamicType newsType) {
		// TODO Auto-generated method stub
		mapper.insert(newsType);
	}

	@Override
	public void updateNews(NewsDynamicType newsType) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(newsType);
	}

	@Override
	public List<NewsDynamic> queryMomentsContentByExample(Page page,NewsDynamicExample n) {
		// TODO Auto-generated method stub
		com.oojunzi.app.web.model.NewsDynamicExample.Criteria criteria = n.createCriteria();
		String type = n.getType();
    	String title =n.getTitle();
    	String beginTime = n.getBeginTime();
    	String endTime = n.getEndTime();
    	String user_id = n.getUser_id();
		//设置条件
    	if(user_id!=null&&!"%".equals(user_id)){
    		criteria.andUserFidEqualTo(user_id);
    	}
    	if(type!=null&&!"%".equals(type)){
    		criteria.andTypeEqualTo(type);
    	}
    	if(title!=null&&title.trim().length()>0){
        	criteria.andTitleLike("%"+title+"%");
    	}
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    	
    	if(beginTime!=null&&beginTime.trim().length()>0){
    		try {
				criteria.andIssueTimeGreaterThanOrEqualTo(sdf.parse(beginTime.trim()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	if(endTime!=null&&endTime.trim().length()>0){
    		try {
				criteria.andIssueTimeLessThanOrEqualTo(sdf.parse(endTime.trim()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		return mappern.selectNewsAndType(page,n);
	}

	@Override
	public void saveNewsContent(NewsDynamic news) {
		// TODO Auto-generated method stub
		mappern.insert(news);
	}

	@Override
	public void updateNewsContent(NewsDynamic news) {
		// TODO Auto-generated method stub
		
		
		mappern.updateByPrimaryKeyWithBLOBs(news);
	}

	@Override
	public void deleteMomentsContent(String[] ids, String path) {
		// TODO Auto-generated method stub
		for(int j=0;j<ids.length;j++){
			NewsDynamic n = mappern.selectByPrimaryKey(ids[j]);
			
			String icon = n.getBynamicIco();
			File f = new File(path+"/"+icon);
			if(f.exists()){
				f.delete();
			}
			
			String imgs = n.getImgs();
			System.out.println(imgs);
			if(imgs!=null){
    			if(imgs.indexOf(",")!=-1){
    				String[] imgObjs = imgs.split(",");
            		for(int i=0;i<imgObjs.length;i++){
            			File f1 = new File(path+"/"+imgObjs[i].trim());
            			if(f1.exists()){
            				f1.delete();
            			}
            		}
    			}else{
    				File f2 = new File(path+"/"+imgs);
        			if(f.exists()){
        				f2.delete();
        			}
    			}
    		}
			//System.out.println(n.getTitle());
			mappern.deleteByPrimaryKey(ids[j]);
			
		}
	}

}
