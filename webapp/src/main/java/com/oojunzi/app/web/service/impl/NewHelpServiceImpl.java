package com.oojunzi.app.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.NewHelpMapper;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.service.NewHelpService;

@Service
public class NewHelpServiceImpl implements NewHelpService {

	@Autowired
	private NewHelpMapper newHelpMapper;



	
	
	@Override
	public List<HelpPartake> selectPartakeByUserId(Long userID) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectPartakeByUserId(userID);
	}
	
	@Override
	public List<HelpInfo> selectHelpInfoByUserId(Long userID) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectHelpInfoByUserId(userID);
	}
	
	@Override
	public HelpBill selectBillByTitleId(String titleId) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectBillByTitleId(titleId);
	}
	
	@Override
	public HelpPartake selectPartakeBytitleId(Map<String,String> map) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectPartakeBytitleId(map);
	}

	@Override
	public HelpInfo selectHelpInfoByHelpId(String helpId) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectHelpInfoByHelpId(helpId);
	}

	@Override
	public List<HelpBill> selectBillByUserId(Page<HelpBill> page, Long userID) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectBillByUserId(page, userID);
	}

	@Override
	public List<HelpBill> selectTopOneBillByUserId(Long userID) {
		// TODO Auto-generated method stub
		return newHelpMapper.selectTopOneBillByUserId(userID);
	}
	

}
