/*
 * Zachariah King
 * Module 10 Assignment
 * 5/4/25
 * Description: International division subclass
 */

// Subclass representing an international division
public class InternationalDivision extends Division {
    // Additional fields specific to international divisions
    private String country;
    private String language;

    // Constructor that initializes all fields, including those from the superclass
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Call the superclass constructor
        this.country = country;
        this.language = language;
    }

    // Implementation of the abstract display method
    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
