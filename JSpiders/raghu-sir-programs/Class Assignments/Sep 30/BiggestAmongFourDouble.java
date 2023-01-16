import java.util.Scanner;

public class BiggestAmongFourDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four decimal numbers: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        sc.close();

        double big = a;
        if(b > big)
            big = b;
        if(c > big)
            big = c;
        if(d > big)
            big = d;
        
        System.out.println(big + " is the biggest number.");
    }
}