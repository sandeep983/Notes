import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount, rate and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        sc.close();
        System.out.println("Simple interest is: " + (p*r*t)/100);
    }
}
