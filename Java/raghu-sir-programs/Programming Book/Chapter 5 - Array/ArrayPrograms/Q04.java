//Q4. Write a java program to define a method to return biggest element from the array.

import static ArrayMethods.ArrayMethods.*;
public class Q04 {
    public static void main(String[] args) {
        int biggest = getBiggest(readArray());
        System.out.println("The biggest element is: "+ biggest);
    }
}
