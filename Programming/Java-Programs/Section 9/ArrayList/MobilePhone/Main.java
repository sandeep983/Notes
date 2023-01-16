package MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;

        startPhone();
        printActions();

        while(!quit) {
            System.out.print("\nEnter your choice: ");
            int action = sc.nextInt();
            sc.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }


    private static void addNewContact() {
        System.out.print("Enter new contact name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        Contact newContact = Contact.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: \n" + "Name = " + name + ", phone = "+ phone);
        } 
        else {
            System.out.println("Cannot add, " + name + " already exists.");
        }
    }


    private static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = sc.nextLine();

        System.out.print("Enter new contact phone number: ");
        String newNumber = sc.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated the record.");
        } 
        else {
            System.out.println("Error updating record.");
        }
    }


    private static void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } 
        else {
            System.out.println("Error deleting contact.");
        }
    }


    private static void queryContact() {
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }


    private static void startPhone() {
        System.out.println("Starting phone...");
    }


    private static void printActions() {
        System.out.println("\nPress:");
        System.out.println("0  - to shutdown\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an contact exists\n" +
                           "6  - to print a list of available actions.");
    }
}
