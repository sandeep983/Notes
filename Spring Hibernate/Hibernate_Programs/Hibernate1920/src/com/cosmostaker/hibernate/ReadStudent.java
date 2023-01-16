package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Student;

public class ReadStudent {
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
			Student s1 = new Student("John", "Doe", "jdoe@abc.com");
			
			// Start a transaction
			session.beginTransaction();
			
			// Save the student object
			System.out.println("Saving the student...");
			System.out.println(s1);
			session.save(s1);
			
			// Commit transaction
			session.getTransaction().commit();
			
			
			
			// Find out the student's id: primary key
			System.out.println("Saved student. Generated id: " + s1.getId());
			
			// Get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// Retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + s1.getId());
			Student myStudent = session.get(Student.class, s1.getId());
			System.out.println("Get complete: " + myStudent);
			
			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}




















