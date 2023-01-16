import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        sc.close();

        int notes = amount/2000;
        amount = amount%2000;
        System.out.println("2000 notes: " + notes);

        notes = amount/500;
        amount = amount%500;
        System.out.println("500 notes: " + notes);
        
        notes = amount/200;
        amount = amount%200;
        System.out.println("200 notes: " + notes);
        
        notes = amount/100;
        amount = amount%100;
        System.out.println("100 notes: " + notes);
        
        notes = amount/50;
        amount = amount%50;
        System.out.println("50 notes: " + notes);
        
        notes = amount/20;
        amount = amount%20;
        System.out.println("20 notes: " + notes);
        
        notes = amount/10;
        amount = amount%10;
        System.out.println("10 notes: " + notes);
        
        notes = amount/5;
        amount = amount%5;
        System.out.println("5 notes: " + notes);
       
        notes = amount/2;
        amount = amount%2;
        System.out.println("2 notes: " + notes);

        notes = amount/1;
        System.out.println("1 notes: " + notes);
    }
}

