import java.util.Scanner;

public class Q23_Factorial {
    private static int fact(int n) {
        int fact = 1;
        
        for(int i=2; i<=n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(fact(num));
    }
}
