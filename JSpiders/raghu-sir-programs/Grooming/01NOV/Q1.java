//Q1. WAJP to print N to 1 without using looping statements.

import java.util.Scanner;
public class Q1 {
    static void printNumbers(int n) {
        if (n<=0)
        {
            return;
        }
        else
        {
            System.out.print(n + " ");
            printNumbers(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        printNumbers(n);
    }
}
