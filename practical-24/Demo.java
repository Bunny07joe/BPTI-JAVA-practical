// Parent class
class Vehicle {
    // Constant speed limit
    final int SPEED_LIMIT = 120;

    // Method to display the speed limit
    void displaySpeedLimit() {
        System.out.println("Speed Limit: " + SPEED_LIMIT + " km/h");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int speed;

    // Constructor
    Car(int speed) {
        this.speed = speed;
    }

    // Method to display speed and call the method from the parent class
    void displaySpeed() {
        System.out.println("Car Speed: " + speed + " km/h");
        super.displaySpeedLimit(); // Using 'super' to call method from parent class
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car(100);

        // Calling methods to display speed and speed limit
        myCar.displaySpeed();
    }
}
