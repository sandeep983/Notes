package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Student;

public class PrimaryKey {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Create 3 student object
			System.out.println("Creating 3 student object...");
			Student s1 = new Student("Satyam", "Singh", "rsingh@abc.com");
			Student s2 = new Student("Mohan", "Singh", "msingh@abc.com");
			Student s3 = new Student("Sohan", "Singh", "ssingh@abc.com");
			
			// Start a transaction
			session.beginTransaction();
			
			// Save the student object
			System.out.println("Saving the student object...");
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
