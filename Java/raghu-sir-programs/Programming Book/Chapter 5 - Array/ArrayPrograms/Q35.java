//Q35. Write a java program to print the biggest and lowest elements present in arrays.

import static ArrayMethods.ArrayMethods.*;
public class Q35 {
    public static void main(String[] args) {
        int [] array = readArray();

        int smallest = getSmallest(array);
        int biggest = getBiggest(array);

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The biggest element is: " + biggest);
    }
}