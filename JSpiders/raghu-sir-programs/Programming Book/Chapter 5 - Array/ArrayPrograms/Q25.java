//Q25. Write a java program to insert the another array at specified index in given array.

import static ArrayMethods.ArrayMethods.*;
public class Q25 {  
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.println("Enter the index number: ");
        int index = sc.nextInt();

        System.out.println("Enter the array which you want to insert: ");
        int[] secArray = readArray();        

        printArray(insertArrayAtIndex(array, secArray, index));
    }
}