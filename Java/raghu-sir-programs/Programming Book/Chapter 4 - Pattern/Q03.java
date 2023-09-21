/*
Print the following pattern
        1
      1 * 2
    1 * 2 * 3
  1 * 2 * 3 * 4
1 * 2 * 3 * 4 * 5           */

import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k);

                if(k<i) {
                    System.out.print("*");
                }  
            }
            
            System.out.println();
        }
    }
}