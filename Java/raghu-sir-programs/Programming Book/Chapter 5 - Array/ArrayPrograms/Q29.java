//Q29. Write a java program to define a method to print magic values from the array.

import static ArrayMethods.ArrayMethods.*;
public class Q29 {
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.println("Magic values in array: ");
        printMagicValues(array);
    }
}