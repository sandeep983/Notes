import java.util.Scanner;

class BiggestAmongThree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double big = a;
        
        if(b>big)
            big=b;
        
        if(c>big)
            big=c;

        System.out.println(big + " is biggest");
    }
}