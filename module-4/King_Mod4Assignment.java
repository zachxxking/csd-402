/*
 * Zachariah King
 * Module 4 Assignment
 */

public class ArrayAverage {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test data: arrays of different sizes
        short[] shortArray = {6, 12, 18, 24, 30};
        int[] intArray = {10, 20, 30, 40, 50, 60};
        long[] longArray = {50L, 100L, 150L};
        double[] doubleArray = {1.5, 2.4, 3.1, 4.6};

        // Test the average methods and display results
        System.out.println("Short array: ");
        System.out.println("Original array: " + arrayToString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int array: ");
        System.out.println("Original array: " + arrayToString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long array: ");
        System.out.println("Original array: " + arrayToString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double array: ");
        System.out.println("Original array: " + arrayToString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }

    // Helper method to convert array to a string for easy printing
    public static String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}