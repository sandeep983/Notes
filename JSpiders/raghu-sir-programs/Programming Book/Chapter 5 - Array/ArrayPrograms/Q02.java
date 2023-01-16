//Q2. Write a java program to read n integers and print sum of all those elements.

import static ArrayMethods.ArrayMethods.*;
public class Q02 {
    public static void main(String[] args) {
        int sum = getSum(readArray());     
        System.out.println("The sum of all the elements is: " + sum);
    }
}
