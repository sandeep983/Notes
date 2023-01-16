//Q38. Write a java program to count all the even number and odd numbers present in array.

import static ArrayMethods.ArrayMethods.*;
public class Q38 {
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.print("Even elements are: ");
        printArray(evenElementsInArray(array));

        System.out.println();

        System.out.print("Odd elements are: ");
        printArray(oddElementsInArray(array));
    }
}