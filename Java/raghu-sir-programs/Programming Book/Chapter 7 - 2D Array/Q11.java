//Q11. WAJP to find the Sum of each Row and Each Column.

public class Q11 extends ArrayMethods { 
    private static void printSumOfEachRowCol(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            int sumOfRow=0, sumOfCol=0;

            for(int j=0; j<matrix[i].length; j++) {
                sumOfRow = sumOfRow + matrix[i][j];
                sumOfCol = sumOfCol + matrix[j][i];
            }

            System.out.println("Sum of row "+(i+1)+": "+sumOfRow);
            System.out.println("Sum of column "+(i+1)+": "+sumOfCol);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printSumOfEachRowCol(readMatrix());
    }
}
