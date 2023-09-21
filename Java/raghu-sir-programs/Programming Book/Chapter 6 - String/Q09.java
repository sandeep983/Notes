//Q9. WAJP to count how many Small Vowels and Small Consonants present in the String.

public class Q09 extends ScObject {
    private static void countSmallVowelsConsonants(String str) {
        int svc=0, scc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    svc++;
                }
                else {
                    scc++;
                }
            }
        }

        System.out.println("Small Vowel count is: " + svc);
        System.out.println("Small Consonant count is: " + scc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countSmallVowelsConsonants(st);
    }
}