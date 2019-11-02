package com.yrgo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tbl_Student")
public class Student
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String enrollmentID;
    private String name;
    
    
//   @ManyToOne
//    private Tutor tutor;
    
    @Column(name="All_courses")
    private Integer numberOfCourses;


    public Student(String name, Tutor tutor)
    {
    	this.name = name;
//    	this.tutor = tutor;
    }
    
    
    
    


    public Student(String enrollmentID, String name) {
		super();
		this.enrollmentID = enrollmentID;
		this.name = name;
	}






	public Student() {
		super();
	}
    
    


    


	public int getNumberOfCourses() {
		return numberOfCourses;
	}




	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", enrollmentID=" + enrollmentID + 
				", name=" + name 
				+ "]";
	}




	public Student(String name)
    {
    	this.name = name;
    	this.numberOfCourses = 10;
    }




	public Long getId() {
		return id;
	}




	public String getEnrollmentID() {
		return enrollmentID;
	}




	public String getName() {
		return name;
	}




//	public Tutor getTutor() {
//		return tutor;
//	}




	public void setEnrollmentID(String enrollmentID) {
		this.enrollmentID = enrollmentID;
	}




	public void setName(String name) {
		this.name = name;
	}




//	public void alocateTutor(Tutor tutor) {
//		this.tutor = tutor;
//	}
	
//	public String getTutorName() {
//		return this.tutor.getName();
//	}
	
	
	

}
