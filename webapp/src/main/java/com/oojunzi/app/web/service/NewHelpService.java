package com.oojunzi.app.web.service;

import java.util.List;
import java.util.Map;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpPartake;

public interface NewHelpService {
	List<HelpBill> selectBillByUserId(Page<HelpBill> page, Long userID);

	List<HelpPartake> selectPartakeByUserId(Long userID);

	List<HelpBill> selectTopOneBillByUserId(Long userID);

	List<HelpInfo> selectHelpInfoByUserId(Long userID);

	HelpBill selectBillByTitleId(String titleId);

	HelpPartake selectPartakeBytitleId(Map<String, String> map);

	HelpInfo selectHelpInfoByHelpId(String helpId);

}
