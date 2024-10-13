/* Author Name: Laxmi Chari
Roll No: 22
Title: Program to implement a command line Game - Coin Flip Simulator
Start Date: 25/08/2024
Modified Date: 26/08/2024
Description: This class sees the overall functionality of the game and gives the output. 
 */

package coinFlipSimulator;

import java.util.Scanner;

public class Game {
    // The Game class contains a Coin object to simulate coin flips.
    private Coin coin;

    // Constructor: Initializes a new Game and creates a Coin object.
    public Game() {
        coin = new Coin();
    }

    // The start method runs the game where the user can flip the coin repeatedly.
    public void start() {
        // Creating a Scanner object to take user input.
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Loop to allow multiple coin flips until the user decides to stop.
        do {
            // Flip the coin and display the result.
            coin.flip();
            System.out.println("You flipped: " + coin.getSideUp());
            
            // Asking the user if they want to flip again.
            System.out.print("Do you want to flip again? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();  // Taking and processing user input
        } while (choice.equals("yes"));  // Continue flipping if the user says "yes".

        // Thanking the user once they decide to stop playing.
        System.out.println("Thanks for playing!");

        // Closing the Scanner object to free up resources.
        scanner.close();
    }
}
