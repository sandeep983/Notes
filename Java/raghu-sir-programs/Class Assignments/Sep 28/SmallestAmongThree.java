import java.util.Scanner;

class SmallestAmongThree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int small = a;
        
        if(b>small)
            small=b;
        
        if(c>small)
            small=c;

        System.out.println(small + " is smallest");
    }
}