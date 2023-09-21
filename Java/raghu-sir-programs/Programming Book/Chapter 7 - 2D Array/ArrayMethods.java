import java.util.Scanner;

public class ArrayMethods {
    public static final Scanner sc = new Scanner(System.in);

    //To read and return the 2D Array or Matrix
    public static int[][] readMatrix() {
        System.out.print("Enter the order of matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        
        System.out.println("\nEnter the elements of matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    
    //To print the 2D Array or Matrix
    public static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
    




