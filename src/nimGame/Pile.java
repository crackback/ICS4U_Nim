package nimGame;

/**
 *
 * @author smithg
 */
public class Pile {

    private int numStones;

    /**
     * Constructor creates a pile with the number of stones supplied by the
     * argument.
     *
     * pre: none post: A pile object is created.
     *
     * @param start int representing number of stones
     */
    public Pile(int start) {
        numStones = start;
    }

    public int getStones() {
        return numStones;
    }

    /**
     * Sets number of stones in pile.
     *
     * pre: none post: numStones is set to number supplied as argument
     *
     *  *added to simplify testing of computer class
     *
     * @param num int representing number of stones in pile
     */
    public void setStones(int num) {
        numStones = num;

    }

    /**
     * Removes stones from the pile
     *
     * pre: none post: The number of stones is decreased by num.
     *
     * @param num int representing the number of stones to remove.
     */
    public void removeStones(int num) {
        numStones -= num;
    }

    /**
     * Returns true if pile is empty
     *
     * pre: none post: Boolean returned.
     *
     * @return Boolean
     */
    public boolean isGameOver() {
        return numStones == 0;
    }

    /**
     * A string representing the pile object including the number of stones
     * contained in the pile.
     *
     * pre: none post: A string is returned
     *
     * @return String
     */
    @Override
    public String toString() {
        return "This is a pile with " + numStones + " stones.";
    }
}
