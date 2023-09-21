//Q6. WAJP to count how many Capital Vowels and Small Vowels present in the String.

public class Q06 extends ScObject {
    private static void countCapitalSmallVowels(String str) {
        int svc=0, cvc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                svc++;
            }
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                cvc++;
            }
        }

        System.out.println("Capital Vowel count is: " + cvc);
        System.out.println("Small Vowel count is: " + svc);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCapitalSmallVowels(st);
    }
}
