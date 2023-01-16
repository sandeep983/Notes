import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integer number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a==b || a==c || b==c) {
            System.out.println("Please enter distinct values");
        }
        else if(b>a && a>c || c>a && a>b) {
            System.out.println(a);
        }
        else if(a>b && b>c || c>b && b>a) {
            System.out.println(b);
        }
        else if(a>c && c>b || b>c && c>a) {
            System.out.println(c);
        }
    }
}