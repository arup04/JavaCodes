package com.gsv.project;

class Vehicle {
 String brand;
 int wheels;
 String fuelType;

 public Vehicle(String brand, int wheels, String fuelType) {
     this.brand = brand;
     this.wheels = wheels;
     this.fuelType = fuelType;
 }

 public void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Number of Wheels: " + wheels);
     System.out.println("Fuel Type: " + fuelType);
 }
}

class Car extends Vehicle {
 int numberOfDoors;
 boolean airConditioning;

 public Car(String brand, int wheels, String fuelType, int numberOfDoors, boolean airConditioning) {
     super(brand, wheels, fuelType); // Reuse Vehicle constructor
     this.numberOfDoors = numberOfDoors;
     this.airConditioning = airConditioning;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Number of Doors: " + numberOfDoors);
     System.out.println("Air Conditioning: " + (airConditioning ? "Yes" : "No"));
 }
}

class Bicycle extends Vehicle {
 boolean hasGear;
 
 public Bicycle(String brand, int wheels, boolean hasGear) {
     super(brand, wheels, "None"); 
     this.hasGear = hasGear;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
 }
}

class Scooter extends Vehicle {
 boolean electric;
 
 public Scooter(String brand, int wheels, String fuelType, boolean electric) {
     super(brand, wheels, fuelType);
     this.electric = electric;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Electric: " + (electric ? "Yes" : "No"));
 }
}

public class vehicle {
 public static void main(String[] args) {
     // Create a Car object
     Car c = new Car("Toyota", 4, "Petrol", 4, true);
     Bicycle b = new Bicycle("Giant", 2, true);
     Scooter sc = new Scooter("Honda", 2, "Petrol", false);

    
     System.out.println("Car Details:");
     c.displayDetails();
     System.out.println();

     System.out.println("Bicycle Details:");
     b.displayDetails();
     System.out.println();

     System.out.println("Scooter Details:");
     sc.displayDetails();
 }
}
