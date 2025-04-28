import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

/*
 * Zachariah King
 * Module 9.2 Assignment
 * 4/27/25
 * Description: A program exhibiting file handling with random integers. A file is created
 * and filled with 10 random integers and then it is closed and reopened to display the random data.
 */

public class Program2 {
    public static void main(String[] args) {
        // Define the file name
        File file = new File("data.file");

        // Create a random number generator
        Random random = new Random();

        try {
            // Attempt to create the file (if it doesn't already exist)
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                // If file exists, we will append to it
                System.out.println("File already exists. Appending data...");
            }

            // Open FileWriter in append mode (true)
            FileWriter writer = new FileWriter(file, true);

            // Write 10 random integers (0-99) separated by spaces
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); // Generate number between 0 and 99
                writer.write(randomNum + " ");
            }

            // Close the FileWriter
            writer.close();

            // Reopen the file to read and display its content
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("File content:");
            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();

        } catch (IOException e) {
            // Handle any I/O exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}