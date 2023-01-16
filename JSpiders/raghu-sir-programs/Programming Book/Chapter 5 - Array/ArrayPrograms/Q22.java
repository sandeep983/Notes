//Q22. Write a java program to define a method to combine two array elements into single array.

import static ArrayMethods.ArrayMethods.*;
public class Q22 {
    public static void main(String[] args) {
        System.out.println("For First Array: ");
        int [] a = readArray();

        System.out.println("For Second Array: ");
        int [] b = readArray();

        printArray(mergeArrays(a, b));
    }
}