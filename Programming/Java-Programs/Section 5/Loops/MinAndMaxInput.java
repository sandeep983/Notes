//Quesiton 15. Printing Minimum and Maximum Number from user inputs
/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint: 
-Use an endless while loop.
Bonus: 
-Create a project with the name MinAndMaxInputChallenge.
*/
//Solution 15. Printing Minimum and Maximum Number from user inputs
import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.print("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if(number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " Max = " + max);
        scanner.close();
    }
}
