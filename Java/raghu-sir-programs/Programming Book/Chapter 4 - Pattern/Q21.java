/*
Print the following pattern
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1                   */
 
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        int x=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(x%2+" ");
                x++;
            }
            
            System.out.println();
        }
    }
}
