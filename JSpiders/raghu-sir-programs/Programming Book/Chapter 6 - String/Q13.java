//Q13. WAJP to count how many Small Letters and Special Characters present in the string.

public class Q13 extends ScObject {
    private static void countSmallLettersSpecialChars(String str) {
        int slc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                slc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='A' && ch<='Z')) {
                scc++;
            }
        }

        System.out.println("Small Letters count is: " + slc);
        System.out.println("Special Character count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countSmallLettersSpecialChars(st);
    }
}