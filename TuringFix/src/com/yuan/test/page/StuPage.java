package com.yuan.test.page;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.yuan.framework.model.BasicPage;

@Component
@Scope(value="session")
public class StuPage extends BasicPage{

	
	private Integer ageFrom;
	private Integer ageTo;
	private String name;
	private String ctId;
	
	
	
	public String  reWhereString(StuPage stuPage){
		StringBuffer whereSql=new StringBuffer();
		
		if (stuPage.getName()!=null  &&  stuPage.getName().trim().length()>0) {
			whereSql.append("	and    s.STU_NAME  like  '%"+stuPage.getName()+"%'");
		}
		if (stuPage.getAgeFrom()!=null  ) {
			whereSql.append("	and   s.STU_IN_AGE  >=  "+stuPage.getAgeFrom());
		}
		if (stuPage.getAgeTo()!=null  ) {
			whereSql.append("  and s.STU_IN_AGE  <=  "+stuPage.getAgeTo());
		}
		if (stuPage.getCtId()!=null  &&  stuPage.getCtId().trim().length()>0) {
			whereSql.append("  and  s.CT_ID  like  '"+stuPage.getCtId()+"'");
		}

		return whereSql.toString();
	}
	
	
	
	
	public String   pageSql(StuPage stuPage){
		
		
		int firstResult=(stuPage.getPageNo()-1)*stuPage.getPageSize();//��������ʼ
		int maxResults=stuPage.getPageSize();			//ÿҳ�����ʾ����
		String sql="	select s.STU_ID ,s.STU_NAME,s.STU_IN_AGE,s.HAO_PENG_YOU ,s.CT_ID "+ 
				"	,c.CT_NAME  "+ 
				"	from student s "+ 
				"   left join class_team c   ON s.CT_ID=c.CT_ID "+ 
				"   where 1=1"  +
				this.reWhereString(stuPage)+
				"	limit "+firstResult+","+maxResults; 
		System.out.println("pageSql:"+sql);
		return sql;
		
	}

	
	public String   allSql(StuPage stuPage){
		
		String sql="	select s.STU_ID ,s.STU_NAME,s.STU_IN_AGE,s.HAO_PENG_YOU ,s.CT_ID "+ 
				"	,c.CT_NAME  "+ 
				"	from student s "+ 
				"   left join class_team c   ON s.CT_ID=c.CT_ID "+ 
				"   where 1=1"  +
				this.reWhereString(stuPage);
				
				
		System.out.println("allSql:"+sql);
		return sql;
		
	}
	
	

	public Integer getAgeFrom() {
		return ageFrom;
	}




	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}




	public Integer getAgeTo() {
		return ageTo;
	}




	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCtId() {
		return ctId;
	}




	public void setCtId(String ctId) {
		this.ctId = ctId;
	}




	@Override
	public String toString() {
		return "StuPage [pageNo=" + super.getPageNo() + ", pageSize=" + super.getPageSize()+ ", pageTotalSize=" +super.getPageTotalSize()
				+ ", pageGroup=" + super.getPageGroup() + ", pageGroupSize=" + super.getPageGroupSize() + ", pageTotalGroup=" + super.getPageTotalGroup()
				+ ", pageCount=" + super.getPageCount() + ", rows=" + super.getRows() +  ", ageFrom=" + ageFrom + ", ageTo=" + ageTo + ", name=" + name + ", ctId=" + ctId + "]";
	}
	
	
}
