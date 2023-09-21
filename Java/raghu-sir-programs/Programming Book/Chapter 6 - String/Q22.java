//Q22. WAJP to count how many Capital Letters, Special Characters and Digits present in the string.

public class Q22 extends ScObject {
    private static void countCapitalLettersSpecialCharsDigits(String str) {
        int clc=0, scc=0, dc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                clc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')) {
                scc++;
            }
            else if(ch>='0' && ch<='9') {
                dc++;
            }
        }

        System.out.println("Capital Letter count is: " + clc);
        System.out.println("Special Character count is: " + scc);
        System.out.println("Digit count is: " + dc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalLettersSpecialCharsDigits(st);
    }
}