//Q23. Write a java program to define a method to insert the element in the specified index.

import static ArrayMethods.ArrayMethods.*;
public class Q23 {  
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.print("Enter the element: ");
        int element = sc.nextInt();
        
        System.out.print("Enter the index number: ");
        int index = sc.nextInt();

        printArray(insertAtIndex(array, element, index));
    }
}