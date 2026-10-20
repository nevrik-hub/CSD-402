import java.util.Scanner;

/**
 * Program Name: WaterEnergyCalculator
 * Description: Calculates the energy needed to heat a specified mass of water 
 *              from an initial temperature to a final temperature in Joules.
 * Formula: Q = waterMass * (finalTemperature - initialTemperature) * 4184
 * 
 * @author Nick Zankl
 * @version 1.0
 * @date October 20, 2026
 */
public class WaterEnergyCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt user for the initial temperature in Celsius
        System.out.print("Enter the initial temperature (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        // Prompt user for the final temperature in Celsius
        System.out.print("Enter the final temperature (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate energy required in Joules
        // Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double energyQ = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the calculated energy formatted to two decimal places
        System.out.println("\n--- Calculation Results ---");
        System.out.printf("The energy needed to heat the water is: %.2f Joules%n", energyQ);

        // Close the scanner resource
        scanner.close();
    }
}