//Q13. Write a java program to define a method to return how many palindrome numbers are present in the array within 100.

import static ArrayMethods.ArrayMethods.*;
public class Q13 {
    private static boolean isPalindrome(int n) {
        if(n>100) {
            return false;
        }
        else {
            int rev = 0, temp=n;

            do {
                int ld = n%10;
                rev = rev*10 + ld;
                n /= 10;
            } while(n!=0);
            
            return rev == temp;
        }
    }

    private static int palindromeCount(int[] arr) {
        int count=0;
        
        for(int i=0; i<arr.length; i++) {
            if(isPalindrome(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The count of palindrome numbers within 100 is: " + palindromeCount(readArray()));
    }
}