import java.util.Scanner;

public class Happy {
    private static boolean isHappy(int n) {
        while(n>9) {
            int sum=0;
            while(n!=0) {
                int ld = n%10;
                sum = sum + ld*ld;
                n /= 10;
            }
            n=sum;
        }
        return n==1 || n==7;
    }

    private static void printHappy(int n) {
        for(int i=1; i<=n; i++)
            if(isHappy(i))
                System.out.print(i+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        printHappy(n); 
    }
}
