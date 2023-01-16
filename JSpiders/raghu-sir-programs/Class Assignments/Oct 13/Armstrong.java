import java.util.Scanner;

public class Armstrong {
    private static int digitCount(int n) {
        int count=0;
        do {
            n /= 10;
            count++;
        } while(n != 0);

        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;
        while(p>0) {
            pw *= n;
            p--;
        }
        return pw;
    }

    private static boolean isArmstrong(int n) {
        int sum=0, temp=n;
        int dc = digitCount(n);

        while(n != 0) {
            int ld = n%10;
            sum = sum + pow(ld, dc);
            n /= 10;
        }
        return temp==sum;
    }

    private static void printArmstrong(int n) {
        for(int i=1; i<=n; i++)
            if(isArmstrong(i))
                System.out.print(i+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        printArmstrong(n);    
    }
}
