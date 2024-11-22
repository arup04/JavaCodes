package Sheet7;

// Base class: Vehicle
class Vehicle {
    private String brand;
    private String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Placeholder method for maxSpeed
    public void maxSpeed() {
        System.out.println("Maximum speed: Not specified for base class.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatingCapacity;

    // Constructor using super
    public Car(String brand, String model, int seatingCapacity) {
        super(brand, model); // Call the constructor of the base class
        this.seatingCapacity = seatingCapacity;
    }

    // Override maxSpeed method
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of the car: 200 km/h");
    }

    // Display car details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

// Subclass: Bicycle
class Bicycle extends Vehicle {
    private boolean hasGear;

    // Constructor using super
    public Bicycle(String brand, String model, boolean hasGear) {
        super(brand, model); // Call the constructor of the base class
        this.hasGear = hasGear;
    }

    // Override maxSpeed method
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of the bicycle: 25 km/h");
    }

    // Display bicycle details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

// Subclass: Scooter
class Scooter extends Vehicle {
    private String engineCapacity;

    // Constructor using super
    public Scooter(String brand, String model, String engineCapacity) {
        super(brand, model); // Call the constructor of the base class
        this.engineCapacity = engineCapacity;
    }

    // Override maxSpeed method
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of the scooter: 80 km/h");
    }

    // Display scooter details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}

// Main class to demonstrate functionality
public class q2 {
    public static void main(String[] args) {
        // Create instances of Car, Bicycle, and Scooter
        Car car = new Car("Toyota", "Camry", 5);
        Bicycle bicycle = new Bicycle("Giant", "Escape 3", true);
        Scooter scooter = new Scooter("Honda", "Activa", "125cc");

        // Display details and maximum speed for each vehicle
        System.out.println("Car Details:");
        car.displayDetails();
        car.maxSpeed();

        System.out.println("\nBicycle Details:");
        bicycle.displayDetails();
        bicycle.maxSpeed();

        System.out.println("\nScooter Details:");
        scooter.displayDetails();
        scooter.maxSpeed();
    }
}
