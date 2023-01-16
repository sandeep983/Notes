import java.util.Scanner;

class SmallAmongTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int small = a;
        if(b<small)
            small=b;

        System.out.println(small + " is smallest");
    }
}