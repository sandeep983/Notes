import java.util.Scanner;

public class Q43_Disarium {
    private static int digitCount(int n) {
        int count = 0;

        do {
            n /= 10;
            count++;
        } while(n != 0);

        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;

        for(int i=1; i<=p; i++) {
            pw *= n;
        }

        return pw;
    }

    private static boolean isDisarium(int n) {
        int sum=0, temp=n;
        int dc=digitCount(n);

        do {
            int r = n%10;
            sum = sum + pow(r, dc);
            n /= 10;
            dc--;
        } while(n!=0);

        return temp == sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isDisarium(n)) {
            System.out.println("Disarium number");
        }
        else {
            System.out.println("Not a Disarium number");
        }
    }
}
