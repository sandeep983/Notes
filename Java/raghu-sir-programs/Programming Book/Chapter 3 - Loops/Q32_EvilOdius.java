import java.util.Scanner;

public class Q32_EvilOdius {
    private static String binary(int n) {
        String bin="";

        while(n!=0) {
            int b = n%2;
            bin = b + bin;
            n/=2;
        }

        return bin;
    }

    private static boolean evilOrOdius(int n) {
        String bin = binary(n);
        int count = 0;

        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i) == '1') {
                count++;
            }
        }

        if(count%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (evilOrOdius(n)) {
            System.out.println("Evil Number");
        }
        else {
            System.out.println("Odius Number");
        }
    }
}
