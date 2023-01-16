//Q14. WAJP to count how many Capital Letters and Special Characters present in the string.

public class Q14 extends ScObject {
    private static void countCapitalLettersSpecialChars(String str) {
        int clc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                clc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z')) {
                scc++;
            }
        }

        System.out.println("Capital Letter count is: " + clc);
        System.out.println("Special Character count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalLettersSpecialChars(st);
    }
}