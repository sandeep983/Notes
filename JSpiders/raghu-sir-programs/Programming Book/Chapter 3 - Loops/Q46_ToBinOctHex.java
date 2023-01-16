import java.util.Scanner;

public class Q46_ToBinOctHex {
    private static String decToBinary(int n) {
        String bin="";

        while(n!=0) {
            int b = n%2;
            bin = b + bin;
            n/=2;
        }

        return bin;
    }

    private static String decToOctal(int n) {
        String oct="";

        while(n!=0) {
            int b = n%8;
            oct = b + oct;
            n/=8;
        }

        return oct;
    }

    private static String decToHexadecimal(int n) {
        String hex="";

        do {
            int b = n%16;
            if(b<10) 
                hex = b+hex;
            else
                hex = (char)(b+55)+hex;
            n/=16;
        } while(n!=0);

        return hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(decToBinary(n));
        System.out.println(decToOctal(n));
        System.out.println(decToHexadecimal(n));
    }
}
