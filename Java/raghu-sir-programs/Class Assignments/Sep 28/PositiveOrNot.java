import java.util.Scanner;

class PositiveOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();

        if(a<0)
            System.out.println(a + " is negative");
        if(a>0)
            System.out.println(a + " is positive");
        if(a==0)
            System.out.println(a + " is zero");
    }
}