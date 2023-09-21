/*
Print the following pattern
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5                              */

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }

            for(int k=i; k<=n; k++) {
                System.out.print(k+" ");
            }
            
            System.out.println();
        }
    }
}
