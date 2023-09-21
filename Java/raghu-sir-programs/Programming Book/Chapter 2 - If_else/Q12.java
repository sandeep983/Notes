import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int n = sc.nextInt();
        sc.close();

        if (n%2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}