package Aggregation.Example_1;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Bangalore", "Karnataka", "India", 560076);
        Address a2 = new Address("Itarsi", "Madhya Pradesh", "India", 461111);
        
        Student s1 = new Student("Surbhi", 01, a1);
        Student s2 = new Student("Sandeep", 02, a2);
        
        s1.display();
        s2.display();

        //If we delete the student address still exists
        System.out.println(a1.city);
    }
}
