import java.util.Scanner;

public class Q30_Strong {
    private static int fact(int n) {
        int fact = 1;

        for(int i=1; i<=n; i++) {
            fact *= i;
        }

        return fact;
    }

    private static boolean isStrong(int n) {
        int sum=0, temp=n;

        do {
            int r = n%10;
            sum = sum + fact(r);
            n /= 10;
        } while(n!=0);

        return temp==sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isStrong(n)) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not strong number");
        }
    }
}
