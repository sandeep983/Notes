//Q22. WAJP to check given Matrix is Magic Matrix or not.

public class Q22 extends ArrayMethods {
    private static void isMagicMatrix(int[][] mat) {
        int flag=0, sumOfD1=0, sumOfD2=0;

        //calculating the sum of row one
        int sumR1=0;
        for(int i=0; i<mat[0].length; i++) {
            sumR1 += mat[0][i];
        }

        //traversing through matrix
        for(int i=0; i<mat.length; i++) {
            int sumOfRow=0, sumOfCol=0;
            for(int j=0; j<mat[i].length; j++) {
                sumOfRow += mat[i][j];
                sumOfCol += mat[j][i];
            }            
            
            //sum of diagonals
            int k=mat.length-1;
            sumOfD1 += mat[i][i];
            sumOfD2 += mat[i][k--];

            //checking if the sum of row and col equals to sum of row one 
            if(sumOfRow != sumR1) {
                flag=1;
                break;
            }
            else if(sumOfCol != sumR1) {
                flag=1;
                break;
            }
        }
        
        if(flag==0 && sumOfD1==sumR1 && sumOfD2 == sumR1) {
            System.out.println("Given matrix is Magic matrix.");
        }
        else {
            System.out.println("Given matrix is Not-Magic matrix.");
        }
    }

    public static void main(String[] args) {
        isMagicMatrix(readMatrix());
    }
}