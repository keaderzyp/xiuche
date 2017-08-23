package com.oojunzi.app.web.service;

import java.util.List;
import com.oojunzi.app.web.model.HelpInfo;
import com.oojunzi.app.web.model.HelpInfoExample;

public interface MyHelpService {

	List<String> getImgPath(HelpInfo example);

	List<HelpInfo> selectByExample(long userId);

	String selectSumPayByCarId(Long carId);

	String selectSumPayByUserId(Long userID);

}
