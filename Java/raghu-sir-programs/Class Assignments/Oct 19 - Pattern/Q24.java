/*
Print this pattern:
        5
      4 5
    3 4 5   
  2 3 4 5  
1 2 3 4 5               */

import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--) {
          for(int j=1; j<=i-1; j++) {
            System.out.print("  ");
          }

          for(int j=i; j<=n; j++) {
            System.out.print(j+" ");
          }
          System.out.println();
        }
    } 
}