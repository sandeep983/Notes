//Q30. WAJP to convert Every Words Last Character into Small and Remaining to Capital in string.

public class Q30 extends ScObject {
    private static String convertEveryWordsLastCharacterToSmall(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                if(ch[i]>='A' && ch[i]<='Z') {
                    ch[i] = (char) (ch[i]+32);
                }
            }
            else if(ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char) (ch[i]-32);
            }
        }

        return new String(ch);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(convertEveryWordsLastCharacterToSmall(st));
    }
}