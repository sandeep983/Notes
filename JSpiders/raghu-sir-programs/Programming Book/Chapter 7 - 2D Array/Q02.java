//Q2. WAJP to find Biggest Element in the Matrix.

public class Q02 extends ArrayMethods{
    private static int getBiggestElement(int[][] matrix) {
        int biggest = matrix[0][0];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] > biggest) {
                    biggest = matrix[i][j];
                }
            }
        }
        return biggest;
    }
    
    public static void main(String[] args) {
        System.out.println("Biggest element is: " + getBiggestElement(readMatrix()));
    }
}
