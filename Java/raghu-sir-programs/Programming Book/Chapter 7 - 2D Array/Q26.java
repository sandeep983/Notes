//Q26. WAJP to check whether Matrix is Idempotent or not.

public class Q26 extends ArrayMethods {
    private static int[][] multiplyTwoMatrices(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[mat1.length][mat2[0].length];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                for (int k=0; k<matrix[i].length; k++) {
                    matrix[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return matrix;
    }

    private static boolean isMatricesEqual(int[][] mat1, int[][] mat2) {
        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat1[i].length; j++) {
                if(mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void isIdempotent(int[][] mat) {
        int[][] matrix = multiplyTwoMatrices(mat, mat);

        if(isMatricesEqual(mat, matrix)) {
            System.out.println("Matrix is Idempotent.");
        } 
        else {
            System.out.println("Matrix is not Idempotent.");
        }
    }

    public static void main(String[] args) {
        isIdempotent(readMatrix());
    }  
}