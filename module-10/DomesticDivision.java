/*
 * Zachariah King
 * Module 10 Assignment
 * 5/4/25
 * Description: Domestic division subclass
 */

// Subclass representing a domestic division
public class DomesticDivision extends Division {
    // Additional field specific to domestic divisions
    private String state;

    // Constructor that initializes all fields, including those from the superclass
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Call the superclass constructor
        this.state = state;
    }

    // Implementation of the abstract display method
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
