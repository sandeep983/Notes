//Q19. WAJP to count how many Small Vowels, Small Consonants and Special Characters present in the string.

public class Q19 extends ScObject {
    private static void countSmallVowelsConsonantsSpecialChars(String str) {
        int svc=0, scc=0, sc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                svc++;
            }
            else if((ch>='a' && ch<='z') && (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')) {
                scc++;
            }
            else if(!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')) {
                sc++;
            }
        }

        System.out.println("Small Vowel count is: " + svc);
        System.out.println("Small Consonant count is: " + scc);
        System.out.println("Special Character count is: " + sc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countSmallVowelsConsonantsSpecialChars(st);
    }
}