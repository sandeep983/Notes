//Q15. WAJP to check whether Two Matrices are Equal or Not.

public class Q15 extends ArrayMethods {
    private static boolean isMatricesEqual(int[][] mat1, int[][] mat2) {
        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat1[i].length; j++) {
                if(mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        } 
        return true;
    }

    public static void main(String[] args) {
        System.out.println("For the first matrix: ");
        int[][] mat1 = readMatrix();

        System.out.println("For the second matrix: ");
        int[][] mat2 = readMatrix();

        if(isMatricesEqual(mat1, mat2)) {
            System.out.println("Both the matrices are Equal.");
        }
        else {
            System.out.println("Both the matrices are Not-Equal");
        }
    }
}