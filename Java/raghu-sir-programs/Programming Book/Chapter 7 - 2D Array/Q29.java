//Q29. WAJP to find Palindrome numbers in Matrix.

public class Q29 extends ArrayMethods {
    private static boolean isPalindrome(int n) {
        int rev = 0, temp=n;

        do {
            int ld = n%10;
            rev = rev*10 + ld;
            n /= 10;
        } while(n!=0);
         
        return rev == temp;
    }

    private static void printPalindrome(int[][] matrix) {
        System.out.println("Palindrome numbers in the matrix are: ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(isPalindrome(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printPalindrome(readMatrix());
    }
}