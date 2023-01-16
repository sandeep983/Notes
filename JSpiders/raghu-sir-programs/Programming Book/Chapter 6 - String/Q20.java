//Q20. WAJP to count how many Letters and Digits present in the string.

public class Q20 extends ScObject {
    private static void countLettersDigits(String str) {
        int lc=0, dc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                lc++;
            }
            else if(ch>='0' && ch<='9') {
                dc++;
            }
        }

        System.out.println("Letter count is: " + lc);
        System.out.println("Digit count is: " + dc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countLettersDigits(st);
    }
}