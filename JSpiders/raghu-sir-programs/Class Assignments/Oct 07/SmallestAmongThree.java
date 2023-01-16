import java.util.Scanner;

public class SmallestAmongThree {
    private static int smallAmongThree(int a, int b, int c){
        int small=a;

        if(b<small){
            small=b;
        }
        if(c<small){
            small=c;
        }

        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        System.out.println(smallAmongThree(n1, n2, n3));  
    }
}
