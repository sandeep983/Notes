//Q2. WAJP to print Factorial of n without using looping statement. 

import java.util.Scanner;
public class Q2 {
    private static int printFact(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return(n * printFact(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(printFact(n));
    }
}
