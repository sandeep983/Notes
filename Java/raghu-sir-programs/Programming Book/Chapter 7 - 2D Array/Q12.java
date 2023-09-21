//Q12. WAJP to find Transpose of user entered Matrix.

public class Q12 extends ArrayMethods { 
    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix[0].length];

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = matrix[j][i]; 
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] matrix = readMatrix();

        System.out.println("Transpose of the matrix is: ");
        printMatrix(transposeMatrix(matrix));
    }
}