package com.yrgo.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;


@Entity
public class Tutor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String tutorId;
	private String name;
	private int salary;
	
	
	@ManyToMany
	private Set<Student>students=new HashSet<>();
	
	@ManyToMany
	private Set<Subject>subjects = new HashSet<>();
	
//	@OneToMany
//	@JoinColumn(name="TUTOR_FK")
//	private Set<Student>students=new HashSet<>();
	
//	@OneToMany
//	@MapKey(name="enrollmentID")
//	@JoinColumn(name="TUTOR_FK")
//	private Map<String, Student> students = new HashMap<>();
	
	
	public Tutor(String tutorId, String name, int salary) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.salary = salary;
	}


	public Tutor() {
		super();
	}


	@Override
	public String toString() {
		return "Tutor [id=" + id + ", tutorId=" + tutorId + ", name=" + name + ", salary=" + salary + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTutorId() {
		return tutorId;
	}


	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Set<Student> getStudents() {
		Set<Student> unmodifiableSet = Collections.unmodifiableSet(this.students);
		return unmodifiableSet;
	}


	public void addStudentToGroup(Student student) {
		this.students.add(student);
	}


	public Set<Subject> getSubjects() {
		Set<Subject> unmodifiableSet = Collections.unmodifiableSet(this.subjects);
		return unmodifiableSet;
	}


	public void addSubject(Subject subjects) {
		this.subjects.add(subjects);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
