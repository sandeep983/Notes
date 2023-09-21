import java.util.Scanner;

public class DaysPresent {
    private static String daysInMonth(int m){
        switch(m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31 Days";
            case 4:
            case 6:
            case 9:
            case 11:
                return "30 Days";
            case 2:
                return "28 or 29 Days";
            default:
                return "Invalid month number";
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int m = sc.nextInt();
        sc.close();

        System.out.println(daysInMonth(m));
    }
}
