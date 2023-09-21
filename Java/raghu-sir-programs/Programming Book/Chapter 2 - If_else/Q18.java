import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int y = sc.nextInt();
        sc.close();

        if ((y%4==0 && y%100!=0) || y%400==0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}