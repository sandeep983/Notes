//Q15. Write a java program to define a method to return how many odd numbers present in array within 1000.

import static ArrayMethods.ArrayMethods.*;
public class Q15 {
    private static boolean isOdd(int n) {
        if(n>1000) {
            return false;
        }
        else {
            if(n%2!=0) {
                return true;
            }
            return false;
        }
    }

    private static int oddCount(int[] arr) {
        int count=0;
        
        for(int i=0; i<arr.length; i++) {
            if(isOdd(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The count of odd numbers within 1000 is: "+ oddCount(readArray()));
    }
}
