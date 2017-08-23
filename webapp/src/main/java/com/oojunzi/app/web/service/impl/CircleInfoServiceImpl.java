package com.oojunzi.app.web.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.CircleInfoMapper;
import com.oojunzi.app.web.model.CircleInfo;
import com.oojunzi.app.web.model.CircleInfoExample;
import com.oojunzi.app.web.service.CircleInfoService;

@Service
public class CircleInfoServiceImpl implements CircleInfoService {
	
	@Autowired
	private CircleInfoMapper circleInfoMapper;

	@Override
	public List<CircleInfo> selectByExample(CircleInfoExample example) {
		return circleInfoMapper.selectByExample(example);
	}

	@Override
	public CircleInfo selectByPrimaryKey(BigDecimal circleId) {
		return circleInfoMapper.selectByPrimaryKey(circleId);
	}
	
	//add yuhb
	@Override
	public CircleInfo selectByUserId(BigDecimal userId) {
		return circleInfoMapper.selectByUserId(userId);
	}
//  add zhwh

	@Override
	public long selectCircleId() {
		// TODO Auto-generated method stub
		long a=circleInfoMapper.selectCircleId();
		return a;
	}
	
	@Override
	public int insertCircle(CircleInfo record) {
		// TODO Auto-generated method stub
		return circleInfoMapper.insert(record);
	}
	
	//根据用户id获取对应小圈车辆统计信息
	@Override
	public CircleInfo selectCarInfoByUserId(BigDecimal userId) {
		return circleInfoMapper.selectCarInfoByUserId(userId);
	}

	//根据用户id获取小圈最新求助时间
	@Override
	public Date  sltCircleNearHelpTime(BigDecimal userId) {
		return circleInfoMapper.sltCircleNearHelpTime(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(CircleInfo record) {
		// TODO Auto-generated method stub
		return circleInfoMapper.updateByPrimaryKeySelective(record);
	}

}
