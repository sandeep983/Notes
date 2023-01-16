public class Q52 {
    public static void main(String[] args) {
        System.out.println("Working of continue");
        for(int i=1; i<=10; i++) {
            if(i>=4 && i<=7) {
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println("\n\nWorking of break");
        for(int i=1; i<10; i++) {
            if(i==6) {
                break;
            }
            System.out.print(i+" ");
        }
    }
}
