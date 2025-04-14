/*
 * Zachariah King
 * Module 5 Assignment
 * 4/13/25
 * Description: Here is a java program that finds the largest and smallest elements within 2D arrays, for both int[][] and double[][] arrays.
 */

// Main method to test four methods
public class ArrayLocationTest {

    public static void main(String[] args) {
        // Sample int 2D array
        int[][] intArray = {
            {3, 7, 9},
            {9, 2, 2},
            {6, 6, 0}
        };

        // Sample double 2D array
        double[][] doubleArray = {
            {3.5, 7.2, 1.1},
            {9.1, 5.2, 2.6},
            {3.3, 6.9, 0.0}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest in int[][] located at: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest in int[][] located at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");

        System.out.println("Largest in double[][] located at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest in double[][] located at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }

    // Method to find the largest element in double[][] array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the largest element in an int[][] array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the smallest element in a double[][] array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    
    // Method to find the smallest element in an int[][] array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}