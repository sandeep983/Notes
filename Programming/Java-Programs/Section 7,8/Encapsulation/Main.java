package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(50, true);
        System.out.println(p.addToner(50));
        System.out.println("initial page count = " +p.getPagesPrinted());
        
        int pagesPrinted = p.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +p.getPagesPrinted());
        
        pagesPrinted = p.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +p.getPagesPrinted());
    }
}
    
