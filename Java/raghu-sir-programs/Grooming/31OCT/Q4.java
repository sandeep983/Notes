//Q4. WAJP to print Leap Years between 2000 to 2500.

import java.util.Scanner;
public class Q4 {
    private static boolean isLeapYear(int y) {
        return y%4==0 && y%100!=0 || y%400==0;
    }    

    private static void printLeapYears(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int start = sc.nextInt();
        System.out.print("Enter end year: ");
        int end = sc.nextInt();
        sc.close();

        printLeapYears(start, end);
    }
}
