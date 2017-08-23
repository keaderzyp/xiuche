package com.oojunzi.app.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.dao.HelpBillMapper;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpBillExample;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.service.HelpBillService;
@Service
public class HelpBillServiceImpl implements HelpBillService {

	
	@Resource
	private HelpBillMapper helpBillMapper;
	
	@Override
	public int insertHelpBillInfo(HelpBill helpBill) {
		return helpBillMapper.insert(helpBill);
	}
	
	public Long selectHelpBillId() {
		return helpBillMapper.selectHelpBillId();
	}

	@Override
	public Long selectHelpBillIdForPK() {
		// TODO Auto-generated method stub
		return helpBillMapper.selectHelpBillIdForPK();
	}

	@Override
	public List<HelpBill> selectBillInfoList(HelpBillExample example){
		
		
		return helpBillMapper.selectByExample(example);
	}

	@Override
	public int selectCarJoinList(String enddate) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectCarJoinList(enddate);
	}

	@Override
	public List<HelpBill> selectBillList(Page<User> page, HelpBillExample example) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectBillList(page,example);
	}

	@Override
	public HelpBill selectBillByTitleId(String titleId) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectBillByTitleId(titleId);
	}

	@Override
	public List selectCarIdsList(String enddate) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectCarIdsList(enddate);
	}

	@Override
	public List selectCarListByTitleId(String titleId) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectCarListByTitleId(titleId);
	}

	@Override
	public double selectPartakeTotalByCarIds(List carids) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectPartakeTotalByCarIds(carids);
	}

	@Override
	public List selectCarIdsFromHelpByTitleId(String titleId) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectCarIdsFromHelpByTitleId(titleId);
	}

	@Override
	public List<HelpBill> selectBillListByTitleId(String titleId) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectBillListByTitleId(titleId);
	}

	@Override
	public int updateHelpStatus(HelpBill helpBill) {
		// TODO Auto-generated method stub
		return helpBillMapper.updateByPrimaryKey(helpBill);
	}

	@Override
	public int deleteByBillId(Long billId) {
		// TODO Auto-generated method stub
		return helpBillMapper.deleteByPrimaryKey(billId);
	}

	@Override
	public List<HelpBill> selectBillListByBillName(HelpBillExample example) {
		// TODO Auto-generated method stub
		return helpBillMapper.selectBillListByBillName(example);
	}


}
