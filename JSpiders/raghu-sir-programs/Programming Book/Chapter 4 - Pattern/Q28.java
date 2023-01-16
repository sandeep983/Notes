/*
Print the following pattern
      1
    1 2 1
  1 2 3 2 1 
1 2 3 4 3 2 1
  1 2 3 2 1
    1 2 1
      1                      */

import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        int sp=n/2, st=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sp; j++) {
                System.out.print("  ");
            }

            int x=1;
            for(int j=1; j<=st; j++) {
                System.out.print(x+" ");
                if(j<=st/2) {
                    x++;
                }
                else {
                    x--;
                }
            }

            if(i<=n/2) {
                sp--;
                st=st+2;
            }
            else {
                sp++;
                st=st-2;
            }     
            
            System.out.println();
        }
    }
}