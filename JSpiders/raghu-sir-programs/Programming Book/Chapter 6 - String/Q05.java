//Q5. WAJP to count how many Small Vowels present in the String.

public class Q05 extends ScObject {
    private static int countSmallVowels(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println("Small Vowel count is: " + countSmallVowels(st));
    }
}
