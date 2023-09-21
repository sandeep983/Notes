//Q24. WAJP to Rotate the elements of Matrix.

public class Q24 extends ArrayMethods {
    private static int[][] rotateMatrix(int mat[][]) {
        // sRow - starting row, sCol - starting column
        int sRow = 0, sCol = 0;

        // eRow - ending row, eCol - ending column
        int eRow = mat.length;
        int eCol = mat[0].length;
        
        //temp variables
        int prev, curr;

        while (sRow < eRow && sCol < eCol) {
            if (sRow+1 == eRow || sCol+1 == eCol) {
                break;
            }

            // store the first element of next row
            // we will use this element to replace first element of current row
            prev = mat[sRow+1][sCol];

            // move elements of first row from the remaining rows
            for (int i = sCol; i < eCol; i++) {
                curr = mat[sRow][i];
                mat[sRow][i] = prev;
                prev = curr;
            }
            sRow++;


            // move elements of last column from the remaining columns
            for (int i = sRow; i < eRow; i++) {
                curr = mat[i][eCol - 1];
                mat[i][eCol - 1] = prev;
                prev = curr;
            }
            eCol--;

            // move elements of last row from the remaining rows
            if (sRow < eRow) {
                for (int i = eCol - 1; i >= sCol; i--) {
                    curr = mat[eRow - 1][i];
                    mat[eRow - 1][i] = prev;
                    prev = curr;
                }
            }
            eRow--;


            // move elements of first column from the remaining rows
            if (sCol < eCol) {
                for (int i = eRow - 1; i >= sRow; i--) {
                    curr = mat[i][sCol];
                    mat[i][sCol] = prev;
                    prev = curr;
                }
            }
            sCol++;
        }
        return mat;
    }

    public static void main(String[] args) {
        printMatrix(rotateMatrix(readMatrix()));
    }
}