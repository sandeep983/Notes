import java.util.Scanner;

public class Q45_NpowP {
    private static int pow(int n, int p) {
        int pw=1;

        for(int i=1; i<=p; i++) {
            pw *= n;
        }

        return pw;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number and it's power: ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        System.out.println(pow(n, p));
    }
}
