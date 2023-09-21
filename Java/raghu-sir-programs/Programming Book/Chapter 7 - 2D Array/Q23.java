//Q23. WAJP to Interchange Diagonal of Matrix.

public class Q23 extends ArrayMethods {
    private static int[][] interchangeDiagonal(int[][] matrix) {
        int j=matrix.length-1;
        for(int i=0; i<matrix.length; i++) {
            int temp=0;

            temp = matrix[i][i];
            matrix[i][i] = matrix[i][j];
            matrix[i][j--] = temp;
        }
        return matrix;
    }

    public static void main(String[] args) {
        printMatrix(interchangeDiagonal(readMatrix()));
    }
}