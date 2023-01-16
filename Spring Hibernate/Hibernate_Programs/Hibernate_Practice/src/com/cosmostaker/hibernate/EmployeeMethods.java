package com.cosmostaker.hibernate;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cosmostaker.hibernate.entity.Employee;

public class EmployeeMethods {
	protected static final Scanner sc = new Scanner(System.in);

	// To print menu options
	protected static void printMenu() {
		System.out.println("\nPress: " +  
		"\n0. Print menu again" +
		"\n1. Create/Add new employee record" +
		"\n2. Read/List all the employees record" +
		"\n3. Update existing employee record" +
		"\n4. Delete an employee record" +
		"\n5. Exit"
		);
	}


	private static Session createSession() {
        // Create session factory
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .buildSessionFactory();

        
        // Create session and return it
        Session session = factory.getCurrentSession();
        
		return session;
    }



	// To add the record in the database
	protected static void createRecord() {
		System.out.println("Enter the employee details: ");
		System.out.print("First name: ");
		String fname = sc.nextLine();

		System.out.print("Last name: ");
		String lname = sc.nextLine();

		System.out.print("Company name: ");
		String company = sc.nextLine();
		System.out.println();

		// Create session factory
		Session session = createSession();

		// Create an employee object
		System.out.println("\nCreating new employee record...");
		Employee e = new Employee(fname, lname, company);
		
		// Start a transaction
		session.beginTransaction();
		System.out.println("Saving the employee record...");
		session.save(e);
		
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Record created successfully!");

		session.close();
	}



	// To delete the record from the database
	protected static void deleteRecord() {
		System.out.print("Enter the id of the Employee: ");
		int id = sc.nextInt();
		System.out.println();

		// Create session factory
		Session session = createSession();

		// Start a transaction
		session.beginTransaction();

		// Retrieve the employee based on the id: primary key
		System.out.println("\nRetriving the employee record with id: " +id+ "...");
		Employee e = session.get(Employee.class, id);

		if(e == null) {
			System.out.println("\nNo record found with id: " +id);
			return;
		}
		else {
			System.out.println("\nRecord found!");

			// Delete the employee
			System.out.println("Deleting the employee record...");
			session.delete(e);

			// Commit transaction
			session.getTransaction().commit();
			System.out.println("Record deleted successfully!");
		}

		session.close();
	}



	// To list all the records in the database
	protected static void listRecords() {
		// Create session factory
		Session session = createSession();

		// Start a transaction
		session.beginTransaction();

		// Query employees and store in a list
		List<Employee> employeeList = session.createQuery("from Employee").getResultList();
		
		boolean check = false;
		if(employeeList.isEmpty()) {
			System.out.println("\nNo records found!");
		}
		else {
			check = true;
			System.out.println("\nRecords found: ");
			// Display the employees
			for(Employee e: employeeList) {
				System.out.println(e);
			}
		}

		// Commit transaction
		session.getTransaction().commit();
		if(check) {
			System.out.println("\nRecords listed successfully!");
		}

		session.close();
	}



	// To update the record in the database
	protected static void updateRecord() {
		System.out.print("Enter the id of the Employee: ");
		int id = sc.nextInt();
		System.out.println();

		// Create session factory
		Session session = createSession();

		// Start a transaction
		session.beginTransaction();

		// Retrieve the employee based on the id: primary key
		System.out.println("\nRetriving the employee record with id: " +id+ "...");
		Employee e = session.get(Employee.class, id);

		if(e == null) {
			System.out.println("\nNo record found with id: " +id);
			return;
		}
		else {
			System.out.println("\nRecord found!");

			// Update the employee
			System.out.println("Enter the new details:");
			sc.nextLine(); // To clear the buffer

			System.out.print("First name: ");
			String fname = sc.nextLine();
			e.setFirstName(fname);

			System.out.print("Last name: ");
			String lname = sc.nextLine();
			e.setLastName(lname);

			System.out.print("Company name: ");
			String company = sc.nextLine();
			e.setCompany(company);

			// Commit transaction
			session.getTransaction().commit();

			System.out.println("Record updated successfully!");
		
			session.close();
		}
	}
}