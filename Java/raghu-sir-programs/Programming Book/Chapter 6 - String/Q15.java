//Q15. WAJP to count how many Capital Letters, Small Letters and Special Characters present in the string.

public class Q15 extends ScObject {
    private static void countCapitalSmallLettersSpecialChars(String str) {
        int clc=0, slc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                clc++;
            }
            else if(ch>='a' && ch<='z') {
                slc++;
            }
            else {
                scc++;
            }
        }

        System.out.println("Capital Letter count is: " + clc);
        System.out.println("Small Letter count is: " + slc);
        System.out.println("Special Character count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalSmallLettersSpecialChars(st);
    }
}