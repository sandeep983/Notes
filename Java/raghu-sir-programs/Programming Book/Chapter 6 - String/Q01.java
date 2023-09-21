//Q1. WAJP to count how many Capital letters present in the String.

public class Q01 extends ScObject {
    private static int countCapitalLetters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch>='A' && ch<='Z') {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println("Capital Letter count is: " + countCapitalLetters(st));
    }
}
