package com.yrgo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yrgo.domain.Student;
import com.yrgo.domain.Subject;
import com.yrgo.domain.Tutor;

public class HibernateTest {

	private static SessionFactory sessionFactory = null;

	public static void main(String[] args) {

		sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Student student = new Student("Anakin Skywalker", "Obi Wan Kenobi");
		
//		session.save(student);
//		Student foundStudent = (Student) session.get(Student.class, 1L);
		
//		Student toDelete = (Student) session.get(Student.class, 3L);
//		session.delete(toDelete);
		
//		Student toChange = (Student) session.get(Student.class, 4L);
//		toChange.setTutorName("Sony The hedgehog");

		
//		Student student = new Student("Mr Lova Lova");
//		session.save(student);
		
//		Student found = (Student) session.get(Student.class, 2L);
//		System.out.println(found);
//		System.out.println(found.getTutorName());
		
//		Tutor tutor = new Tutor("DEF456" ,"Henrik Pettersson", 35000);
//		Student student = new Student("Susan Lindberg”");
//		student.alocateTutor(tutor);
//		System.out.println(student.getTutor());
//		
//		session.save(tutor);
//		session.save(student);

//		Student s1 = new Student("Darth Vader");
//		Student s2 = new Student("Darth Maul");
//		Student s3 = new Student("Darth Bob");
//		
//		Tutor tutor = new Tutor("lubbba1", "Obi-Wan Kenobi", 12121);
//		
//		tutor.addStudentToGroup(s1);
//		tutor.addStudentToGroup(s2);
//		tutor.addStudentToGroup(s3);
//
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(tutor);
		
//		Student student1 = new Student("1-HOW-2017","Patrik Howard");
//		Student student2 = new Student("2-SAN-2018", "Marie Sani");
//		Student student3 = new Student("3-NIK-2019", "Tom Nikson");
//		
//		session.save(student1);
//		session.save(student2);
//		session.save(student3);
		
//		Student s1 = (Student) session.get(Student.class, 1L);
//		Student s2 = (Student) session.get(Student.class, 2L);
//		Student s3 = (Student) session.get(Student.class, 3L);
//		
		Tutor tutor = new Tutor("Draki", "BulleMage", 56546);
//		tutor.addStudentToGroup(s1);
//		tutor.addStudentToGroup(s2);
//		tutor.addStudentToGroup(s3);
		
		Subject s1 = (Subject) session.get(Subject.class, 1L);
		Subject s2 = new Subject("Driving", 1);
//		
//
		tutor.addSubject(s1);
		tutor.addSubject(s2);
//		
		session.save(tutor);
//		session.save(s1);
		session.save(s2);
		
		
//		Tutor tutor = (Tutor) session.get(Tutor.class, 1L);
//		for (Subject subject : tutor.getSubjects()) {
//			System.out.println(subject.getSubjectName());
//		}
		
		
		
		
//		Tutor tutor = (Tutor) session.get(Tutor.class, 1L);
//		for(Student student : tutor.getStudents()) {
//			System.out.println(student.getName());
//		}
		
		
		tx.commit();
		session.close();
		
	}

	private static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}

}
