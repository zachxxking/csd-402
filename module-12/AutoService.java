/*
 * Zachariah King
 * Assignment 12.2: Annual Auto Service Visit Cost Calculator
 * 5/18/25
 */

public class AutoService {

    // Constant for standard service charge
    static final double STANDARD_SERVICE_CHARGE = 150.00;

    // No parameters - return standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // One parameter - add oil change fee
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // Two parameters - add oil change and tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee;
    }

    // Three parameters - oil change, tire rotation, and coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        double total = STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee - coupon;
        return total < 0 ? 0 : total;  // Ensure cost is not negative
    }

    public static void main(String[] args) {
        // Test Method 1
        System.out.println("Test 1 - No parameters: $" + yearlyService());
        System.out.println("Test 2 - No parameters: $" + yearlyService());

        // Test Method 2
        System.out.println("Test 3 - One parameter (Oil): $" + yearlyService(49.99));
        System.out.println("Test 4 - One parameter (Oil): $" + yearlyService(55.00));

        // Test Method 3
        System.out.println("Test 5 - Two parameters (Oil + Tires): $" + yearlyService(49.99, 69.99));
        System.out.println("Test 6 - Two parameters (Oil + Tires): $" + yearlyService(55.00, 75.00));

        // Test Method 4
        System.out.println("Test 7 - Three parameters (Oil + Tires - Coupon): $" + yearlyService(49.99, 69.99, 50.00));
        System.out.println("Test 8 - Three parameters (Oil + Tires - Coupon): $" + yearlyService(55.00, 75.00, 100.00));
    }
}