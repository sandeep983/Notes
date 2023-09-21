/*
Q5. write a program to print how many odd digits present in the number:
    input:45792 output:3 
*/

//testcase failed

import java.util.Scanner;

public class OddDigits {
    private static int oddDigits(int num) {
        int count = 0;
        while (num != 0) 
        {
            int ld = num%10;
            if(ld%2 != 0)
            {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(oddDigits(number));
    }
}