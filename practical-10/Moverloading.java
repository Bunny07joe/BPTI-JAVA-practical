public class Moverloading {
    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition = " + result);
    }

    public static void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Addition = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Method overloading README code in .java File");
        System.out.println("");
        System.out.println("Method add with two parameters");
        add(11, 22); // Corrected method call
        System.out.println("");
        System.out.println("Method add with three parameters");
        add(11, 22, 33); // Corrected method call
    }
}
