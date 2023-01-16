//Q37. WAJP to check if the string is Palindrome or not.

public class Q37 extends ScObject {
    private static boolean isStringPalindrome(String str) {
        int i=0, j=str.length()-1;

        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        if(isStringPalindrome(st)) {
            System.out.println("String is Palindrome.");
        }
        else {
            System.out.println("String is not Palindrome.");
        }
    }
}