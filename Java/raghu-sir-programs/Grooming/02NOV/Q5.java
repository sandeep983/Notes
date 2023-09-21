//Q5. WAJP to swap two user entered numbers without using temp variable.

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Numbers before swapping: ");
        System.out.println("First number: "+ a + " Second number: " + b);

        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("Numbers after swapping: ");
        System.out.println("First number: "+ a + " Second number: " + b);
    }
}
