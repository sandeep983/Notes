import java.util.Scanner;

class SmallAmongTwoDouble
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        if(a<=b)
            System.out.println(a + " is the smallest number");
        else
            System.out.println(b + " is the smallest number");
    }
}