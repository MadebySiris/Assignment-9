import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // "main" should be lowercase
        Scanner scanner = new Scanner(System.in); // Input setup

        // Instantiate objects
        Bike bike1 = new Bike(20, 10, 2, "Mountain", "Trek");
        Scooter scooter1 = new Scooter(25, 15, true);
        Bike bike2 = new Bike(15, 8, 1, "Road", "Specialized");
        Scooter scooter2 = new Scooter(20, 12, false);

        // Print information for each vehicle
        System.out.println("Attributes of the first bike:");
        bike1.printInfo();

        System.out.println("Attributes of the first scooter:");
        scooter1.printInfo();

        System.out.println("Attributes of the second bike:");
        bike2.printInfo();

        System.out.println("Attributes of the second scooter:");
        scooter2.printInfo();

        scanner.close();
    }
}
