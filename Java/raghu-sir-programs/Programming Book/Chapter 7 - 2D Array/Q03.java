//Q3. WAJP to Add the Elements of Two Matrix.

public class Q03 extends ArrayMethods{
    private static int[][] sumTwoMatrices(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[mat1.length][mat1[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("For first matrix: ");
        int[][] mat1 = readMatrix();

        System.out.println("For second matrix: ");
        int[][] mat2 = readMatrix();

        System.out.println("After the addition of two matrices: ");
        printMatrix(sumTwoMatrices(mat1, mat2));
    }
}
