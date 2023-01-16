//Q24. Write a java program to define a method to delete the element from the specified index.

import static ArrayMethods.ArrayMethods.*;
public class Q24 {
    public static void main(String[] args) {
        int [] array = readArray();
        
        System.out.print("Enter the index number: ");
        int index = sc.nextInt();

        printArray(deleteAtIndex(array, index));
    }
}