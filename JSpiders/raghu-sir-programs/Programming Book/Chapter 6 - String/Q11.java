//Q11. WAJP to count how many Capital Vowels and Small Consonants present in the String.

public class Q11 extends ScObject {
    private static void countCapitalVowelsSmallConsonants(String str) {
        int cvc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                    scc++;
                }
            }
            else if(ch>='A' && ch<='Z') {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    cvc++;
                }
            }
        }

        System.out.println("Capital Vowel count is: " + cvc);
        System.out.println("Small Consonant count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalVowelsSmallConsonants(st);
    }
}
