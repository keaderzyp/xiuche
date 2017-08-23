package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.MoneyDiscount;
import com.oojunzi.app.web.model.Permission;

public interface MoneyDiscountService extends  GenericService<Permission, Long>  {
	 List<MoneyDiscount> selectBystate(String state);
}
