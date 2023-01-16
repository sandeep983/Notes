//Q13. WAJP to find whether a given Matrix is Sparse Matrix or not.

public class Q13 extends ArrayMethods { 
    private static void isSparse(int[][] matrix) {
        int zeroCount=0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroCount++;
                } 
            }
        }

        if(zeroCount > ((matrix.length*matrix[0].length)/2)) {
            System.out.println("User entered matrix is Sparse Matrix.");
        }
        else {
            System.out.println("User entered matrix is Not-Sparse Matrix.");
        }
    }

    public static void main(String[] args) {
        isSparse(readMatrix());
    }
}