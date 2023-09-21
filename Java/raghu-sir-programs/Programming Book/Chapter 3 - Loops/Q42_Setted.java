import java.util.Scanner;

public class Q42_Setted {
    private static String binary(int n) {
        String bin="";

        while(n!=0) {
            int b = n%2;
            bin = b + bin;
            n/=2;
        }

        return bin;
    }

    private static int settedDigits(int n) {
        String bin = binary(n);
        int count = 0;

        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i)=='1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(settedDigits(n));
    }
}
