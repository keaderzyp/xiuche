package com.oojunzi.app.web.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;

public interface CarInfoService {

	int insertCarInfo(CarInfo carInfo);

	List<CarInfo> selectByExample(CarInfoExample example);

	/*
	 * lgq add
	 **/
	int updateByPrimaryKeySelective(CarInfo record);

	List<CarInfo> selectCarInfoByHelpId(Long helpId);

	List<Map<String, Object>> selectCarInfoAndTimeByUserId(Long userId);

	CarInfo selectPlateNumber(String plateNumber);

	String selectTotalPartakeMaxByUserId(Long userId);
	
	int countCarByUserId(long userId);
	
	CarInfo selectByPrimaryKey(BigDecimal id);
	//add yuhb 我的账单详细信息
	List<CarInfo> selectPartakeList(Map<String,String> map);
	
	List<CarInfo> selectCarJoinByCarids(List queryString);
	 List<CarInfo> selectByExampleAndPage(Page<CarInfo> page,CarInfoExample example);
	
	List<CarInfo> selectByIdAndPage(CarInfoExample ca, String id, Page<CarInfo> p);

	void deleteCarInfo(String[] ids);
}
