/*
Q8. Write a java program to print good if number of even digits equals to number of odd digits other wise print bad?
ex: 345768
    no of even digits 3 and no of odd digits 3 so you print good
ex: 342
    for this print bad because no of odd digits 1 no of even digits 2
*/

import java.util.Scanner;

public class GoodBad {
    private static int evenDigitCount(int num)
    {   
        int evenCount = 0;
        while(num != 0)
        {
            int ld = num%10;
            if(ld%2 == 0){
                evenCount++;
            }
            num /= 10;
        }
        return evenCount;
    }

    private static int oddDigitCount(int num) 
    {
        int oddCount = 0;
        while(num != 0)
        {
            int ld = num%10;
            if(ld%2 != 0){
                oddCount++;
            }
            num /= 10;
        }
        return oddCount;
    }

    private static void goodOrBad(int num)
    {
       if(evenDigitCount(num) == oddDigitCount(num))
       {
            System.out.println("good");
       }
       else
       {
            System.out.println("bad");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        goodOrBad(number);
    }
}