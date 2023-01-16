import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the Pipe in centimeters: ");
        double l = sc.nextDouble();
        sc.close();

        System.out.println("In Meter: "+(l/100.0)+" meter");
        System.out.println("In Foot: "+(l/30.48)+" foot");
        
    }
}