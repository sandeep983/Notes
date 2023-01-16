//Q16. WAJP to find Unique Elements Common to all Rows in Matrix.

public class Q16 extends ArrayMethods {
    private static void printDistinctElementsCommonToRows(int[][] matrix) {
        int[] firstRow = new int[matrix[0].length];
        int maxValue=0;

        //for storing first row in array and getting maximum value from row one
        for(int i=0; i<firstRow.length; i++) {
            firstRow[i] = matrix[0][i];

            if(maxValue < matrix[0][i]) {
                maxValue = matrix[0][i];
            }
        }

        int[] arr = new int[maxValue+1];
        //Iterating to store the count of elements
        for(int k=0; k<firstRow.length; k++) {
            for(int i=1; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) { 
                    if(firstRow[k] == matrix[i][j]) {
                        arr[matrix[i][j]]++;
                        break;
                    }
                }
            }
        }
        
        System.out.print("Distinct Elements common to all rows are: ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==matrix.length-1) {
                System.out.print(i + " ");
            }
        }        
    }

    public static void main(String[] args) {
        printDistinctElementsCommonToRows(readMatrix());
    }
}