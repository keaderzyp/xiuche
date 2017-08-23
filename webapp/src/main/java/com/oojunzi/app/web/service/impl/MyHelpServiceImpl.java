package com.oojunzi.app.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.MyHelpMapper;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;
import com.oojunzi.app.web.service.MyHelpService;

@Service
public class MyHelpServiceImpl implements MyHelpService {

	@Autowired
	private MyHelpMapper myHelpMapper;

	@Override
	public List<String> getImgPath(HelpInfo example) {
		// TODO Auto-generated method stub
		// return myHelpMapper.getImgPath(example);
		return null;
	}

	@Override
	public List<HelpInfo> selectByExample(long userId) {
		return myHelpMapper.selectByExample1(userId);
	}

	@Override
	public String selectSumPayByCarId(Long carId) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectSumPayByCarId(carId);
	}

	@Override
	public String selectSumPayByUserId(Long userID) {
		// TODO Auto-generated method stub
		return myHelpMapper.selectSumPayByUserId(userID);
	}

}
