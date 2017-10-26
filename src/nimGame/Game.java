package nimGame;

/**
 *
 * @author smithg
 */
public class Game {

    private Pile gamePile;
    private Player human;
    private Computer ai;
    private char turn;

    /**
     * Constructs a new nim game containing a pile object, a player object and a
     * computer object.
     *
     * pre: none post: A Nim game object is created.
     *
     * @param p An integer representing the number of stones for the pile to
     * start with
     * @param pn A string representing the player's name
     */
    public Game(int p, String pn) {
        gamePile = new Pile(p);
        human = new Player(pn);
        ai = new Computer();
        turn = 'p';
    }

    /**
     * Plays a complete Nim game alternating turns between player and computer.
     * Reports winner when pile is reduced to zero stones.
     *
     * pre: Pile object must contain one or more stones post: Pile object
     * reduced to 0 stones and winner is reported.
     *
     */
    public void play() {
        do {
            System.out.println("\n" + gamePile);
            if (turn == 'p') {
                human.takeTurn(gamePile);
                turn = 'c';
            } else {
                ai.takeTurn(gamePile);
                turn = 'p';
            }
        } while (!gamePile.isGameOver());

        if (turn == 'p') {
            System.out.println(human + " wins!");
        } else {
            System.out.println(ai + " wins!");
        }
    }
}
