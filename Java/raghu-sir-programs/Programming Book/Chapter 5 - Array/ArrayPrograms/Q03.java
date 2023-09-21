//Q3. Write a java program to define a method to return smallest element from the array.

import static ArrayMethods.ArrayMethods.*;
public class Q03 {
    public static void main(String[] args) {
        int smallest = getSmallest(readArray());
        System.out.println("The smallest element is: "+ smallest);
    }
}
