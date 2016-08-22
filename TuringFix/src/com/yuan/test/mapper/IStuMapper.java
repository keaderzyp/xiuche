package com.yuan.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.yuan.framework.mapper.SqlMapper;
import com.yuan.test.entity.ClassTeam;
import com.yuan.test.entity.Student;
import com.yuan.test.page.StuPage;

public interface IStuMapper extends SqlMapper{

	@SelectProvider(method="pageSql",type=StuPage.class)
	@ResultMap("studentResultMap")
	List<Student> query(StuPage stuPage);
	
	@SelectProvider(method="allSql",type=StuPage.class)
	@ResultMap("studentResultMap")
	List<Student> queryAll(StuPage stuPage);
	
	@Select("select * from  CLASS_TEAM")
	@ResultMap("classTeamResultMap")
	List<ClassTeam> queryCt();
	

	@Insert("insert into student (STU_ID ,STU_NAME,STU_IN_AGE,HAO_PENG_YOU,CT_ID )   values(#{stuId},#{stuName},#{stuInAge},#{haoPengYou},#{ctId})")
	void save(Student stu);

	@Update("update student set STU_NAME=#{stuName}, STU_IN_AGE=#{stuInAge},HAO_PENG_YOU=#{haoPengYou},CT_ID=#{ctId} where STU_ID=#{stuId}  ")
	void update(Student stu);

	@Delete("delete from student where STU_ID=#{stuId}")
	void delete(Student stu);
	
	@Select("select * from  student   where STU_ID=#{id}")
	@ResultMap("studentResultMap")
	Student queryById( String id);
	


}
