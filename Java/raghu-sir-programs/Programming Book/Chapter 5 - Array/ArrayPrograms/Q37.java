//Q37. Write a java program to count all the even number and odd numbers present in array.

import static ArrayMethods.ArrayMethods.*;
public class Q37 {
    public static void main(String[] args) {
        int [] array = readArray();

        int evenCount = evenCountInArray(array);
        int oddCount = oddCountInArray(array);

        System.out.println("Even numbers count is: " + evenCount);
        System.out.println("Odd numbers count is: " + oddCount);
    }
}