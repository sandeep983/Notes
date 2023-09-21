//Q30. WAJP to find Frequency of Each Elements in Matrix.

public class Q30 extends ArrayMethods {
    private static void frequencyOfEachElements(int[][] matrix) {
        int maxValue=0;

        //Finding the maximum value in the matrix
        for(int i=0; i<matrix.length; i++) {  
            for(int j=0; j<matrix[i].length; j++) {
                if(maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }         
            }
        } 

        //Creating an array of size maxValue+1
        int arr[] = new int[maxValue + 1]; 

        for(int i=0; i<matrix.length; i++) { 
            for(int j=0; j<matrix[i].length; j++) {
                arr[matrix[i][j]]++; 
            }
        }
    
        //Printing the frequency elements
        for(int i=1; i<=maxValue; i++) {
            if(arr[i] > 0) {
                System.out.println(i + " --> " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        frequencyOfEachElements(readMatrix());
    }
}