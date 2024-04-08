class A {
    void Display() {
        System.out.println("This is class A, the main or super class");
    }
}

class B extends A {
    void Display1() {
        System.out.println("This is class B, which extends class A");
    }
}

class C extends B {
    void Display2() {
        System.out.println("This is class C, which extends class B");
    }
}

public class Multilvl {
    public static void main(String args[]) {
        // object will be created
        C free = new C();
        free.Display(); // Display method from class A
        free.Display1(); // Display1 method from class B
        free.Display2(); // Display2 method from class C
	System.out.println("THis is example of Multi level inheritance");
    }
}
