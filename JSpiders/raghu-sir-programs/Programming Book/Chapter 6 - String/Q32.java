//Q32. WAJP to calculate the Sum of Digits in string.

public class Q32 extends ScObject {
    private static int sumOfDigitsOfString(String str) {
        int sum=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='0' && ch<='9') {
                sum = sum + ch-48;
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String st = sc.nextLine();

        System.out.println(sumOfDigitsOfString(st));
    }
}