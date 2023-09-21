//Q4. WAJP to perform Arithmetic Division Operation on Matrix and store the Remainder(or 0) into new matrix and display it.

public class Q04 extends ArrayMethods{
    private static int[][] divideElementsByUserValue(int[][] mat, int divisor) {
        int[][] matrix = new int[mat.length][mat[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = mat[i][j] % divisor;
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        int[][] mat = readMatrix();

        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        System.out.println("After the division of elements by " + divisor);
        printMatrix(divideElementsByUserValue(mat, divisor));
    }
}
