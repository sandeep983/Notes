import java.util.Scanner;

public class Q28_Automorphic {
    private static int digitCount(int n) {
        int count=0;

        do {
            n /= 10;
            count++;
        } while(n!=0);

        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;

        for(int i=1; i<=p; i++) {
            pw *= n;
        }

        return pw;
    }

    private static boolean isAutomorphic(int n) {
        int dc = digitCount(n);
        int numSq = n*n;
        int lastDigits = numSq % pow(10, dc);

        return lastDigits == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isAutomorphic(n)) {
            System.out.println(n + " is Automorphic");
        }
        else {
            System.out.println(n + " is not Automorphic");
        }
    }
}
