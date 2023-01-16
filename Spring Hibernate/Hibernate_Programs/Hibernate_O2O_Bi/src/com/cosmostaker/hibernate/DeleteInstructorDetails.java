package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Instructor;
import com.cosmostaker.hibernate.entity.InstructorDetail;

public class DeleteInstructorDetails {
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
			// Start a transaction
			session.beginTransaction();
			
			// Get the instructor detail object
			int theId = 4;
			InstructorDetail id = session.get(InstructorDetail.class, theId);

			// Print the instructor detail
			System.out.println("\nInstructorDetail: " + id);

			// Print the associated instructor
			System.out.println("The associated instructor: " + id.getInstructor());
			
			// Delete the instructor detail
			System.out.println("Deleting instructor detail: " + id);

			// Remove the associated object reference
			id.getInstructor().setInstructorDetail(null);

			session.delete(id);

			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!\n");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
