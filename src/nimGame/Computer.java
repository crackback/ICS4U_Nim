
package nimGame;

/**
 *
 * @author smithg
 */
public class Computer {
    
    private String name;
    
    
    /**
     * Constructs a computer object whose
     * name is set to hal.
     * 
     * pre: none
     * post: A computer object is created.
     */
    public Computer(){
        name = "Hal";
    }
    
    /**
     * The computer will remove one to three stones from the pile supplied
     * as an argument. The computer should check the number of stones in
     * the pile. If the next move is winnable the computer will remove the
     * appropriate number of stones required to win the game. 
     * Otherwise it removes a random number between one and three.
     * 
     * pre: none
     * post: one to three stones are removed from the pile
     * 
     * @param p the pile to remove stones from
     */
    public void takeTurn(Pile p){
        
        int numAvailable = p.getStones();
        int remove;
        
        if (numAvailable > 4){
            remove = (int)(Math.random() * 3 + 1);
        } else if (numAvailable == 1){
            remove = 1;
        }  else {
            remove = numAvailable - 1;
        }
        
        System.out.println(name + " removes " + remove + " stones.");
        p.removeStones(remove);
        
    }
    
    
    /**
     * Returns a string representing the computer object.
     * 
     * pre: none
     * post: a string is returned
     * 
     * @return String
     */
    @Override
    public String toString(){
        return "An Artificial intelligence named " + name;
                
    }
   
    void secondTest(){
        
    }
}
