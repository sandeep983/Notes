import java.util.Scanner;

class MonthValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");

        int m = sc.nextInt();
        sc.close();

        if(m>=1 && m<=12)
            System.out.println("Month number " +m+ " is valid." );
        else
            System.out.println("Month number " +m+" is not valid.");
    }
}
