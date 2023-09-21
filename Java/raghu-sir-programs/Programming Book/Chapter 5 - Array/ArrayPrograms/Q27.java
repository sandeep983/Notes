//Q27. Write a java program to define a method to merge two sorted array into single array in sorted format.

import static ArrayMethods.ArrayMethods.*;
public class Q27 {
    public static void main(String[] args) {
        System.out.println("For First Array: ");
        int [] a = readArray();

        System.out.println("For Second Array: ");
        int [] b = readArray();

        printArray(mergeSortedArray(a, b));
    }
}