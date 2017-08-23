package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.AdminLog;

public interface LogService extends GenericService<AdminLog, Long> {
	int insert(AdminLog log);
	
	List<AdminLog> selectListByCondition(AdminLog adminLog);
}
