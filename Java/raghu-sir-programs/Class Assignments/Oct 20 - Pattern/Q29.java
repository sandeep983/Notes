/*
Print this pattern:
        A
      B A B
    C B A B C 
  D C B A B C D 
E D C B A B C D E               */

import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            int x=i;
            for(int j=1; j<=i*2-1; j++) {
                System.out.print((char)(x+64)+" ");
                if(j<i) {
                    x--;
                } 
                else {
                    x++;
                }
            }
            System.out.println();
        }
    } 
}