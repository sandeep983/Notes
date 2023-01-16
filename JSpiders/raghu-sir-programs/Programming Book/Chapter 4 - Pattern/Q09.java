/*
Print the following pattern
        a
      a b c
    a b c d e
  a b c d e f g
a b c d e  f g h i           */

import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i*2-1; k++) {
                System.out.print((char)(k+96));
            }
            
            System.out.println();
        }
    }
}
