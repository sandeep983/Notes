package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Course;
import com.cosmostaker.hibernate.entity.Instructor;
import com.cosmostaker.hibernate.entity.InstructorDetail;

public class EagerLazy {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Start a transaction
			session.beginTransaction();
			
			// Get the instructor from db
			int theId = 1;
			Instructor inst = session.get(Instructor.class, theId);

			System.out.println("\nDEBUG:: Instructor: " + inst);

			// Get courses for the instructor
			System.out.println("\nDEBUG:: Courses: " + inst.getCourses());

			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("\nDEBUG:: Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
