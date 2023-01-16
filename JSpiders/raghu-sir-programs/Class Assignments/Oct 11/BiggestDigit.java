/*
Q3. Write a java program to print the biggest digits in the number?
    input:464787 output:8
*/

import java.util.Scanner;

public class BiggestDigit {
    private static int biggestDigit(int num) {
        int bd = 0;
        while (num != 0) {
            int ld = num%10;
            if(ld>bd){
                bd=ld;
            }
            num /= 10;
        }
        return bd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(biggestDigit(number));
    }
}