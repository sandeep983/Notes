//Q10. WAJP to count how many Small Vowels and Capital Consonants present in the String.

public class Q10 extends ScObject {
    private static void countSmallVowelsCapitalConsonants(String str) {
        int svc=0, ccc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    svc++;
                }
            }
            else if(ch>='A' && ch<='Z') {
                if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                    ccc++;
                }
            }
        }

        System.out.println("Small Vowel count is: " + svc);
        System.out.println("Capital Consonant count is: " + ccc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countSmallVowelsCapitalConsonants(st);
    }
}