//Q5. WAJP to print all the special two digits number.

import java.util.Scanner;
public class Q5 {
    private static boolean isSpecial(int n) {
        int sum=0, prod=1, temp=n;

        while(n!=0) {
            int ld = n%10;
            sum = sum+ld;
            prod = prod*ld;
            n /= 10;
        }

        return sum+prod == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();
        sc.close();

        for(int i=start; i<=end; i++) {
            if(isSpecial(i)) {
                System.out.print(i + " ");
            }
        }
    }
}