package Aggregation.Example_1;

public class Student {
    String name;
    int rollno;
    Address address;

    public Student(String name, int rollno, Address address) {
        this.rollno = rollno;
        this.name = name; 
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name + ", " + "Roll no: " + rollno);
        System.out.println("Address: " + address.city + " " + address.state + " " + address.country + " " + address.pincode);
    }
}
