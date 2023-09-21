public class Q57 {
    public static void main(String[] args) {
        int inA=10, inB=10;
        int decA=10, decB=10;

        //working of preincrement and postincrement
        System.out.print("a = " + inA);
        System.out.print("\t\ta++ = " + inA++);

        System.out.print("\nb = " + inB);
        System.out.print("\t\t++b = " + ++inB);

        //working of predecrement and postdecrement
        System.out.print("\n\na = " + decA);
        System.out.print("\t\ta-- = " + decA--);

        System.out.print("\nb = " + decB);
        System.out.print("\t\t--b = " + --decB);
    }
}
