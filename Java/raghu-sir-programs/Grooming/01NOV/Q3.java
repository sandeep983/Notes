//Q3. WAJP to print GCD (Greatest Common Divisor) of user entered two integers.

import java.util.Scanner;
public class Q3 {
    private static int gcd(int a, int b) {
        int t;

        if(a < b)
            t=a;
        else
            t=b;

        while(t>=1) {
            if(a%t==0 && b%t==0) 
                break;
            t--;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nGCD is: "+gcd(a, b));
    }
}
