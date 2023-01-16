//Q4. WAJP to count how many Capital Vowels present in the String.

public class Q04 extends ScObject {
    private static int countCapitalVowels(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println("Capital Vowel count is: " + countCapitalVowels(st));
    }
}
