import java.util.Scanner;

public class Q34_Xylem{
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

        for(int i=1; i<=p; i++) {
            pw *= n;
        }
        
        return pw;
    }

    private static boolean isXylem(int n) {
        int dc = digitCount(n);

        int ld = n%10;
        int fd = n / pow(10, dc-1);
        int sumFdLd = fd+ld;

        //removing first and last digit
        int midNum = n % pow(10, dc-1);
        midNum = midNum/10;

        int sumMid=0;
        while(midNum != 0) {
            int r = midNum%10;
            midNum /= 10;
            sumMid += r; 
        }

        return sumMid == sumFdLd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isXylem(n)) {
            System.out.println("Xylem");
        }
        else {
            System.out.println("Phloem");
        }
    }
}
