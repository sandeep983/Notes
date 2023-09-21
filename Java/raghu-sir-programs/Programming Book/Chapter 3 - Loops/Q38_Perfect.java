import java.util.Scanner;

public class Q38_Perfect {
    private static boolean isPerfect(int n) {
        int sum=0;

        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isPerfect(n)) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }
    }
}
