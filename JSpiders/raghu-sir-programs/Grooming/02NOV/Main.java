public class Main {
    static Main m = null;

    private Main() {

    }

    static Main get() {
        if(m==null) {
            m=new Main();
            return m;
        }
        return m;
    }

    public static void main(String[] args) {
        Main m1 = get();
        System.out.println(m1);
        Main m2 = get();
        System.out.println(m2);
    }
}
