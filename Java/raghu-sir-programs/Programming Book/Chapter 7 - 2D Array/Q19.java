//Q19. WAJP to Sort the Matrix in Ascending order and Descending order.

public class Q19 extends ArrayMethods {
    private static int row, col;

    //To read the matrix from the user
    private static int[][] readMat() {
        System.out.print("Enter the order of matrix: ");
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] matrix = new int[row][col];
        
        System.out.println("\nEnter the elements of matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    

    //To convert the matrix into array
    private static int[] convertMatrixToArray(int[][] mat) {
        int[] arr = new int[row*col];

        int k=0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                arr[k++] = mat[i][j];
            }
        }
        return arr;
    }

    //To convert the array into matrix
    private static int[][] convertArrayToMatrix(int[] arr) {
        int[][] mat = new int[row][col];

        int k=0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = arr[k++];
            }
        }
        return mat;
    }


    private static int[][] ascendingOrder(int[][] matrix) {  
        int[] arr = convertMatrixToArray(matrix);

        //Sorting using Bubble Sort algorithm - Minimun Value First
        for(int k=0; k<arr.length-1; k++){
            for(int i=0; i<arr.length-1-k; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return convertArrayToMatrix(arr);
    }

    private static int[][] descendingOrder(int[][] matrix) {  
        int[] arr = convertMatrixToArray(matrix);

        //Sorting using Bubble Sort algorithm - Maximum Value First
        for(int k=0; k<arr.length-1; k++){
            for(int i=0; i<arr.length-1-k; i++){
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return convertArrayToMatrix(arr);
    }


    public static void main(String[] args) {
        int[][] mat = readMat();

        System.out.println("\nAscending Order: ");
        printMatrix(ascendingOrder(mat));

        System.out.println("\nDescending Order: ");
        printMatrix(descendingOrder(mat));  
    }
}