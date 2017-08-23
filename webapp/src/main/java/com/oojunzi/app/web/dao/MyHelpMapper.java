package com.oojunzi.app.web.dao;

import java.util.List;
import java.util.Map;

import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;

public interface MyHelpMapper {

	/**
	 * By L
	 **/

	List<HelpInfo> selectByExample(HelpInfoExample example);

	List<HelpInfo> selectByExample1(Long userId);

	int countByExample(Long userId);

	List<String> selectPlateNumber(long carId);

	List<HelpInfo> selectInfoByWeekOfDay(Map<String, Object> map);

	List<Map<String, Object>> selectByWeek(long carId);

	List<Map<String, Object>> selectByWeekID(Map<String, Object> map);

	String selectSumPayByCarId(Long carId);

	String selectSumPayByUserId(Long userID);

}