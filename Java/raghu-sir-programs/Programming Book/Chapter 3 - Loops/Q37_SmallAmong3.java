import java.util.Scanner;

public class Q37_SmallAmong3 {
    private static int smallest(int a, int b, int c) {
        //smallest among three using conditional operator
        return a<b ? (a<c ? a : c) : (b<c ? b : c);

        //without using condition operator
        /*  int small = a;
            if(b<small) {
                small = b;
            } 
            else if(c<small) {
                small = c;
            }
            return small;        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        System.out.println(smallest(x, y, z));
    }
}
