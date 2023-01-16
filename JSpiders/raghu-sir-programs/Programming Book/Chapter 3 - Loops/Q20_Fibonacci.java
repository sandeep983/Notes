import java.util.Scanner;

public class Q20_Fibonacci {
    private static void fibonacci(int n) {
        int f1=0; //first number of series
        int f2=1; //second number of series

        while(f1 < n) {
            System.out.print(f1 + " ");
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        fibonacci(n);
    }
}