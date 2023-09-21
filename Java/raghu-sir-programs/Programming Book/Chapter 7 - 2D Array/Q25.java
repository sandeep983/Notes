//Q25. WAJP to find the Row with Maximum Number of 1's.

public class Q25 extends ArrayMethods {
    private static int rowWithMaxOnes(int[][] matrix) {
        int[] rCount = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == 1) {
                    rCount[i]++;
                }
            }
        }
    
        int indexOfLargest = 0;
        for (int i=1; i<rCount.length; i++) {
            if(rCount[i] > rCount[indexOfLargest]) {
                indexOfLargest = i;
            } 
        }

        return indexOfLargest+1;
    }

    public static void main(String[] args) {
        System.out.println("Maximum 1's are in the Row: " + rowWithMaxOnes(readMatrix()));
    }
}