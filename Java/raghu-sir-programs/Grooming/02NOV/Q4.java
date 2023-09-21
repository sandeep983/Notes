//Q4. WAJP to print sum of all the armstrong numbers present between user entered two digit number.

import java.util.Scanner;
public class Q4 {
    private static int digitCount(int n) {
        int count = 0;
        do {
            n /= 10;
            count++;
        } while(n != 0);

        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;
        while(p>0) {
            pw *= n;
            p--;
        }
        return pw;
    }

    private static boolean isArmstrong(int n) {
        int sum=0, temp = n;
        int dc = digitCount(n);

        do {
            int r = n % 10;
            sum += pow(r, dc);
            n /= 10;
        }while(n!=0);

        return temp == sum;     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        sc.close();

        int sum=0;

        for(int i=start; i<=end; i++) {
            if(isArmstrong(i)) {
                sum = sum+i;
            }
        }

        System.out.println("Sum of armstrong number from "+ start + " to " + end + " is: " + sum);
    }   
}
