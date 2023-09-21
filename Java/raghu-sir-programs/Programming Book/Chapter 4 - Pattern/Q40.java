/*
Print the following pattern n=5
1       1
12     21
123   321
1234 4321 
123454321                    */

import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
        
            for(int j=1; j<=2*(n-i)-1; j++) {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                if(j==n) {
                    continue;
                }
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
    