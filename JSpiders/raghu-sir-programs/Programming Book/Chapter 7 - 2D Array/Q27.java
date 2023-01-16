//Q27. WAJP to check the user entered matrix is Toeplitz Matrix or not.

public class Q27 extends ArrayMethods {
    private static void isToeplitz(int[][] matrix) {
        int flag = 0;
        for (int i=0; i<matrix.length-1; i++) {
            for (int j=0; j<matrix[0].length-1; j++) {
                if (matrix[i][j] != matrix[i+1][j+1]) {
                    System.out.println("Not a Toeplitz Matrix.");
                    flag = 1;
                }
            }
        }
        if(flag == 0) {
            System.out.println("Toeplitz Matrix.");
        }
    }

    public static void main(String[] args) {
        isToeplitz(readMatrix());
    }
}