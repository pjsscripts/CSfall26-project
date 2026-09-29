import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    private String brand;
    private int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}


class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }

    private int numberOfDoors;
    private int milesPerGallon;
    private int numMileage;

    Car(String brand, int year, int numberOfDoors, int milesPerGallon, int numMileage) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
        this.milesPerGallon = milesPerGallon;
        this.numMileage = numMileage;
    }
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors + ", Miles per Gallon: " + milesPerGallon + ", Mileage: " + numMileage;
    }
}


public class MyCar {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Toyota", 2007);
        myVehicle.start();

        Car myCar = new Car("Chevy", 2012, 4, 30, 50000);
        myCar.start(); 

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(myVehicle);
        vehicles.add(myCar);
        System.out.println("Vehicles in the list:");
        
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.start();
        }
    }
}
