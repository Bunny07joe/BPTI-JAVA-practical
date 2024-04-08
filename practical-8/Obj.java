public class Obj {
    public static void main(String[] args) {
        Car mk4 = new Car("Toyota", "Supra", 1986);
        Car mustang = new Car("Ford", "Mustang", 1969);

        System.out.println("Details of Mustang:");
        mustang.displayInfo();
    }
}
