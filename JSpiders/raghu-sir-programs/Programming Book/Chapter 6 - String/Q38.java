//Q38. WAJP to Swipe Every Word First Character with the Same Word Last Character in string.

public class Q38 extends ScObject {
    public static String swipeWordsFirstCharWithLastChar(String str) {
        char[] ch = str.toCharArray();
        int t=0;

        for(int i=0; i<str.length(); i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                t=i;
            }    
            else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                char temp = ch[i];
                ch[i] = ch[t];
                ch[t] = temp;
            }
        }

        return new String(ch);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(swipeWordsFirstCharWithLastChar(st));
    }
}