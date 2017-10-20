
package nimGame;

/**
 *
 * @author smithg
 */
public class Main {
    
    public static void main(String [] args){
        
        // Create a new nim game and play the game
        
        Game newGame = new Game(20, "smith");
        newGame.play();
        
        
    }
    
}
