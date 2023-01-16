import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integer values: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        int big=n1;
        if(n2 > big) {
            big = n2;
        }
        else if(n3 > big) {
            big = n3;
        }

        System.out.println(big);
    }
}