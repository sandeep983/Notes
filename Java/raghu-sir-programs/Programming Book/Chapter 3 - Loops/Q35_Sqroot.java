import java.util.Scanner;

public class Q35_Sqroot {
    private static double sqroot(int num) {
        double t;
        double sqrt = num/2;
              
        do {
            t = sqrt;
            sqrt = (t+(num/t))/2;
        } while((t-sqrt != 0));

        return sqrt;
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(sqroot(n));
    }
}
