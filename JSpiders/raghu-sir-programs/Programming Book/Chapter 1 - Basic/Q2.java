import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        sc.close();

        System.out.println("Area: " + (3.1415 * r * r));
        System.out.println("Circumference: " + (2 * 3.1415 * r));
    }
}