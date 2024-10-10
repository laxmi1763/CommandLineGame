package coinFlipSimulator;

import java.util.Random;

public class Coin {
    private String sideUp;

    public void flip() {
        Random random = new Random();
        int result = random.nextInt(2); // Generates 0 or 1
        if (result == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}
