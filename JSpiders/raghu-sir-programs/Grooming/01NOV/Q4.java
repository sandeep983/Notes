//Q4. WAJP to print Fibonacci series of n.

import java.util.Scanner;
public class Q4 {
    private static void fibonacci(int n) {
        int f1=0; //first number of series
        int f2=1; //second number of series

        while(f1 < n) {
            System.out.print(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        fibonacci(n);
    }
}
