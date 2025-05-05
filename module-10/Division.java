/*
 * Zachariah King
 * Module 10 Assignment
 * 5/4/25
 * Description: Division abstract class
 */

// Abstract class representing a general company division
public abstract class Division {
    // Fields to store the name of the division and its account number
    protected String divisionName;
    protected int accountNumber;

    // Constructor to initialize divisionName and accountNumber
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void display();
}
