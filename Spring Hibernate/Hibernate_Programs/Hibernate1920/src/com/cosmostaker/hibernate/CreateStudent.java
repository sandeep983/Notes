package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Student;

public class CreateStudent {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Create a student object
			System.out.println("Creating new student object...");
			Student s1 = new Student("Rohan", "Singh", "rsingh@abc.com");
			
			// Start a transaction
			session.beginTransaction();
			
			// Save the student object
			System.out.println("Saving the student object...");
			session.save(s1);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
