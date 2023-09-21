//Q8. WAJP to calculate the Sum of the Matrix element and print it.

public class Q08 extends ArrayMethods{
    private static int sumOfMatrixElements(int[][] matrix) {
        int sum=0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of matrix elements is: " + sumOfMatrixElements(readMatrix()));
    }
}
