//Q43. WAJP to count how many Characters present in all the Words.

public class Q43 extends ScObject {
    private static void countCharsPresentInTheWord(String str) {
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            String st = "";
            int count=0;

            while(true) {
                if(ch[i]==' ') {
                    break;
                }
                else if(i==ch.length-1) {
                    st = st + ch[i];
                    i++;
                    count++;
                    break;
                }
                else {
                    st = st + ch[i];
                    i++;
                    count++;
                }
            }

            System.out.println(st + " --> " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        countCharsPresentInTheWord(st);
    }
}