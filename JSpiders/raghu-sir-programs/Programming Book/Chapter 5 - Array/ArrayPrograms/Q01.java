//Q1. Initialize 5 students percentage and display the highest percentage.

import static ArrayMethods.ArrayMethods.*;
public class Q01 {
    public static void main(String[] args) {
        int big = getBiggest(readArray());
        System.out.println("The highest percentage is: " + big + "%");
    }
}
