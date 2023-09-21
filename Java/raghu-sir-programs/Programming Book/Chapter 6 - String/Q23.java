//Q23. WAJP to count how many Small Letters, Special Characters and Digits present in the string.

public class Q23 extends ScObject {
    private static void countSmallLettersSpecialCharsDigits(String str) {
        int slc=0, scc=0, dc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                slc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')) {
                scc++;
            }
            else if(ch>='0' && ch<='9') {
                dc++;
            }
        }

        System.out.println("Small Letter count is: " + slc);
        System.out.println("Special Character count is: " + scc);
        System.out.println("Digit count is: " + dc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countSmallLettersSpecialCharsDigits(st);
    }
}