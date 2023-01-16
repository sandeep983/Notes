//Q8. WAJP to count how many Capital Vowels and Capital Consonants present in the String.

public class Q08 extends ScObject {
    private static void countCapitalVowelsConsonants(String str) {
        int cvc=0, ccc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    cvc++;
                }
                else {
                    ccc++;
                }
            }
        }

        System.out.println("Capital Vowel count is: " + cvc);
        System.out.println("Capital Consonant count is: " + ccc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalVowelsConsonants(st);
    }
}
