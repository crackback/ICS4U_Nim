/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nimGame;

/**
 *
 * @author smithg
 */
public class Tests {
    public static void main(String[] args){
        
        // Uncomment sections as necessary to test your code
        
        
//         pile class tests
//        Pile myPile;
//        
//        myPile = new Pile(20);
//        
//        System.out.println(myPile); // "this is a pile with 20 stones"
//        
//        myPile.removeStones(3); 
//        
//        System.out.println(myPile); // "this is a pile with 17 stones"
//        
//        System.out.println(myPile.getStones()); // 17
//        
//        System.out.println(myPile.isGameOver()); // false
//        
//        myPile.removeStones(17);
//        
//        System.out.println(myPile.isGameOver()); // true
        
        
        
        
        //player class tests
        
        Pile  testPile = new Pile(4);
        
        Player human = new Player("foo");
        
        System.out.println(human); //"Player: foo"
        
         // pile with 4 stones        
        human.takeTurn(testPile); // offers option to remove one two or three stones > human removes 2 stones
        
        human.takeTurn(testPile); // only offers option to remove one or two stones 
                                  // try to remove 3 it should prevent and repeat question
                                  // remove 1 stone
        
        human.takeTurn(testPile); // only offers option to remove one stone // remove 1        
  
        
        System.out.println(testPile); // pile with 0 stones
        
        
        
        
        // Computer class tests
        
//        Pile  newPile = new Pile(6);
//        Computer hal = new Computer();
//        
//        System.out.println(hal);
//        
//        // loop to test random stone selection
//        boolean pass = true;
//        int [] ranTest = new int[8];// to save results and make sure they are random
//        // try 100 attempts
//        for (int i = 0; i < 100; i++){
//            newPile.setStones(6);
//            hal.takeTurn(newPile);
//            ranTest[newPile.getStones()] ++; // save result
//            if (newPile.getStones() > 5 || newPile.getStones() < 3 ){ // test out of range
//                pass = false;
//                break;
//            }
//        }
//        for ( int i = 3; i < ranTest.length; i ++){
//            if (ranTest[i] == 100){ // test to make sure not removing same amount every time
//                pass = false;
//            }
//        }
//        System.out.println("***** Random stone selection pass: " + pass);
//        
//        // test win conditions
//        
//        newPile.setStones(4);
//        
//        hal.takeTurn(newPile);
//        
//        System.out.println("***** " + newPile); // Pile with 1 Stone
//        
//        newPile.setStones(3);
//        
//        hal.takeTurn(newPile);
//        
//        System.out.println("***** " + newPile); // Pile with 1 Stone
//        
//        newPile.setStones(2);
//        
//        hal.takeTurn(newPile);
//        
//        System.out.println("***** " + newPile); // Pile with 1 Stone
//        
//        newPile.setStones(1);
//        
//        hal.takeTurn(newPile);
//        
//        System.out.println("***** " + newPile); // Pile with 0 Stones
        
    }
    
}
