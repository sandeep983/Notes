/*
Print this pattern:

1 2 3 4 3 2 1
  2 3 4 3 2
    3 4 3 
      4
    3 4 3 
  2 3 4 3 2
1 2 3 4 3 2 1            */

import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();
        
        int sp=0, st=n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sp; j++) {
                System.out.print("  ");
            }

            int x=sp+1;
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
                sp++;
                st=st-2;
            }
            else {
                sp--;
                st=st+2;
            }
            System.out.println();
        }
    } 
}