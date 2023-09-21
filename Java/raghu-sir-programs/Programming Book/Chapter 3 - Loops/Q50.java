import java.util.Scanner;

public class Q50 {
    private static Scanner sc = new Scanner(System.in);
    private static int b, h;

    static {
        System.out.print("Enter base: ");
        b = sc.nextInt();
        System.out.print("Enter height: ");
        h = sc.nextInt();

        if (b<=0 || h<=0) {
            System.out.println("Error");
        }
        else {
            System.out.println("Area: " + (b * h));
        }
    }

    public static void main(String[] args) {
        //solved the problem using static block
    }
}
