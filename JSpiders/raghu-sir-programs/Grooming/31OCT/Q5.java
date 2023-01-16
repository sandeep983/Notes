//Q5. WAJP to count all the palindrome numbers between 1 to 500.

import java.util.Scanner;
public class Q5 {
    private static boolean isPalindrome(int n) {
        int rev=0, temp=n;
        while(temp!=0) {
            rev = rev*10 + temp%10;
            temp/=10;
        }
        return rev==n;
    }

    private static void printPalindrome(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        sc.close();

        printPalindrome(start, end);
    }
}
