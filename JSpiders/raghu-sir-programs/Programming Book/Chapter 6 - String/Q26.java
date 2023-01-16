//Q26. WAJP to convert all the Vowels to Small and Remaining to Capital in string.

public class Q26 extends ScObject {
    private static String convertVowelsToSmallRemCapital(String str) {
        char[] ch = str.toCharArray();
       
        for(int i=0; i<ch.length; i++) {
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
                ch[i] = (char)(ch[i] + 32);
            }
            else if((ch[i]>='a' && ch[i]<='z') && !(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')){ 
                    ch[i] = (char)(ch[i] - 32);
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(convertVowelsToSmallRemCapital(st));
    }
}