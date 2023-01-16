//Q41. WAJP to Reverse the Words in the Sentence.

public class Q41 extends ScObject {
    private static String reverseTheWordsOfString(String str) {
        char[] ch = str.toCharArray();
        String revString = "";

        for(int i=0; i<ch.length; i++) {
            int k=i;
            while(i<ch.length && ch[i]!=' ') {
                i++;
            }

            int j=i-1;
            while(j>=k) {
                revString = revString + ch[j];
                j--;
            }

            if(i<ch.length) {
                revString = revString + ch[i];
            }
        }

        return revString;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        System.out.println(reverseTheWordsOfString(st));
    }
}