//Q21. Write a java program to define a method to return reverse the elements present in the array.

import static ArrayMethods.ArrayMethods.*;
public class Q21 {
    public static void main(String[] args) {
        int [] array = readArray();
        System.out.println("Array after the reverse: ");
        
        printArray(reverseArray(array));
    }
}