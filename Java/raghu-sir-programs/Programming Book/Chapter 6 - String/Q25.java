//Q25. WAJP to convert the String to UpperCase.

public class Q25 extends ScObject {
    private static String convertToUppercase(String str) {
        char[] ch = str.toCharArray();
       
        for(int i=0; i<ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }

        return new String(ch);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(convertToUppercase(st));
    }
}