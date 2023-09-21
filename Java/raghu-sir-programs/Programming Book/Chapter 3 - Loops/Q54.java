import java.util.Scanner;

public class Q54 {
    private static int discount(int price, int percent) {
        int percentValue = price*percent/100;
        return price - percentValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price: ");
        int price = sc.nextInt();
        
        System.out.print("Enter the discount percentage: ");
        int percent = sc.nextInt();
        sc.close();

        System.out.println(discount(price, percent));
    }
}
