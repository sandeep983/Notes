//Q7. Write a java program to define a method to return how many even numbers present in array.

import static ArrayMethods.ArrayMethods.*;
public class Q07 {
    private static boolean isEven(int n) {
        if(n%2==0) {
            return true;
        }
        return false;
    }

    private static int evenCount(int[] arr) {
        int count=0;
        
        for(int i=0; i<arr.length; i++) {
            if(isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("The count of even numbers are: "+ evenCount(readArray()));
    }
}
