import java.util.ArrayList;

/*
 * Zachariah King
 * Module 7 Assignment
 * 4/20/25
 * Description: Enhanced Mod 6 Java program with a Fan class and UseFans class to demonstrate use of collections and methods.
 */

public class FanTest {
    
    public static void main(String[] args) {
        UseFans.main(args); // Delegating FanTest main method to UseFans main method
    }

    // Fan class
    static class Fan {
        // Constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        // Fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // No-arg constructor
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        // Constructor with arguments
        public Fan(int speed, boolean on, double radius, String color) {
            this.setSpeed(speed);
            this.setOn(on);
            this.setRadius(radius);
            this.setColor(color);
        }

        // Getters and setters using 'this'
        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int speed) {
            if (speed >= STOPPED && speed <= FAST) {
                this.speed = speed;
            } else {
                System.out.println("Invalid speed value.");
            }
        }

        public boolean isOn() {
            return this.on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Helper to convert speed to text
        public String getSpeedAsString() {
            switch (this.speed) {
                case SLOW: return "SLOW";
                case MEDIUM: return "MEDIUM";
                case FAST: return "FAST";
                default: return "STOPPED";
            }
        }
    }

    // New UseFans class
    static class UseFans {

        // Method to display a single fan without using toString
        public static void displayFan(Fan fan) {
            System.out.println("Fan Status:");
            System.out.println("  On: " + fan.isOn());
            System.out.println("  Speed: " + fan.getSpeedAsString());
            System.out.println("  Radius: " + fan.getRadius());
            System.out.println("  Color: " + fan.getColor());
            System.out.println();
        }

        // Method to display a collection of fans
        public static void displayFans(ArrayList<Fan> fans) {
            System.out.println("Displaying all fans:\n");
            for (int i = 0; i < fans.size(); i++) {
                System.out.println("Fan #" + (i + 1) + ":");
                displayFan(fans.get(i));
            }
        }

        // Test method
        public static void main(String[] args) {
            // Create collection of fans
            ArrayList<Fan> fanList = new ArrayList<>();

            // Add several fans
            fanList.add(new Fan(Fan.SLOW, true, 3.5, "blue"));
            fanList.add(new Fan(Fan.FAST, false, 5.0, "red"));
            fanList.add(new Fan(Fan.MEDIUM, true, 4.2, "green"));
            fanList.add(new Fan()); // default fan

            // Display individual fan
            System.out.println("Displaying a single fan (first in the list):");
            displayFan(fanList.get(0));

            // Display entire list
            displayFans(fanList);
        }
    }
}