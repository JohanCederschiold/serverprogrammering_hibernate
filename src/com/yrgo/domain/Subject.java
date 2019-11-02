package com.yrgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String subjectName;
	private int numberOfSemesters;
	
	
	public Subject() {
		super();
	}
	
	


	public Subject(String subjectName, int numberOfSemesters) {
		super();
		this.subjectName = subjectName;
		this.numberOfSemesters = numberOfSemesters;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}


	public void setNumberOfSemesters(int numberOfSemesters) {
		this.numberOfSemesters = numberOfSemesters;
	}
	
	
	
	
	
	

}
