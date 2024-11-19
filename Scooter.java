public class Scooter extends Vehicle {
    boolean electric;
    Wheels wheels; // Composition

    // Constructor
    public Scooter(int speed, int weight, boolean electric) {
        super(speed, weight); // Call parent class constructor
        this.electric = electric;
        this.wheels = new Wheels(2); // Default to 2 wheels
    }

    // Print info
    public void printInfo() {
        System.out.println("Scooter Details:");
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Electric: " + (electric ? "Yes" : "No"));
        wheels.displayWheels(); // Delegate to Wheels class
    }
}
