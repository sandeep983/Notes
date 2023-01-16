import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount, interest and time: ");
        double amt = sc.nextDouble();
        double roi = sc.nextDouble();
        double t = sc.nextDouble();
        sc.close();

        System.out.println((amt*roi*t)/100);
    }
}