//Q21. WAJP to Traverse the Matrix in Zig-Zag Pattern.

public class Q21 extends ArrayMethods {
    private static void traverseInZigZag(int[][] matrix) {
        int x, y;

        for (int i=0; i<matrix[0].length+matrix.length-1; i++) {
            if (i%2 == 0) { 
                // up right
                if(i < matrix.length) {
                    x = i;
                    y = 0;
                }
                else {
                    x = matrix.length-1;
                    y = i-matrix.length+1;
                }
                while (x>=0 && y<matrix[0].length) {
                    System.out.print(matrix[x--][y++] + " ");
                }  
            } 
            else {
                // down left
                if(i < matrix[0].length) {
                    x = 0;
                    y = i;
                }
                else {
                    x = i-matrix[0].length+1;
                    y = matrix[0].length-1;
                }
                while (x<matrix.length && y>=0) {
                    System.out.print(matrix[x++][y--] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        traverseInZigZag(readMatrix());
    }
}