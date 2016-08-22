package com.yuan.test.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassTeam entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ClassTeam implements java.io.Serializable {

	// Fields

	private String ctId;
	private String ctName;
	private Date ctBeginDate;
	private Set<Student> students = new HashSet<Student>(0);

	// Constructors

	/** default constructor */
	public ClassTeam() {
	}

	/** minimal constructor */
	public ClassTeam(String ctId) {
		this.ctId = ctId;
	}

	/** full constructor */
	public ClassTeam(String ctId, String ctName, Date ctBeginDate,
			Set<Student> students) {
		this.ctId = ctId;
		this.ctName = ctName;
		this.ctBeginDate = ctBeginDate;
		this.students = students;
	}

	public String getCtId() {
		return ctId;
	}

	public void setCtId(String ctId) {
		this.ctId = ctId;
	}

	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public Date getCtBeginDate() {
		return ctBeginDate;
	}

	public void setCtBeginDate(Date ctBeginDate) {
		this.ctBeginDate = ctBeginDate;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}




}