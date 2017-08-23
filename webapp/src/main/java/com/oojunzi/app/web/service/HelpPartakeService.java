package com.oojunzi.app.web.service;

import java.util.List;
import java.util.Map;

import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;

public interface HelpPartakeService {
	List<Map<String, Object>> selectByWeek(long userId);

	List<Map<String, Object>> selectByWeekID(Map<String, Object> map);

	int countByExample(Long userId);

	List<HelpInfo> selectInfoByWeekOfDay(Map<String, Object> map);

	List<String> selectPlateNumber(long userId);
	/**
     * add lgq
     * */
    
     List<HelpPartake> selectByhelpIdAndcarId(Map<String, Object> map);
     
     int insertHelpPartake(HelpPartake helpPartake);
     
     int updateByUserId(long userId);
}
