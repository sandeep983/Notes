//Q17. WAJP to find Unique Elements in Matrix.

public class Q17 extends ArrayMethods {
    private static void printUniqueElements(int[][] matrix) {
        int maxValue=0, flag=0; 

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
    
        //Printing the unique elements
        for(int i=1; i<=maxValue; i++) {
            if(arr[i] == 1) {
                System.out.print(i + " "); 
                flag = 1;
            }
        }
                
        if(flag == 0) { 
            System.out.println("No unique element in the matrix."); 
        } 
    }

    public static void main(String[] args) {
        printUniqueElements(readMatrix());
    }
}