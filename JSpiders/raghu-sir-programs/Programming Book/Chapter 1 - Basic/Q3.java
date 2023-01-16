import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        System.out.println("Area: "+(l*b));
        System.out.println("Perimeter: "+(2*(l+b)));
    }
}