/*
Q4. Write a java program to print how many prime digits present in the number?
ex:
    input: 2341 output:3 (2 3 and 1 is prime digits) 
*/
import java.util.Scanner;

public class PrimeDigits {
       private static int primeDigitCount(int n) {
        int count=0;
        while(n!=0)
        {
            int r=n%10;
            if(r==1 || r==2 || r==3 || r==5 || r==7)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(primeDigitCount(number));
    }
}
