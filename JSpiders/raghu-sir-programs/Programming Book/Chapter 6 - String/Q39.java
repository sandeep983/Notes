//Q39. WAJP to count how many Words Present in the Sentence.

public class Q39 extends ScObject {
    private static int countWords(String str) {
        char[] ch = str.toCharArray();
        int count=0;

        for(int i=0; i<ch.length; i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println("Number of words present in the sentence: " + countWords(st));
    }
}