//Q36. WAJP to reverse the string.

public class Q36 extends ScObject {
    private static String reverseString(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<=ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }

        return new String(ch);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(reverseString(st));
    }
}