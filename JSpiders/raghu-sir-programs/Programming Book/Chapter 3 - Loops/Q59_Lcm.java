import java.util.Scanner;

public class Q59_Lcm {
    private static int lcm(int a, int b) {
        int temp;

        if(a>b) {
            temp = a;
        }
        else {
            temp = b;
        }

        while(temp <= a*b) {
            if(temp%a == 0 && temp%b == 0) {
                break;   
            }
            temp++;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nLCM is: "+lcm(a, b));
    }
}
