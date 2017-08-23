package com.oojunzi.app.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.HelpPartakeMapper;
import com.oojunzi.app.web.dao.MyHelpMapper;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.service.HelpPartakeService;

@Service
public class HelpPartakeServiceImpl implements HelpPartakeService {
	
	@Autowired
	private MyHelpMapper myHelpMapper;
	@Autowired
	private HelpPartakeMapper helpPartakeMapper;

	@Override
	public List<Map<String, Object>> selectByWeek(long userId) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectByWeek(userId);
	}

	@Override
	public List<Map<String, Object>> selectByWeekID(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectByWeekID(map);
	}

	@Override
	public int countByExample(Long userId) {
		// TODO Auto-generated method stub
		return myHelpMapper.countByExample(userId);
	}

	@Override
	public List<HelpInfo> selectInfoByWeekOfDay(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectInfoByWeekOfDay(map);
	}

	@Override
	public List<String> selectPlateNumber(long userId) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectPlateNumber(userId);
	}

	@Override
	public List<HelpPartake> selectByhelpIdAndcarId(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return helpPartakeMapper.selectByhelpIdAndcarId(map);
	}

	@Override
	public int insertHelpPartake(HelpPartake helpPartake) {
		// TODO Auto-generated method stub
		return helpPartakeMapper.insertSelective(helpPartake);
	}

	@Override
	public int updateByUserId(long userId) {
		// TODO Auto-generated method stub
		return helpPartakeMapper.updateByUserId(userId);
	}

	

	

	


	
}
