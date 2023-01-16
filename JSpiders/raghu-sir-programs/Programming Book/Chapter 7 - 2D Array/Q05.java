//Q5. WAJP to create a Matrix with Unique Elements only.

public class Q05 extends ArrayMethods {
    private static boolean isPresent(int[][] matrix, int element) {
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++) {
                if(matrix[i][j] == element){
                    return true;
                }
            }
        }
        return false;
    }

    private static int[][] readUniqueElements() {
        System.out.println("Enter the order of the matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix one-by-one: ");

        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++) {
                if(i==0 && j==0){
                    matrix[i][j] = sc.nextInt();
                }
                else{
                    int element = sc.nextInt();
                    if(!isPresent(matrix, element)){
                        matrix[i][j] = element;
                    }
                    else{
                        System.out.println("Error: Element already present in the matrix.\nEnter a new element: ");
                        j--;
                    }
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        printMatrix(readUniqueElements());
    }
}
