/*
Print this pattern:
        A
      A B C
    A B C D E  
  A B C D E F G
A B C D E F G H I                */

import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
          for(int j=1; j<=n-i; j++) {
            System.out.print("  ");
          }

          for(int j=1; j<=i*2-1; j++) {
            System.out.print((char)(j+64)+" ");
          }
          System.out.println();
        } 
    } 
}