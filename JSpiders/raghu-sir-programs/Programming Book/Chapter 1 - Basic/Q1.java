import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter mobile number: ");
        long mobile = sc.nextLong();

        System.out.print("Enter 10th percentage: ");
        double tenPer = sc.nextDouble();

        System.out.print("Enter 12th percentage: ");
        double twelvePer = sc.nextDouble();

        System.out.print("Enter degree percentage: ");
        double degreePer = sc.nextDouble();

        sc.close();

        System.out.println("Name: "+name+"\nMobile Number: "+mobile);
        System.out.println("10th: "+tenPer+"\n12th: "+twelvePer+"\nDegree: "+degreePer);
    }
}