package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			int studentId = 1;
			
			// Get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// Retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
			
			// Commit the transaction
			session.getTransaction().commit();
			

			// New Update for email address
			session = factory.getCurrentSession();
			session.beginTransaction();

			// Update email for all students
			System.out.println("Update email for all students");
			session.createQuery("update Student set email='abc@gmail.com'").executeUpdate();

			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}




















