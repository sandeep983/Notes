import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("Addition: "+(a+b));
        System.out.println("Substraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
    }
}