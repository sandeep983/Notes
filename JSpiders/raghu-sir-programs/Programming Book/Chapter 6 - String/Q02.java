//Q2. WAJP to count how many Capital letters and Small letters present in the String.

public class Q02 extends ScObject {
    private static void countCapitalSmallLetters(String str) {
        int cc=0, sc=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                cc++;
            }
            else if(ch>='a' && ch<='z') {
                sc++;
            }
        }

        System.out.println("Capital Letter countis: " + cc);
        System.out.println("Small Letter count is: " + sc);
    }

    public static void main(String[] args) {       
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        countCapitalSmallLetters(st);
    }
}
