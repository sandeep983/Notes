package com.cosmostaker.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Student;

public class QueryStudent {
	private static void displayStudents(List<Student> theStudents) {
		for(Student s: theStudents) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Start a transaction
			session.beginTransaction();
			
			
			// Query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			// Display students
			displayStudents(theStudents);
			
			
			// Query with special condition: lastName='Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			// Display students
			displayStudents(theStudents);
			
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}




















