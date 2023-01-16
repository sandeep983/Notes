//Q40. WAJP to String is Anagram or not.

public class Q40 extends ScObject {
    private static int[] countFrequencyOfChars(String str) {
        int[] count = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                count[ch-65]++;
            }
            else if(ch>='a' && ch<='z') {
                count[ch-97]++;
            }
        }

        return count;
    }

    private static boolean isStringAnagram(String str1, String str2) {
        int[] countStr1 = countFrequencyOfChars(str1);
        int[] countStr2 = countFrequencyOfChars(str2);

        for(int i=0; i<26; i++) {
            if(countStr1[i] != countStr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first string: ");
        String st1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String st2 = sc.nextLine();
        
        if(isStringAnagram(st1, st2)) {
            System.out.println("String is Anagram.");
        }
        else {
            System.out.println("String is not Anagram.");
        }
    }
}