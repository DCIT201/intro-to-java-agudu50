
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        // Creating an Object
        Scanner scanner = new Scanner(System.in);

        // Displaying output to the user
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option to wish to convert the temperature");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        // closing the object scanner to prevent leak

        int choice = 0;

        // Validating user input for choice

        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2)");
                scanner.next(); // clear invalid input

            }
        }

        double temperature = 0.0;

        // Validate user input for temperature
        while (true) {
            System.out.println("Enter the temperature to convert:");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number for the temperature. ");
                scanner.next(); // Clear invalid input
            }
        }

        double convertedTemperature;
        if (choice == 1) {
            // Converting Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("The temperature %.2f°C is equivalent to %.2f°F.\n", temperature, convertedTemperature);
        } else {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature %.2f°C.\n", temperature, convertedTemperature);
        }

        System.out.println("Thank you for using the Temperature Converter");
        scanner.close();

    }

}
