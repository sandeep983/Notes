//Q28. WAJP to find maximum value of M[c][d]-M[a][b] over all choices of indexes.

public class Q28 extends ArrayMethods {
    private static int findMax(int[][] mat) {
        int n = mat.length;

        // tempMat [i][j] stores a maximum of elements in the matrix
        // from (i, j) to (n-1, n-1)
        int[][] tempMat = new int[n][n];

        // last element of tempMat[][] will be the same as that of the specified matrix
        tempMat[n-1][n-1] = mat[n-1][n-1];

        // Initialize max
        int max = mat[n-1][n-1];

        // preprocess the last row
        for (int j = n - 2; j >= 0; j--) {
            if (mat[n-1][j] > max) {
                max = mat[n-1][j];
            }
            tempMat[n-1][j] = max;
        }

        // Initialize max
        max = mat[n-1][n-1];

        // preprocess the last column
        for (int i = n - 2; i >= 0; i--) {
            if (mat[i][n-1] > max) {
                max = mat[i][n-1];
            }
            tempMat[i][n-1] = max;
        }

        // Initialize max
        max = Integer.MIN_VALUE;

        // preprocess the rest of the matrix from the bottom
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                // update the max value
                if (tempMat[i + 1][j + 1] - mat[i][j] > max) {
                    max = tempMat[i + 1][j + 1] - mat[i][j];
                }

                // assign tempMat[i][j]
                tempMat[i][j] = Math.max(mat[i][j], Math.max(tempMat[i][j+1], tempMat[i+1][j]));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(readMatrix()));
    }
}