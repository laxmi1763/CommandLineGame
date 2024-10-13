/* Author Name: Laxmi Chari
Roll No: 22
Title: Program to implement a command line Game - Coin Flip Simulator
Start Date: 25/08/2024
Modified Date: 26/08/2024
Description: This is the main class where ait creates a object of Game class and starts the game. 
 */

package coinFlipSimulator;

public class CoinFlipSimulator {
    // The main method.
    public static void main(String[] args) {
        // Create an instance of the Game class.
        Game game = new Game();
        
        // Start the game, which allows the user to flip a coin repeatedly.
        game.start();
    }
}
