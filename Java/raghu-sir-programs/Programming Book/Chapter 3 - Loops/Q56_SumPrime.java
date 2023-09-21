import java.util.Scanner;

public class Q56_SumPrime {
    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumOfPrime(int s, int e) {
        int sum=0;

        for(int i=s; i<=e; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ranges: ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        sc.close();

        System.out.println(sumOfPrime(s, e));
    } 
}
