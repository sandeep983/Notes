//Q42. WAJP to Reverse the Sentence.

public class Q42 extends ScObject {
    public static String reverseSentenceOfString(String str) {
        String revString = "";
        char[] ch = str.toCharArray();

        for(int i=ch.length-1; i>=0; i--) {
            int k=i;

            while(i>=0 && ch[i]!=' ') {
                i--;
            }

            int j=i+1;
            while(j<=k) {
                revString = revString + ch[j];
                j++;
            }

            if(i>=0) {
                revString = revString + ch[i];
            }
        }

        return revString;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println(reverseSentenceOfString(st));
    }
}