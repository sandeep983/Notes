/*
Print the following pattern
        a
      b a b
    c b a b c
  d c b a b c d 
e d c b a b c d e              */

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            int x=i;
            for(int j=1; j<=i*2-1; j++) {
                System.out.print((char)(x+96)+" ");
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
