package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Instructor;
import com.cosmostaker.hibernate.entity.InstructorDetail;

public class Create {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Create the objects
			Instructor i = new Instructor("Chad", "Derby", "derby@abc.com");
			InstructorDetail id = new InstructorDetail("http://www.youtube.com", "Guitar!!");
			
			// Associate the objects
			i.setInstructorDetail(id);

			// Start a transaction
			session.beginTransaction();
			
			// Save the instructor
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL

			System.out.println("Saving instructor: " + i);
			session.save(i);

			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
