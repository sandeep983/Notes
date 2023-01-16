//Q32. Write a java program array in increasing order.

import static ArrayMethods.ArrayMethods.*;
public class Q32 {
    public static void main(String[] args) {
        int [] array = readArray();
        printArray(reverseArray(sortArray(array)));
    }
}