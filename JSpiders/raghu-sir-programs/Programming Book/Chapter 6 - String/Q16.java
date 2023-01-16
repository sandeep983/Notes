//Q16. WAJP to count how many Capital Vowels, Small Consonants and Special Characters present in the string.

public class Q16 extends ScObject {
    private static void countCapitalVowelsSmallConsonantsSpecialChars(String str) {
        int cvc=0, scc=0, scC=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                cvc++;
            }
            else if((ch>='a' && ch<='z') && (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')) {
                scc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')) {
                scC++;
            }
        }

        System.out.println("Capital Vowel count is: " + cvc);
        System.out.println("Small Consonant count is: " + scc);
        System.out.println("Special Character count is: " + scC);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalVowelsSmallConsonantsSpecialChars(st);
    }
}
