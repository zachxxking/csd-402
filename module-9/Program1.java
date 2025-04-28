import java.util.ArrayList;
import java.util.Scanner;

/*
 * Zachariah King
 * Module 9.1 Assignment
 * 4/27/25
 * Description: A program exhibiting the use of ArrayList, Try-Catch Blocks, and Autoboxing/Auto-Unboxing.
 * A group of ten strings are are stored in an ArrayList and printed and then the Try-Catch format is used
 * to reprint a chosen element from the user.
 */
 
public class Program1 {
    public static void main(String[] args) {
        // Create an ArrayList to hold 10 strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add 10 different string values (Musicians)
        stringList.add("Lana Del Rey");
        stringList.add("Taylor Swift");
        stringList.add("Rihanna");
        stringList.add("Billie Eilish");
        stringList.add("Charli xcx");
        stringList.add("Ariana Grande");
        stringList.add("Beyonce");
        stringList.add("Britney Spears");
        stringList.add("Miley Cyrus");
        stringList.add("Kesha");

        // Print each string using a for-each loop
        System.out.println("List of Pop Stars:\n");
        for (String musician : stringList) {
            System.out.println(musician);
        }

        // Ask the user for the index they want to view again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the Star you'd like to see again: ");
        String input = scanner.nextLine();

        try {
            // Autoboxing: convert string input to Integer (wrapper class)
            Integer index = Integer.parseInt(input); // Auto-unboxing happens during get()

            // Try to print the element at the provided index
            System.out.println("Star at index " + index + ": " + stringList.get(index));
        } catch (IndexOutOfBoundsException e) {
            // Handle if user inputs a number outside of valid index range
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            // Handle if user enters non-numeric input
            System.out.println("Invalid input! Please enter a number.");
        }

        // Close scanner resource
        scanner.close();
    }
}