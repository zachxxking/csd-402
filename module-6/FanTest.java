/*
 * Zachariah King
 * Module 6 Assignment
 * 4/13/25
 * Description: A java program that contains a Fan class that has several attributes and methods that describe a fan's state.
 */

// FanTest class that contains the main method
public class FanTest {
    
    // Fan class defined
    static class Fan {
        // Constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        // Private fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // No-argument constructor
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        // Constructor with arguments
        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        // Getters and setters
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            if (speed >= STOPPED && speed <= FAST) {
                this.speed = speed;
            } else {
                System.out.println("Invalid speed value.");
            }
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // toString method
        @Override
        public String toString() {
            if (on) {
                return "Fan is ON [Speed: " + speedToString(speed) + ", Color: " + color + ", Radius: " + radius + "]";
            } else {
                return "Fan is OFF [Color: " + color + ", Radius: " + radius + "]";
            }
        }

        // Helper method to convert speed to text
        private String speedToString(int speed) {
            switch (speed) {
                case SLOW: return "SLOW";
                case MEDIUM: return "MEDIUM";
                case FAST: return "FAST";
                default: return "STOPPED";
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        System.out.println(defaultFan);

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.SLOW, true, 2, "pink");
        System.out.println("\nCustom Fan:");
        System.out.println(customFan);

        // Change properties of default fan
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(3.0);
        defaultFan.setColor("black");

        System.out.println("\nModified Default Fan:");
        System.out.println(defaultFan);
    }
}