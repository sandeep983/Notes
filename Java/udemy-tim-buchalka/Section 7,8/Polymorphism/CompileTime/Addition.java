package Polymorphism.CompileTime;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1, 2, 3));
    }
}
