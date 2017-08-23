package com.oojunzi.app.web.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.CarInfoMapper;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.CarInfoExample;
import com.oojunzi.app.web.model.CarInfoExample.Criteria;
import com.oojunzi.app.web.service.CarInfoService;


@Service
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	private CarInfoMapper carInfoMapper;

	@Override
	public int insertCarInfo(CarInfo carInfo) {
		return carInfoMapper.insert(carInfo);
	}

	@Override
	public List<CarInfo> selectByExample(CarInfoExample example) {
		return carInfoMapper.selectByExample(example);
	}

	@Override
	public List<CarInfo> selectCarInfoByHelpId(Long helpId) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectCarInfoByHelpId(helpId);
	}

	@Override
	public List<Map<String, Object>> selectCarInfoAndTimeByUserId(Long userId) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectCarInfoAndTimeByUserId(userId);
	}

	@Override
	public CarInfo selectPlateNumber(String plateNumber) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectPlateNumber(plateNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(CarInfo record) {
		// TODO Auto-generated method stub
		return carInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public String selectTotalPartakeMaxByUserId(Long userId) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectTotalPartakeMaxByUserId(userId);
	}

	@Override
	public CarInfo selectByPrimaryKey(BigDecimal id) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int countCarByUserId(long userId) {
		// TODO Auto-generated method stub
		return carInfoMapper.countCarByUserId(userId);
	}
	@Override
	public List<CarInfo> selectPartakeList(Map<String,String> map) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectPartakeList(map);
	}
	@Override
	public List<CarInfo> selectCarJoinByCarids(List queryString) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectCarJoinByCarids(queryString);
	}

	@Override
	public List<CarInfo> selectByExampleAndPage(com.oojunzi.app.core.feature.orm.mybatis.Page<CarInfo> page,
			CarInfoExample example) {
		// TODO Auto-generated method stub
		return carInfoMapper.selectByExampleAndPage(page, example);
	}

	@Override
	public List<CarInfo> selectByIdAndPage(CarInfoExample ca, String id, Page<CarInfo> p) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		Criteria criteria = ca.createCriteria();
		if(ca.getPlatenum()!=null && ca.getPlatenum().trim().length()>0){
			criteria.andPlateNumberLike("%"+ca.getPlatenum().trim()+"%");
		}
		if(ca.getBeginTime()!=null && ca.getBeginTime().trim().length()>0){
			try {
				criteria.andRegisterDateGreaterThan(sdf.parse(ca.getBeginTime()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ca.getEndTime()!=null && ca.getEndTime().trim().length()>0){
			try {
				criteria.andRegisterDateLessThan(sdf.parse(ca.getEndTime()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		criteria.andUserIdEqualTo(BigDecimal.valueOf(Integer.parseInt(id)));
		
		return carInfoMapper.selectByExampleAndPage(p, ca);
	}

	@Override
	public void deleteCarInfo(String[] ids) {
		// TODO Auto-generated method stub
		for(int i=0;i<ids.length;i++){
			carInfoMapper.deleteByPrimaryKey(BigDecimal.valueOf(Integer.parseInt(ids[i])));
		}
	}

	
}
