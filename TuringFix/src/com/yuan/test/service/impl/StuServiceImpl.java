package com.yuan.test.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yuan.test.entity.Student;
import com.yuan.test.mapper.IStuMapper;
import com.yuan.test.page.StuPage;
import com.yuan.test.service.IStuService;



@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)//设置默认的事务管理策略，即没有标注
public class StuServiceImpl  implements IStuService{
	
	@Resource
	private IStuMapper dao;
	

	@Override
	public List queryCt() {
		// TODO Auto-generated method stub
		return dao.queryCt();
	}


	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub
		dao.save(stu);
	}

	public void update(Student stu) {
		// TODO Auto-generated method stub
		dao.update(stu);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void delete(String id) {
		// TODO Auto-generated method stub
		Student stu = (Student)  dao.queryById( id);
		dao.delete(stu);
	}

	@Override
	public void delRows(String ids) {
		// TODO Auto-generated method stub
		for (String id : ids.split("@")) {
			if(id!=null  &&  id.trim().length()>0){
				Student stu = (Student)  dao.queryById( id);
				dao.delete(stu);
			}	
		}
	}

	@Override
	public Object queryById( String id) {
		// TODO Auto-generated method stub
		return  (Student)  dao.queryById( id);
	}

	@Override
	public List queryAll(StuPage page) {
		// TODO Auto-generated method stub
		return dao.queryAll(page);
	}


	public List<Student> queryPage(StuPage page) {
		// TODO Auto-generated method stub
		List<Student>  list=dao.query(page);
		List<Student>  allList=dao.queryAll(page);
		page.setPageState(page, allList);
		
		return list;
	}











	

	

}
