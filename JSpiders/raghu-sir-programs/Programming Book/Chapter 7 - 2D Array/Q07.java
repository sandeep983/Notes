//Q7. WAJP to Multiply Two Matrices.

public class Q07 extends ArrayMethods{ 
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

    public static void main(String[] args) {
        System.out.println("For first matrix: ");
        int[][] mat1 = readMatrix();
        System.out.println("For second matrix: ");
        int[][] mat2 = readMatrix();
        
        System.out.println("Multiplication of two matrices: ");
        printMatrix(multiplyTwoMatrices(mat1, mat2));
    }
}
