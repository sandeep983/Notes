import java.util.Scanner;
public class Stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a stick in inches: ");
        double l = sc.nextDouble();
        sc.close();
        System.out.println("Length of stick in feet is: " + l/12);
        System.out.println("Length of stick in meters is: " + l*0.0254);
    }
}
