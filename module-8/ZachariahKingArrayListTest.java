import java.util.ArrayList;
import java.util.Scanner;

/*
 * Zachariah King
 * Module 8 Assignment
 * 4/27/25
 * Description: A program using ArrayList to get and store integer-type input from the user and then output the largest integer in the dataset.
 */

public class ZachariahKingArrayListTest {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to hold Integer values entered by the user
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers, pressing Enter after each one (enter 0 to stop and include it in the list):");

        // Loop to read integers from the user until 0 is entered
        while (true) {
            try {
                // Read the next line and parse it as an integer
                int input = Integer.parseInt(scanner.nextLine());

                // Add the input to the ArrayList
                numbers.add(input);

                // If the input is 0, break the loop (0 is also stored in the list)
                if (input == 0) {
                    break;
                }

            } catch (NumberFormatException e) {
                // If the input is not a valid integer, show an error message
                System.out.println("Please enter a valid integer.");
            }
        }

        // Call the max method and store the result
        Integer maxValue = max(numbers);

        // Display the maximum value to the user
        System.out.println("The largest value in the list is: " + maxValue);

        // Close the Scanner
        scanner.close();
    }

    public static Integer max(ArrayList list) {
        // If the list is null or has no elements, return 0
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Assume the first element is the maximum to start with
        Integer max = (Integer) list.get(0);

        // Loop through the list to find the maximum value
        for (Object obj : list) {
            Integer number = (Integer) obj; // Cast each object to Integer

            // Update max if a larger value is found
            if (number > max) {
                max = number;
            }
        }

        // Return the maximum value found
        return max;
    }
}