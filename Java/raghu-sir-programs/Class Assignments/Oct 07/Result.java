import java.util.Scanner;

public class Result {
    private static String resultPassOrFail(int a, int b, int c, int d){
        if(a<35 || b<35 || c<35 || d<35){
            return "Fail";
        }
        return "Pass";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        System.out.println(resultPassOrFail(a,b,c,d));
    }
}
