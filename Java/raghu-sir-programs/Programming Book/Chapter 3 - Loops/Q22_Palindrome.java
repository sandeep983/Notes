import java.util.Scanner;

public class Q22_Palindrome {
    private static boolean isPalindrome(int n) {
        int rev=0, temp=n;

        do {
            int ld = n%10;
            rev = rev*10 + ld;
            n /= 10;
        } while(n!=0);
         
        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        if(isPalindrome(num)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
