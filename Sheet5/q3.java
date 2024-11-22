package Sheet5;

// Base class: Product
class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double unitPrice;

    // Constructor
    public Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    // Getter and Setter for Unit Price
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryId);
        System.out.println("Unit Price: " + unitPrice);
    }
}

// Subclass: ElectricalProduct
class ElectricalProduct extends Product {
    private String voltageRange;
    private int wattage;

    // Constructor
    public ElectricalProduct(int productId, String name, int categoryId, double unitPrice, String voltageRange, int wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    // Getter and Setter for Wattage
    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    // Override displayDetails to include ElectricalProduct details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage);
    }
}

// Main class to demonstrate the functionality
public class q3{
    public static void main(String[] args) {
        // Create an instance of ElectricalProduct
        ElectricalProduct electricalProduct = new ElectricalProduct(101, "LED Bulb", 501, 299.99, "220-240V", 10);

        // Display initial details
        System.out.println("Initial Electrical Product Details:");
        electricalProduct.displayDetails();

        // Change wattage and unit price
        System.out.println("\nUpdating Wattage and Unit Price...");
        electricalProduct.setWattage(15);
        electricalProduct.setUnitPrice(349.99);

        // Display updated details
        System.out.println("\nUpdated Electrical Product Details:");
        electricalProduct.displayDetails();
    }
}
