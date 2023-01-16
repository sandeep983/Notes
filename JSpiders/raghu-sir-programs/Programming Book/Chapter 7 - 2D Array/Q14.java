//Q14. WAJP to count the Armstrong Numbers in the Matrix.

public class Q14 extends ArrayMethods { 
    private static int digitCount(int n) {
        int count = 0;
        do {
            n /= 10;
            count++;
        } while(n != 0);

        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;
        while(p>0) {
            pw *= n;
            p--;
        }
        return pw;
    }

    private static boolean isArmstrong(int n) {
        int sum=0, temp = n;
        int dc = digitCount(n);

        do {
            int r = n % 10;
            sum += pow(r, dc);
            n /= 10;
        }while(n!=0);

        return temp == sum;     
    }

    private static int countOfArmstrong(int[][] matrix) {
        int count=0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(isArmstrong(matrix[i][j])) {
                    count++;
                } 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count of Armstrong numbers in Matrix is: "+countOfArmstrong(readMatrix()));
    }
}