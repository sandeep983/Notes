//Q39. Write a java program to find second largest and smallest element in array.

import static ArrayMethods.ArrayMethods.*;
public class Q39 {
    public static void main(String[] args) {
        int [] array = sortArray(readArray());

        int sLargest = array[1];
        System.out.println("The second largest element of array is: " + sLargest);

        int sSmallest = array[array.length-2];
        System.out.println("The second smallest element of array is: " + sSmallest);
    }
}