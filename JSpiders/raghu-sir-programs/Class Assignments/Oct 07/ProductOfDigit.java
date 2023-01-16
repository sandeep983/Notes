import java.util.Scanner;

public class ProductOfDigit {
    private static int productOfDigit(int num){
        int prod=1;
        while(num != 0){
            int ld = num%10;
            prod *= ld;
            num /= 10;     
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(productOfDigit(num));
    }
}
