//Q18. WAJP to print a matrix in counter clock-wise spiral form.

public class Q18 extends ArrayMethods {
    private static void counterClockSpiralPrint(int mat[][]) {
        // sRow - starting row, sCol - starting column
        int sRow=0, sCol=0;

        // eRow - ending row, eCol - ending column
        int eRow = mat.length;
        int eCol = mat[0].length;

        // i - iterator, count - for counting
        int i, count=0;

        // total number of elements in matrix
        int total = eRow * eCol;

        System.out.println("\nPrinting in Counter Clock-Wise Spiral Pattern:");
        while (sRow < eRow && sCol < eCol) {
            if (count == total) {
                break;
            }
            // print the first column from the remaining columns
            for (i = sRow; i < eRow; ++i) {
                System.out.print(mat[i][sCol] + " ");
                count++;
            }
            sCol++;


            if (count == total) {
                break;
            }
            // print the last row from the remaining rows
            for (i = sCol; i < eCol; ++i) {
                System.out.print(mat[eRow - 1][i] + " ");
                count++;
            }
            eRow--;


            if (count == total) {
                break;
            }
            // print the last column from the remaining columns
            if (sRow < eRow) {
                for (i = eRow - 1; i >= sRow; --i) {
                    System.out.print(mat[i][eCol - 1] + " ");
                    count++;
                }
                eCol--;
            }


            if (count == total) {
                break;
            }
            // print the first row from the remaining rows
            if (sCol < eCol) {
                for (i = eCol - 1; i >= sCol; --i) {
                    System.out.print(mat[sRow][i] + " ");
                    count++;
                }
                sRow++;
            }
        }
    }

    public static void main(String[] args) {
        counterClockSpiralPrint(readMatrix());
    }
}