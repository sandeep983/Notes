//Q36. Write a java program to define a method to arrange all the even elements after the odd elements.

import static ArrayMethods.ArrayMethods.*;
public class Q36 {
    public static void main(String[] args) {
        int [] array = readArray();
        printArray(mergeArrayZigZagOrder(oddElementsInArray(array), evenElementsInArray(array)));       
    }
}