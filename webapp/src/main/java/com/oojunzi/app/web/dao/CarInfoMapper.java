package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CarInfoMapper {
	int countByExample(CarInfoExample example);
	
	int deleteByExample(CarInfoExample example);

	int deleteByPrimaryKey(BigDecimal id);

	int insert(CarInfo record);

	int insertSelective(CarInfo record);

	List<CarInfo> selectByExample(CarInfoExample example);

	CarInfo selectByPrimaryKey(BigDecimal id);

	int updateByExampleSelective(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

	int updateByExample(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

	int updateByPrimaryKeySelective(CarInfo record);

	int updateByPrimaryKey(CarInfo record);

	/*
	 * zhwh add
	 */
	long selectCircleId();

	/*
	 * lgq add
	 **/
	List<CarInfo> selectCarInfoByHelpId(Long helpId);

	String selectTotalPartakeMaxByUserId(Long userId);

	List<Map<String, Object>> selectCarInfoAndTimeByUserId(Long userId);

	int countCarByUserId(long userId);
	// add zhwh
	CarInfo selectPlateNumber(String plateNumber);
	//add yuhb
	List<CarInfo> selectPartakeList(Map<String,String> map);
	// add michael
	List<CarInfo> selectCarJoinByCarids(List queryString);
	// add zhwh
    List<CarInfo> selectByExampleAndPage(Page<CarInfo> page,CarInfoExample example);

}