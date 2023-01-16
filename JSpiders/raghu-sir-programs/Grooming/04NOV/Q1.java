/*
Q1. Print this Pattern
5 4 3 2 1
* 4 3 2 1 
* * 3 2 1 
* * * 2 1
* * * * 1              */

public class Q1 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            for(int j=5; j>=1; j--) {
                if(j<=i) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
