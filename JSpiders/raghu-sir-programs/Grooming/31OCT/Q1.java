//Q1. WAJP to check user entered number is Neon number or not.

import java.util.Scanner;
public class Q1 {
    private static boolean isNeon(int n) {
        int sum=0;
        int sq=n*n;
        do {
            int ld= sq%10;
            sum+=ld;
            sq/=10;
        } while(sq>0);
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if(isNeon(n)) {
            System.out.println(n+" is a Neon number.");
        } else {
            System.out.println(n+" is not a Neon number.");
        }
    }
}