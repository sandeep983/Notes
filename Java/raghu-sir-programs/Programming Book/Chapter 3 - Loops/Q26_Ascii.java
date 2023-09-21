public class Q26_Ascii {
    private static void asciiAtoZ() {
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.print((int)ch + " ");
        }
    }

    private static void ascii0to9() {
        for(char ch='a'; ch<='z'; ch++) {
            System.out.print((int)ch + " ");
        }
    }

    private static void asciiatoz() {
        for(char ch='0'; ch<='9'; ch++) {
            System.out.print((int)ch + " ");
        }
    }
    
    public static void main(String[] args) {
        asciiAtoZ();

        System.out.println();
        ascii0to9();

        System.out.println();
        asciiatoz();
    }
}