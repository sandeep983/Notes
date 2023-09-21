import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if(n1 > n2) {
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}