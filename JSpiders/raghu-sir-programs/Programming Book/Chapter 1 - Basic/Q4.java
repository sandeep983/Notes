import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the Square: ");
        double s = sc.nextDouble();
        sc.close();

        System.out.println("Area: "+(s*s));
        System.out.println("Perimeter: "+(4*s));
    }
}