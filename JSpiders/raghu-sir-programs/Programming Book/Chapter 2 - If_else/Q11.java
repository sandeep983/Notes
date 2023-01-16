import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the height in meters and weight in kg: ");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        sc.close();

        System.out.println("BMI of person is: "+w/(h*h));
    }
}