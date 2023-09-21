//Q18. WAJP to count how many Capital Vowels, Capital Consonants and Special Characters present in the string.

public class Q18 extends ScObject {
    private static void countCapitalVowelsConsonantsSpecialChars(String str) {
        int cvc=0, ccc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                cvc++;
            }
            else if((ch>='A' && ch<='Z') && (ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')) {
                ccc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')) {
                scc++;
            }
        }

        System.out.println("Capital Vowel count is: " + cvc);
        System.out.println("Capital Consonant count is: " + ccc);
        System.out.println("Special Character count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalVowelsConsonantsSpecialChars(st);
    }
}