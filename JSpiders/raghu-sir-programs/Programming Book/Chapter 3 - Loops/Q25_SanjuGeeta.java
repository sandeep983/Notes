import java.util.Scanner;

public class Q25_SanjuGeeta {
    private static void sanjuGeeta(int n) {
        if(n%3==0 && n%5==0) {
            System.out.println("Sanju Weds Geeta");
        }
        else if(n%3 == 0) {
            System.out.println("Sanju");
        }
        else if(n%5 == 0) {
            System.out.println("Geeta");
        }
        else {
            System.out.println("Breakup");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        sanjuGeeta(n);
    }
}
