import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Temperature Converter!");

            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Convert Celsius to Fahrenheit");
                System.out.println("2. Convert Fahrenheit to Celsius");
                System.out.println("3. Exit");

                int choice = 0;

                // Validate user input for choice
                while (true) {
                    System.out.print("Enter your choice (1, 2, or 3): ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice == 1 || choice == 2 || choice == 3) {
                            break;
                        } else {
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                        scanner.next(); // Clear invalid input
                    }
                }

                if (choice == 3) {
                    System.out.println("Thank you for using the Temperature Converter!");
                    break;
                }

                double temperature = 0.0;

                // Validate user input for temperature
                while (true) {
                    System.out.print("Enter the temperature to convert: ");
                    if (scanner.hasNextDouble()) {
                        temperature = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number for the temperature.");
                        scanner.next(); // Clear invalid input
                    }
                }

                double convertedTemperature;
                if (choice == 1) {
                    // Convert Celsius to Fahrenheit
                    convertedTemperature = (temperature * 9 / 5) + 32;
                    System.out.printf("The temperature %.2f°C is equivalent to %.2f°F.\n", temperature, convertedTemperature);
                } else {
                    // Convert Fahrenheit to Celsius
                    convertedTemperature = (temperature - 32) * 5 / 9;
                    System.out.printf("The temperature %.2f°F is equivalent to %.2f°C.\n", temperature, convertedTemperature);
                }
            }
        }
    }
}
