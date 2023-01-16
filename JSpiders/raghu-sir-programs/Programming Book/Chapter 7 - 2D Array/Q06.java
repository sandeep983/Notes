//Q6. WAJP to Display the Frequency of Even and Odd numbers from matrix.

public class Q06 extends ArrayMethods{
    private static void countOfEvenOdd(int[][] matrix) {
        int evenCount=0, oddCount=0;
        
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] % 2 == 0) {
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
    
    public static void main(String[] args) {
        countOfEvenOdd(readMatrix());
    }
}
