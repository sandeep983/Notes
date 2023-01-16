/*
Q3. Print this Pattern
        A
      C C C 
    E E E E E 
  G G G G G G G 
I I I I I I I I I                 */

public class Q3 {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++) {
      for(int j=1; j<=5-i; j++) {
        System.out.print("  ");
      }

      for(int j=1; j<=i*2-1; j++) {
        System.out.print((char)(2*i+63)+" ");  
      }
      
      System.out.println();
    }
  }
}
