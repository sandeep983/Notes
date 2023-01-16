//Q10. WAJP to determine whether a user entered matrix is Identity Matrix or not.

public class Q10 extends ArrayMethods { 
    private static boolean identityMatrixCheck() {
        System.out.print("Enter the order of matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        if(rows != columns) {
            System.out.println("Error: Count of Rows and Columns should be same for identity matrix.");
            return false;
        }
        else {
            System.out.println("Enter the elements of matrix: ");
            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
 
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                int n = matrix[i][j];
                if((i==j && n!=1) || (i!=j && n!=0)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        if(identityMatrixCheck()) {
            System.out.println("User entered matrix is Identity Matrix.");
        }
        else {
            System.out.println("User entered matrix is Not-Identity Matrix.");
        }
    }
}