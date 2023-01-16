import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int n = sc.nextInt();
        sc.close();

        int ld = n%10;
        int fd = n/10;

        if((fd*ld) + (fd+ld) == n) {
            System.out.println(n + " is a special number"); 
        }
        else {
            System.out.println(n + " is not a special number");
        }
    }
}