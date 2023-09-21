//Q26. Write a java program to define a method to merge two array elements into single array in zigzag order.

import static ArrayMethods.ArrayMethods.*;
public class Q26 {
    public static void main(String[] args) {
        System.out.println("For First Array: ");
        int [] a = readArray();

        System.out.println("For Second Array: ");
        int [] b = readArray();

        printArray(mergeArrayZigZagOrder(a, b));
    }
}