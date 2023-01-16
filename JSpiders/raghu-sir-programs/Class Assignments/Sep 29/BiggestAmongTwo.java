import java.util.Scanner;

class BiggestAmongTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a>=b)
            System.out.println(a + " is biggest number");
        else
            System.out.println(b + " is biggest number");
    }
}