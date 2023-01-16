/*
Q6. Write a java program to print pass if sum of even digits equals to sum odd digits otherwise print fail

ex: 3256 for this no print pass 
    bcz sum of even digits 8 and sum of odd digits 8 
ex: 234  for this print fail
*/

import java.util.Scanner;

public class PassFail {
    private static int sumOfEvenDigits(int num)
    {   
        int sumEven = 0;
        while(num != 0)
        {
            int ld = num%10;
            if(ld%2 == 0){
                sumEven += ld;
            }
            num /= 10;
        }
        return sumEven;
    }

    private static int sumOfOddDigits(int num) 
    {
        int sumOdd = 0;
        while(num != 0)
        {
            int ld = num%10;
            if(ld%2 != 0){
                sumOdd += ld;
            }
            num /= 10;
        }
        return sumOdd;
    }

    private static void passFail(int num)
    {
       if(sumOfEvenDigits(num) == sumOfOddDigits(num))
       {
            System.out.println("pass");
       }
       else
       {
            System.out.println("fail");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        passFail(number);
    }
}