// Define interface A
interface A {
    // Method declaration
    void methodA();

    // Constant declaration
    String name = "This is interface A";
}

// Define interface A1 extending A
interface A1 extends A {
    // Method declaration
    void methodA1();

    // Constant declaration
    String name = "This is interface A1";
}

// Define interface A2 extending A
interface A2 extends A {
    // Method declaration
    void methodA2();

    // Constant declaration
    String name = "This is interface A2";
}

// Define interface A12 inheriting from both A1 and A2
interface A12 extends A1, A2 {
    // Method declaration
    void methodA12();

    // Constant declaration
    String name = "This is interface A12";
}

// Implement class Interface_Imple implementing A12
class Interface_Impl implements A12 {
    // Implementing methodA from interface A
    public void methodA() {
        System.out.println("Method A is invoked. Name: " + A.name);
    }

    // Implementing methodA1 from interface A1
    public void methodA1() {
        System.out.println("Method A1 is invoked. Name: " + A1.name);
    }

    // Implementing methodA2 from interface A2
    public void methodA2() {
        System.out.println("Method A2 is invoked. Name: " + A2.name);
    }

    // Implementing methodA12 from interface A12
    public void methodA12() {
        System.out.println("Method A12 is invoked. Name: " + A12.name);
    }
}

// Main class to test the implementation
public class Task{
    public static void main(String[] args) {
        Interface_Impl obj = new Interface_Impl();

        // Invoking each method to demonstrate accessing constants
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}
