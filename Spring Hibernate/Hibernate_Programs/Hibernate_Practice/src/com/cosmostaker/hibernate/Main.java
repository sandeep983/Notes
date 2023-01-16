package com.cosmostaker.hibernate;

public class Main extends EmployeeMethods{
    public static void main(String[] args) {
		boolean quit = false;
    
        printMenu();

        // Infinite loop until user wants to exit from it.
        while(!quit) {
            System.out.println("---------------------------------------------");
            System.out.print("\nEnter your choice: ");
            // Restricting user to enter only integer numbers as choice.
            while (!sc.hasNextInt()) {
                sc.nextLine(); // to clear the buffer.
                System.out.println("Error: Choice you entered should be an integer number only.\n");
                System.out.print("Enter your choice again: ");
            }
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

			// Switch case to perform different operations based on user's choice.
            switch(choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    createRecord();
                    break;
                case 2:
                    listRecords();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    System.out.println("Thank you for using this application. Have a nice day!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Choice. Please choose the correct option.");
                    break;
            }
        }
	}
}
