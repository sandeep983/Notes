/*
Print this pattern:
A
A B
A B C
A B C D
A B C D E               */

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    } 
}