/*
Q5. Print this Pattern
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10                    */

public class Q5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=2; j<=i*2; j=j+2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
