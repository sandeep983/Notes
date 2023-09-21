//Q3. WAJP to print all the non-perfect numbers present between 500 to 1000.

import java.util.Scanner;
public class Q3 {
    private static boolean isPerfect(int n) {
        int sum=0;
        for(int i=1; i<=n/2; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        return sum==n;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        sc.close();

        for(int i=start; i<=end; i++) {
            if(isPerfect(i) == false) {
                System.out.print(i + " ");
            }
        }
    }
}
