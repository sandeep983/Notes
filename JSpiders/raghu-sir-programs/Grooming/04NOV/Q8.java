/*
Q8. Print this Pattern
E
D D 
C C C 
B B B B 
A A A A A            */

public class Q8 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){ 
            for(int j=5; j>=i; j--) {
                System.out.print((char)(i+64)+" ");
            }

            System.out.println();
        }    
    }
}
