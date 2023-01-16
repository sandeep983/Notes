//Q34. WAJP to convert all the Uppercase Letters to Lowercase Letters.

public class Q34 extends ScObject {
    private static String convertToLowercase(String str) {
        char[] ch = str.toCharArray();
       
        for(int i=0; i<ch.length; i++) {
            if(ch[i]>='A' && ch[i]<='Z') {
                ch[i] = (char)(ch[i] + 32);
            }
        }

        return new String(ch);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(convertToLowercase(st));
    }
}