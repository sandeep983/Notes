//Q1. WAJP to print sum of all the non-prime numbers present between 1 to 500.

import java.util.Scanner;
public class Q1 {
    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        sc.close();

        int sum=0;

        for(int i=start; i<=end; i++) {
            if(isPrime(i) == false) {
                sum = sum+i;
            }
        }

        System.out.println("The sum of non- prime numbers between "+ start +" to "+ end +" is: "+ sum);
        //output = 103213
    }
}
