public class Bike extends Vehicle {
    int seats;
    String type;
    String brand;
    Wheels wheels; // Composition

    // Constructor
    public Bike(int speed, int weight, int seats, String type, String brand) {
        super(speed, weight); // Call parent class constructor
        this.seats = seats;
        this.type = type;
        this.brand = brand;
        this.wheels = new Wheels(2); // Default to 2 wheels
    }

    // Print info
    public void printInfo() {
        System.out.println("Bike Details:");
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Seats: " + seats);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        wheels.displayWheels(); // Delegate to Wheels class
    }
}
