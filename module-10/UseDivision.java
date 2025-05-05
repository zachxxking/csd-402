/*
 * Zachariah King
 * Module 10 Assignment
 * 5/4/25
 * Description: Use division superclass and its subclasses - Main App
 */

// Main class to demonstrate usage of the Division classes
public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision objects
        InternationalDivision intDiv1 = new InternationalDivision("Asia Pacific", 101, "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Europe", 102, "Germany", "German");

        // Create two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("East Coast", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast", 202, "California");

        // Call display method on each to print their details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
