/*
Print the following pattern
*     *     *
  *   *   *  
    * * *   
* * * * * * * 
    * * *   
  *   *   * 
*     *     *                               */

import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==n/2+1 || j==n/2+1 || i==j || i+j == n+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
}