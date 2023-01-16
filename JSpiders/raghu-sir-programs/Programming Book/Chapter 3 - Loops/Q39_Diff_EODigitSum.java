import java.util.Scanner;

public class Q39_Diff_EODigitSum {
    private static int evenDigitSum(int n) {
        int eSum = 0;

        while(n != 0) {
            int ld = n%10;

            if(ld%2 == 0) {
                eSum += ld;
            }

            n /= 10;
        }

        return eSum;
    }

    private static int oddDigitSum(int n) {
        int oSum = 0;

        while(n != 0) {
            int ld = n%10;

            if(ld%2 != 0) {
                oSum += ld;
            }

            n /= 10;
        }

        return oSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(oddDigitSum(n) - evenDigitSum(n));
    }
}
