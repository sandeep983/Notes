//Q12. WAJP to count how many Letters and Special Characters present in the string.

public class Q12 extends ScObject {
    private static void countLettersSpecialChars(String str) {
        int lc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
               lc++;
            }
            else if(!(ch>='0' && ch<='9')) {
                scc++;
            }
        }

        System.out.println("Letters count is: " + lc);
        System.out.println("Special Character count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countLettersSpecialChars(st);
    }
}