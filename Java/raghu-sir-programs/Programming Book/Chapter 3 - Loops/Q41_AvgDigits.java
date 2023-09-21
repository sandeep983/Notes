import java.util.Scanner;

public class Q41_AvgDigits {
    private static int digitCount(int n) {
        int count=0;

        do {
            count++;
            n /= 10;
        } while(n!=0);

        return count;
    }

    private static int digitAvg(int n) {
        int dSum = 0, dc = digitCount(n);

        while(n!=0) {
            int ld = n%10;
            dSum += ld;
            n /= 10;
        }

        return dSum/dc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(digitAvg(n));
    }
}
