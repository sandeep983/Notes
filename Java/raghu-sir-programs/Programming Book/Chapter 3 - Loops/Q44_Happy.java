import java.util.Scanner;

public class Q44_Happy {
    private static boolean isHappy(int n) {
        while(n>9){
            int sum=0;

            while(n!=0) {
                int r = n%10;
                sum = sum + r*r;
                n /= 10;
            }
            n=sum;
        }

        return n==1 || n==7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        
        if(isHappy(num)) {
            System.out.println("happy number");
        }
        else {
            System.out.println("not a happy number");
        }
    }
}
