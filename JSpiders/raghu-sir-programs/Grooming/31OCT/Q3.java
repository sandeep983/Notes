//Q3. WAJP to print sum of all the Prime numbers between 1 to 50.

import java.util.Scanner;
public class Q3 {
    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    private static int sumOfPrimes(int start, int end) {
        int sum=0;
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Sum of all the prime numbers is: "+ sumOfPrimes(start, end));
    }
}
