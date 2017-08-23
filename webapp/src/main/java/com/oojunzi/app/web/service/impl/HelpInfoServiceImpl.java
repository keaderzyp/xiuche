package com.oojunzi.app.web.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.HelpInfoMapper;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;
import com.oojunzi.app.web.model.HelpInfoExample.Criteria;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.HelpInfoService;

@Service
public class HelpInfoServiceImpl implements HelpInfoService {
	
	@Autowired
	private HelpInfoMapper helpInfoMapper;

	@Override
	public List<HelpInfo> selectByExample(HelpInfoExample example) {
		return helpInfoMapper.selectByExample(example);
	}

	@Override
	public int countByExample(HelpInfoExample example) {
		// TODO Auto-generated method stub
		return helpInfoMapper.countByExample(example);
	}

	@Override
	public int insertSelective(HelpInfo record) {
		// TODO Auto-generated method stub
		return helpInfoMapper.insertSelective(record);
	}

	@Override
	public long selectHelpInfoId() {
		// TODO Auto-generated method stub
		return helpInfoMapper.selectHelpInfoId();
	}

	@Override
	public int updateHelpInfo(HelpInfo record) {
		return helpInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateHelpInfobyId(HelpInfo record) {
		// TODO Auto-generated method stub
		return helpInfoMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<HelpInfo> selectByExampleAndPage(Page<HelpInfo> page, HelpInfoExample example) {
		return helpInfoMapper.selectByExampleAndPage(page, example);
	}
	@Override
	public List<HelpInfo> selectByExampleAndPage(Page<HelpInfo> page,String id, HelpInfoExample example) {
		Criteria criteria = example.createCriteria();
		criteria.andParam1EqualTo(id);
		if ( !(StringUtils.isEmpty(example.getType()) )) {
			criteria.andStatusEqualTo(example.getType());
		}
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    	try {
    		if(!(StringUtils.isEmpty(example.getBeginTime()))   ){
    			criteria.andHappenTimeGreaterThan(sdf.parse(example.getBeginTime().trim()));
			}
    		if(!(StringUtils.isEmpty(example.getEndTime() ))  ){
    			criteria.andHappenTimeLessThan(sdf.parse(example.getEndTime().trim()));
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return helpInfoMapper.selectByExampleAndPage(page, example);
	}

	@Override
	public HelpInfo selectByPrimaryKey(BigDecimal helpId) {
		// TODO Auto-generated method stub
		return helpInfoMapper.selectByPrimaryKey(helpId);
	}
}
