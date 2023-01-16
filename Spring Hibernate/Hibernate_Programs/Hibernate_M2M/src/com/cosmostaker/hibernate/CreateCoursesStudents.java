package com.cosmostaker.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cosmostaker.hibernate.entity.Course;
import com.cosmostaker.hibernate.entity.Instructor;
import com.cosmostaker.hibernate.entity.InstructorDetail;
import com.cosmostaker.hibernate.entity.Review;
import com.cosmostaker.hibernate.entity.Student;

public class CreateCoursesStudents {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		// Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			// Start a transaction
			session.beginTransaction();
			

			// Create a course
			Course tempCourse = new Course("Pacman - How To Score One Million Points");
		
			// save the course
			System.out.println("\nSaving the course");
			session.save(tempCourse);
			System.out.println("Saved the course: " + tempCourse);

			// Create the students
			Student tempStudent1 = new Student("John", "Doe", "john@abc.com");
			Student tempStudent2 = new Student("Mary", "Public", "marry@abc.com");

			// Add students to the course
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);

			// Save the students
			System.out.println("\nSaving students");
			session.save(tempStudent1);
			session.save(tempStudent2);
			System.out.println("Saved students: " + tempCourse.getStudents());
	

			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
