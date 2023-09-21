//Q7. WAJP to count how many Vowels and Consonants present in the String.

public class Q07 extends ScObject {
    private static void countVowelsConsonants(String str) {
        int vc=0, cc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    vc++;
                }
                else {
                    cc++;
                }
            }
        }

        System.out.println("Vowels count is: " + vc);
        System.out.println("Consonants count is: " + cc);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countVowelsConsonants(st);
    }
}
