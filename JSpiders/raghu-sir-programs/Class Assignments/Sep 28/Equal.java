import java.util.Scanner;

class Equal 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a==b)
            System.out.println("Numbers are equal");

        if(a!=b) 
            System.out.println("Numbers are not equal");
    }
}