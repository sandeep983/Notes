/*
Print this pattern:
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E                     */

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    } 
}