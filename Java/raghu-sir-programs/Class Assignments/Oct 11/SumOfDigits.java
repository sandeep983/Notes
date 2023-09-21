/*
Q7. Write a java program to print the sum of digits in the number?
input: 345 output: 12
*/

import java.util.Scanner;

public class SumOfDigits {
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int ld = num%10;
            sum += ld;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(sumOfDigits(number));
    }
}