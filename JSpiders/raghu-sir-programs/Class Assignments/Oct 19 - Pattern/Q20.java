/*
Print this pattern:
        1
      0 1 0      
    1 0 1 0 1 
  0 1 0 1 0 1 0
1 0 1 0 1 0 1 0 1              */

import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        int x=1;
        for(int i=1; i<=n; i++) {
          for(int j=1; j<=n-i; j++) {
            System.out.print("  ");
          }
          for(int j=1; j<=i*2-1; j++) {
            System.out.print(x%2+" ");
            x++;
          }

          System.out.println();
        }

       
    } 
}