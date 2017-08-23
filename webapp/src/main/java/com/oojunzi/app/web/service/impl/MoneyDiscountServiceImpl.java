package com.oojunzi.app.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oojunzi.app.web.dao.CarInfoMapper;
import com.oojunzi.app.web.dao.MoneyDiscountMapper;
import com.oojunzi.app.web.model.MoneyDiscount;
import com.oojunzi.app.web.model.Permission;
import com.oojunzi.app.web.service.MoneyDiscountService;
@Service
public class MoneyDiscountServiceImpl implements MoneyDiscountService {
	@Autowired
	private MoneyDiscountMapper moneyDiscountMapper;

	

	@Override
	public int insert(Permission model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Permission model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Permission selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> selectList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MoneyDiscount> selectBystate(String state) {
		// TODO Auto-generated method stub
		return moneyDiscountMapper.selectBystate(state);
	}

}
