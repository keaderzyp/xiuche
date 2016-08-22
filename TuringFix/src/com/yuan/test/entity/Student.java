package com.yuan.test.entity;




/**
 * Student entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Student implements java.io.Serializable {

	// Fields

	private String stuId;
	private ClassTeam classTeam;
	private String stuName;
	private Integer stuInAge;
	private String haoPengYou;
	private String pyNames;
	private String ctId;
	private String ctName;


	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuId) {
		this.stuId = stuId;
	}

	/** full constructor */
	public Student(String stuId, ClassTeam classTeam, String stuName,
			Integer stuInAge, String haoPengYou ) {
		this.stuId = stuId;
		this.classTeam = classTeam;
		this.stuName = stuName;
		this.stuInAge = stuInAge;
		this.haoPengYou = haoPengYou;
	
	}



	// Property accessors
	
	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public String getCtId() {
		return ctId;
	}

	public void setCtId(String ctId) {
		this.ctId = ctId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public ClassTeam getClassTeam() {
		return classTeam;
	}

	public void setClassTeam(ClassTeam classTeam) {
		this.classTeam = classTeam;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuInAge() {
		return stuInAge;
	}

	public void setStuInAge(Integer stuInAge) {
		this.stuInAge = stuInAge;
	}

	public String getHaoPengYou() {
		return haoPengYou;
	}

	public void setHaoPengYou(String haoPengYou) {
		this.haoPengYou = haoPengYou;
	}

	public String getPyNames() {
		return pyNames;
	}

	public void setPyNames(String pyNames) {
		this.pyNames = pyNames;
	}
}