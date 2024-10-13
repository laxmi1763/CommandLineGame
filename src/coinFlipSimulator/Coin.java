/* Author Name: Laxmi Chari
Roll No: 22
Title: Program to implement a command line Game - Coin Flip Simulator
Start Date: 25/08/2024
Modified Date: 26/08/2024
Description: This program Generates a random value between 1 and 0 and gives heads and tails 
 */
package coinFlipSimulator;

import java.util.Random;

public class Coin {
    // The current side of the coin facing up ("Heads" or "Tails").
    private String sideUp;

    // The flip method simulates flipping the coin.
    public void flip() {
        // Create a Random object to generate random numbers.
        Random random = new Random();
        
        // Generate a random number: 0 or 1.
        int result = random.nextInt(2); // Generates 0 or 1
        
        // If the result is 0, set sideUp to "Heads", otherwise set it to "Tails".
        if (result == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    // This method returns the current side of the coin facing up.
    public String getSideUp() {
        return sideUp;
    }
}
