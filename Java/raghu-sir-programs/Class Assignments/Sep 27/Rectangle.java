import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of a rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        System.out.println("Area of rectangle is: " + l*b);
        System.out.println("Perimeter of rectangle is: " + 2*(l+b));
    }
}