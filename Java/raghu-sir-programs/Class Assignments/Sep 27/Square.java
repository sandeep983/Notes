import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a square: ");
        double s = sc.nextDouble();
        sc.close();
        System.out.println("Area of square is: " + s*s);
        System.out.println("Perimeter of square is: " + 4*s);
    }
}
