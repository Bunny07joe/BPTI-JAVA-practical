public class Car {
    String Brand;
    String carmodel;
    int year;

    public Car(String carname, String carmodel, int year) {
        this.Brand = carname;
        this.carmodel = carmodel;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car name: " + Brand);
        System.out.println("Car model: " + carmodel);
        System.out.println("Year: " + year);
    }
}
