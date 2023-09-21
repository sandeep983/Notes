import java.util.Scanner;

public class Q36_Gcd {
    private static int gcd(int a, int b) {
        int temp;

        if(a<b) {
            temp = a;
        }
        else {
            temp = b;
        }

        for(; temp>0; temp--) {
            if(a%temp == 0 && b%temp == 0) {
                break;
            }
        }

        return temp;
    }
       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nGCD is: " + gcd(a, b));
    }
}
