package nimGame;

import java.util.Scanner;

/**
 *
 * @author smithg
 */
public class Player {

    String name;

    /**
     * Constructor
     *
     * pre: none post: A player object is created.
     *
     * @param n String representing player's name
     */
    public Player(String n) {
        name = n;
    }

    /**
     * Allows the player to remove stones from the pile. Checks number of stones
     * in pile and only allows valid moves of one two or three.
     *
     * pre: pile must contain > 0 stones post: pile size decreased by 1, 2 or 3
     *
     * @param Pile p
     */
    public void takeTurn(Pile p) {
        int choice;
        String prompt = "";
        int numAvailable = p.getStones();
        boolean runLoop = true;
        Scanner in = new Scanner(System.in);
       
        do {
            if (numAvailable > 2) {
                prompt = ("Would you like to remove 1, 2, or 3 stones: ");
            } else if (numAvailable == 2) {
                prompt = ("Would you like to remove 1, or 2 stones: ");
            } else if (numAvailable == 1) {
                prompt = ("You must take the last stone: ");
            }

            System.out.print(prompt);
            choice = in.nextInt();
            if (choice <= numAvailable && choice <= 3 && choice > 0) {
                p.removeStones(choice);
                runLoop = false;
            } else {
                System.out.println("That is not a valid number of Stones to remove. Try again.");
            }
        } while (runLoop);
    }

    /**
     * Returns a string representing the player object. pre: none post: A string
     * is returned
     *
     * @return String
     */
    public String toString() {
        return "Player " + name;
    }
}
