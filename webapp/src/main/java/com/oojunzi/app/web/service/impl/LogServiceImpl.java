package com.oojunzi.app.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.core.generic.GenericServiceImpl;
import com.oojunzi.app.web.dao.AdminLogMapper;
import com.oojunzi.app.web.model.AdminLog;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.LogService;

/**
 * 系统日志实现类
 *
 * @author 
 * @since 2016年6月10日 下午12:05:03
 */
@Service
public class LogServiceImpl extends GenericServiceImpl<AdminLog, Long> implements LogService {

	@Resource
	private AdminLogMapper adminLogMapper;
	
	
	

	@Override
	public int insert(AdminLog model) {
		return adminLogMapper.insert(model);
	}

	@Override
	public GenericDao<AdminLog, Long> getDao() {
		return adminLogMapper;
	}

	@Override
	public List<AdminLog> selectListByCondition(AdminLog adminLog) {
		List<AdminLog> adminLogs = adminLogMapper.selectListByCondition(adminLog);
		return adminLogs;
	}


}
