//Q9. WAJP to print the Prime Numbers present in the Matrix.

public class Q09 extends ArrayMethods{ 
    private static void printPrimeInMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                int n = matrix[i][j];
                int flag=0;  

                if(n!=0 && n!=1){  
                    for(int k=2; k<=n/2; k++) {      
                        if(n%k == 0) {                            
                            flag=1;      
                            break; 
                        }     
                    } 

                    if(flag==0) {
                        System.out.print(n + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers present in the matrix: ");
        printPrimeInMatrix(readMatrix());
    }
}
