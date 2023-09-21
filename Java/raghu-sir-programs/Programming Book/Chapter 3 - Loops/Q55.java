import java.util.Scanner;

public class Q55 {
    private static double percentage(int m1, int m2, int m3, int m4) {
        int total = m1 + m2 + m3 + m4;
        return (double)total/4.00;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks of 4 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        sc.close();

        System.out.println(percentage(m1, m2, m3, m4)+"%");
    }
}
