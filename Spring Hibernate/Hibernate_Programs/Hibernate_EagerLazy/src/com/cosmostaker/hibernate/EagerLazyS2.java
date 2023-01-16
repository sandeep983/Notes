package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cosmostaker.hibernate.entity.Course;
import com.cosmostaker.hibernate.entity.Instructor;
import com.cosmostaker.hibernate.entity.InstructorDetail;

public class EagerLazyS2 {
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

			//// Solution 2: Hibernate query with HQL
			Query<Instructor> query = session.createQuery("select i from Instructor i "
					+ "JOIN FETCH i.courses "
					+ "where i.id=:theInstructorId", Instructor.class);
					
			// Set parameter on query
			query.setParameter("theInstructorId", theId);

			// Execute query and get instructor
			Instructor inst = query.getSingleResult();

			System.out.println("\nDEBUG:: Instructor: " + inst);

			// Commit transaction
			session.getTransaction().commit();
			session.close();
			
			System.out.println("\nDEBUG:: Courses: " + inst.getCourses());

			System.out.println("\nDEBUG:: Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
