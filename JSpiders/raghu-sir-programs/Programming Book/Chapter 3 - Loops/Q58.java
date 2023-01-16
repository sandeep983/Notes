import java.util.Scanner;

public class Q58 {
    private static double pow(double n, int p) {
        double pw=1;

        for(int i=1; i<=p; i++) {
            pw *= n;
        }

        return pw;
    }

    private static double futureInvest(double pv, double i, int n) {
        double per = i/100;
        return pv * (pow((1+per), n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Present Value: ");
        double pv = sc.nextDouble();

        System.out.print("Enter the Interest Percentage: ");
        double i = sc.nextDouble();
        
        System.out.print("Enter the Number of period in Years: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("FV: "+ futureInvest(pv,i,n));
    }
}
