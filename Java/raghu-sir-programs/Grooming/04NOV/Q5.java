/*
Q5. Print this Pattern
        1
      2 1
    3 2 1 
  4 3 2 1
5 4 3 2 1             */

public class Q5 {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++) {
      for(int j=1; j<=5-i; j++) {
        System.out.print("  ");
      }

      for(int j=i; j>=1; j--) {
        System.out.print(j+" ");
      }

      System.out.println();
    }
  }
}
