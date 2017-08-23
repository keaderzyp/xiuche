package com.oojunzi.app.web.dao;


import java.util.List;

import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.web.model.AdminLog;
public interface AdminLogMapper extends GenericDao<AdminLog, Long>{
    int deleteByPrimaryKey(Integer id);
    
    int insert(AdminLog record);
 
    int insertSelective(AdminLog record);
 
    AdminLog selectByPrimaryKey(Integer id);
 
    int updateByPrimaryKeySelective(AdminLog record);
 
    int updateByPrimaryKey(AdminLog record);
 
    List<AdminLog> selectListByCondition(AdminLog record);
 
    void deleteByIds(List nList);
}
