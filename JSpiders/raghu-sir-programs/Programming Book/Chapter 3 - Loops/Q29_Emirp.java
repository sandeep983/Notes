import java.util.Scanner;

public class Q29_Emirp {
    private static int reverse(int n) {
        int rev=0;
        
        while(n!=0) {
            int ld = n%10;
            rev = rev*10 + ld;
            n /= 10;
        }

        return rev;
    }

    private static boolean isPrime(int n){
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEmirp(int n) {
        if(isPrime(n) && isPrime(reverse(n))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isEmirp(n)) {
            System.out.println(n + " is Emirp");
        }
        else {
            System.out.println(n + " is not Emirp");
        }
    }
}
