import java.util.Scanner;

public class Q31_Binary {
    private static String binary(int n) {
        String bin="";

        while(n!=0) {
            int b = n%2;
            bin = b + bin;
            n/=2;
        }

        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(binary(n));
    }
}