/*
Q1. Print the sum of smallest digit and biggest digit?
input:23412 output:5
*/

import java.util.Scanner;

public class SumSmallBiggest {
    private static int smallestDigit(int num) {
        int sd = num;
        while (num != 0) {
            int ld = num%10;
            if(ld<sd){
                sd=ld;
            }
            num /= 10;
        }
        return sd;
    }

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

    private static int sumOfSmallestAndBiggest(int num)
    {
        return smallestDigit(num) + biggestDigit(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(sumOfSmallestAndBiggest(number));
    }
}
