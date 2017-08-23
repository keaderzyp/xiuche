package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.CarInfo;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpBillExample;
import com.oojunzi.app.web.model.User;

public interface HelpBillService {

	
	int insertHelpBillInfo(HelpBill helpBill);
	Long selectHelpBillId();
	Long selectHelpBillIdForPK();
	List<HelpBill> selectBillInfoList(HelpBillExample example);
	int selectCarJoinList(String enddate);
	
	List<HelpBill>  selectBillList(Page<User> page, HelpBillExample example);
	HelpBill selectBillByTitleId(String titleId);
	List<HelpBill>  selectBillListByTitleId(String titleId);
	List selectCarIdsList(String enddate);
	List selectCarListByTitleId(String titleId);
	double selectPartakeTotalByCarIds(List carids);
	List selectCarIdsFromHelpByTitleId(String titleId);
	
	int updateHelpStatus(HelpBill helpBill);
	int deleteByBillId(Long billId);
	
	List<HelpBill> selectBillListByBillName(HelpBillExample example);
	
}
