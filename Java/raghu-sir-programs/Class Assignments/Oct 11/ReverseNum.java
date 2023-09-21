/*
Q2. write a java program to reverse the number ?
    input:345 output:543
*/

import java.util.Scanner;

public class ReverseNum {
    private static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int ld = num%10;
            num /= 10;
            rev = rev*10 + ld;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(reverse(number));
    }
}