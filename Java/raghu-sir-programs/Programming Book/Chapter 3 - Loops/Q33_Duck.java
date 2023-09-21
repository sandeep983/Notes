import java.util.Scanner;

public class Q33_Duck {
    private static boolean isDuck(String n) {
        for (int i = 1; i<n.length(); i++) {
            if (n.charAt(i) == '0') {
                return true;
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String n = sc.nextLine();
        sc.close();

        if(isDuck(n)) {
            System.out.println(n + " is a duck number");
        }
        else {
            System.out.println(n + " is not a duck number");
        }
    }   
}
