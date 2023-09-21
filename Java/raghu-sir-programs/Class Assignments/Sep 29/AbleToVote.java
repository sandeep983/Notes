import java.util.Scanner;

class AbleToVote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.close();

        if(age>=18 && age<=100)
            System.out.println("You are allowed to vote.");
        else
            System.out.println("You are not allowed to vote.");
    }
}