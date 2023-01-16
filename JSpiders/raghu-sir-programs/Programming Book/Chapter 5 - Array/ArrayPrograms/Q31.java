//Q31. Write a java program to search the element from the array if present return index else return -1.

import static ArrayMethods.ArrayMethods.*;
public class Q31 {
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.println("Enter the element which you want to search: ");
        int element = sc.nextInt();

        System.out.println(searchInArray(array, element));
    }
}