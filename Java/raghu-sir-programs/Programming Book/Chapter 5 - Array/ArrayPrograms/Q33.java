//Q33. Write a java program array in decreasing order.

import static ArrayMethods.ArrayMethods.*;
public class Q33 {
    public static void main(String[] args) {
        int [] array = readArray();
        printArray(sortArray(array));
    }
}