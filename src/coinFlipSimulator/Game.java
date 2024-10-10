package coinFlipSimulator;

import java.util.Scanner;

public class Game {
    private Coin coin;

    public Game() {
        coin = new Coin();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            coin.flip();
            System.out.println("You flipped: " + coin.getSideUp());
            System.out.print("Do you want to flip again? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}