import java.util.Scanner;

public class Q40_Table {
    private static void table(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n +" * " +i+ " = " + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        table(n);
    }
}
