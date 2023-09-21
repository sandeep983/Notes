//Q2. WAJP to print sum of all the numbers except strong numbers present between 1 to 1000.

import java.util.Scanner;
public class Q2 {
    private static int digitCount(int n) {
        int count = 0;
        do {
            n /= 10;
            count++;
        } while(n != 0);

        return count;
    }

    private static int getFact(int n) {
        int fact = 1;

        while(n>1) {
            fact = fact * n;
            n--;
        }

        return fact;
    }

    private static boolean isStrong(int n) {
        int sum=0, temp=n;

        while(n!=0) {
            int ld = n%10;
            sum = sum + getFact(ld);
            n /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        sc.close();

        for(int i=start; i<=end; i++) {
            if(isStrong(i) == false) {
                System.out.print(i + " ");
            }
        }
    }
}
