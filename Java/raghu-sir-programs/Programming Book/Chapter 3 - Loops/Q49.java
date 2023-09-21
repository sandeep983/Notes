import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Currency {
    private static String currency(double n) {
        String usd, inr, euro;
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat eu = NumberFormat.getCurrencyInstance(Locale.FRANCE);
      
        usd = us.format(n);
        inr = india.format(n);
        euro = eu.format(n);

        return "US: "+usd +"\n"+ "France: "+euro +"\n"+ "India: " +inr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        sc.close();

        System.out.println(currency(n));
    }
}
