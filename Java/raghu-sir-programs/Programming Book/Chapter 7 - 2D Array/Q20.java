//Q20. WAJP to calculate Sum of Middle Row and Column in matrix.

public class Q20 extends ArrayMethods {
    private static void sumMidRowColumn(int[][] matrix) {
        int sumRow=0, sumCol=0; 
        int mid = (matrix.length/2);

        for(int i=0; i<matrix.length; i++) {
            sumRow += matrix[mid][i];
            sumCol += matrix[i][mid];
        }

        System.out.println("Sum of middle row: " + sumRow);
        System.out.println("Sum of middle column: " + sumCol);
    }

    public static void main(String[] args) {
        sumMidRowColumn(readMatrix());
    }
}