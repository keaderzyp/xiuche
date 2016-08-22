package com.yuan.test.service;


import java.util.List;

import com.yuan.test.entity.ClassTeam;
import com.yuan.test.entity.Student;
import com.yuan.test.page.StuPage;

public interface IStuService 
{

	//CRUD


	public void save(Student stu);
	public void update(Student stu);
	public void delete(String id);
	public void delRows(String ids);
	
	public Object queryById(String id);
	
	public List<ClassTeam> queryCt();

	public List<Student> queryAll(StuPage page);	
	public List<Student> queryPage(StuPage page);

	
	
	
}
