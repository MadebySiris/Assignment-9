public class Wheels {
    int numberOfWheels;

    // Constructor
    public Wheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // Setters and getters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    // Display info
    public void displayWheels() {
        System.out.println("This vehicle has " + this.numberOfWheels + " wheels.");
    }
}
