import java.util.Scanner;

/*
 * Zachariah King
 * M1 Programming Assignment: Water Heating Energy Calculator
 * 5/18/25
 */

public class WaterHeatingEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for mass of water in kilograms
        System.out.print("Enter the initial amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt user for the initial temperature in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt user for the final temperature in Celsius
        System.out.print("Enter the final, desired temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);

        input.close();
    }
}