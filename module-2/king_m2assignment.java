{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
 * Program: Rock Paper Scissors Simulator\
 * Author: Zachariah King\
 * Date: 3/30/25\
 * M2 Assignment\
 */\
\
import java.util.Random;\
import java.util.Scanner;\
\
public class RockPaperScissors \{\
\
    public static void main(String[] args) \{\
        // Create a scanner object to read user input\
        Scanner scanner = new Scanner(System.in);\
        \
        // Display a welcome message\
        System.out.println("Welcome to Rock-Paper-Scissors!");\
        \
        // Prompt user for their choice\
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");\
        int userChoice = scanner.nextInt();\
        \
        // Ensure the user enters a valid choice\
        while (userChoice < 1 || userChoice > 3) \{\
            System.out.println("Invalid input. Please enter 1 for Rock, 2 for Paper, or 3 for Scissors:");\
            userChoice = scanner.nextInt();\
        \}\
        \
        // Generate computer's choice (1 for Rock, 2 for Paper, 3 for Scissors)\
        Random random = new Random();\
        int computerChoice = random.nextInt(3) + 1; // Random number between 1 and 3\
        \
        // Display choices\
        System.out.println("Your choice: " + choiceToString(userChoice));\
        System.out.println("Computer's choice: " + choiceToString(computerChoice));\
        \
        // Determine the winner\
        String result = determineWinner(userChoice, computerChoice);\
        \
        // Display the result\
        System.out.println(result);\
    \}\
\
    // Method to convert numerical choice to string (Rock, Paper, Scissors)\
    public static String choiceToString(int choice) \{\
        switch (choice) \{\
            case 1: return "Rock";\
            case 2: return "Paper";\
            case 3: return "Scissors";\
            default: return "Invalid choice";\
        \}\
    \}\
    \
    // Method to determine the winner of the game\
    public static String determineWinner(int userChoice, int computerChoice) \{\
        if (userChoice == computerChoice) \{\
            return "It's a tie!";\
        \} else if ((userChoice == 1 && computerChoice == 3) || \
                   (userChoice == 2 && computerChoice == 1) || \
                   (userChoice == 3 && computerChoice == 2)) \{\
            return "You win!";\
        \} else \{\
            return "You lose!";\
        \}\
    \}\
\}}