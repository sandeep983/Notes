import java.util.Scanner;

class SmallAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a<b && a<c)
            System.out.println(a + " is the smallest number");
        else if (b<c)
            System.out.println(b + " is the smallest number");
        else
            System.out.println(c + " is the smallest number");
    }
}