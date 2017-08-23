package com.oojunzi.app.web.service;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserTimerecode;

public interface UserTimerecodeService  extends GenericService<User, Long> {

	/*向UserTimerecode表中插入数据
	 * 
	 * 
	 * 
	 * */
	  int insertUser(UserTimerecode usertimerecode);
	  //zhwh add
	  long selectUserTimerecode();	
}
