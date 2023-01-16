/*
Q8. Print this Pattern
0 0 0 0 0 
1 1 1 1 
0 0 0
1 1
0                   */

public class Q8 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print((i+1)%2 + " ");
            }
            System.out.println();
        }
    }
}
