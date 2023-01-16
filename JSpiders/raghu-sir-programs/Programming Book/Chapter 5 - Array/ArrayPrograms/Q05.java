//Q5. Write a java program to define a method to return average of integer array.

import static ArrayMethods.ArrayMethods.*;
public class Q05 {
    public static void main(String[] args) {
        double avg = getAverage(readArray());
        System.out.println("The average of all the element is: "+ avg);
    }
}
