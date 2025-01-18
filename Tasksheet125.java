class Vehicle{
    String make, model;
    int year;

    public Vehicle(String make,String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Cars extends Vehicle {
    int numberOfDoors;

    public Cars(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
}
public class Tasksheet125 {
    public static void main(String[] args) {
        Cars car = new Cars("Toyota", "Camry", 2022, 4);

        System.out.println("Car Details");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Number of Doors: " + car.numberOfDoors);
    }
}
