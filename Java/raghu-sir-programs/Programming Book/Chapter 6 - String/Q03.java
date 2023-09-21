//Q3. WAJP to count how many Small letters present in the String.

public class Q03 extends ScObject {
    private static int countSmallLetters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {       
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println("Small Letter count is: " + countSmallLetters(st));
    }
}