/*
Print the following pattern
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1                */

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++) {
            for(int j=n; j>=1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
