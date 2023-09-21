//Q9. Write a java program to define a method to return how many prime numbers present in array within 100.

import static ArrayMethods.ArrayMethods.*;
public class Q09 {
    private static boolean isPrime(int n) {
        if(n>100) {
            return false;
        }
        else {
            for(int i=2; i<n/2; i++) {
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int primeCount(int[] arr) {
        int count=0;
        
        for(int i=0; i<arr.length; i++) {
            if(isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The count of prime numbers within 100 is: "+ primeCount(readArray()));
    }
}
