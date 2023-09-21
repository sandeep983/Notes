import java.util.Scanner;

public class Q60_NcrNpr {
    private static int fact(int n) {
        int fact = 1;

        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        
        return fact;
    }

    private static int ncr(int n, int r) {
        return fact(n) / (fact(n-r) * fact(r));
    }

    private static int npr(int n, int r) {
        return fact(n)/fact(n-r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N and R: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        System.out.println("NCR: "+ncr(n, r));
        System.out.println("NPR: "+npr(n, r));
    }
}
