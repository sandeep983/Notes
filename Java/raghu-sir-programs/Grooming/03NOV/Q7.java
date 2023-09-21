/*
Q7. Print this Pattern
1
3 5
5 7 9
7 9 11 13
9 11 13 15 17                */

public class Q7 {
    public static void main(String[] args) {
        int s=1;
        for(int i=1; i<=5; i++) {
            int x=s;
            for(int j=1; j<=i; j++) {
                System.out.print(x+" ");
                x=x+2;
            }
            s=s+2;
            System.out.println();
        }
    }
}
