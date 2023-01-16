import java.util.Scanner;

class LargestLengthName
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two names: ");

        String n1 = sc.next();
        String n2 = sc.next();
        sc.close();

        if(n1.length() > n2.length())
            System.out.println(n1 + " name has the highest length");
        else
            System.out.println(n2 + " name has the highest length");
    }
}