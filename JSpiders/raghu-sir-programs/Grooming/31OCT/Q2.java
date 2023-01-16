//Q2. WAJP to print all the Spy numbers between 1 to 100.

import java.util.Scanner;
public class Q2 {
    private static boolean isSpy(int n) {
        int sum=0;
        int prod=1;

        do {
            int ld= n%10;
            sum+=ld;
            prod*=ld;
            n/=10;
        } while(n>0);

        return sum==prod;
    }

    private static void printSpy(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isSpy(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        sc.close();

        printSpy(start, end);
    }
}
