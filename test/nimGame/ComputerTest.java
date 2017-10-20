/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nimGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smithg
 */
public class ComputerTest {
    
    public ComputerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of takeTurn method, of class Computer.
     */
    @Test
    public void testTakeTurn() {
        System.out.println("Test takeTurn:");  
        
        Pile  newPile = new Pile(6);
        Computer hal = new Computer();
        
        // loop to test random stone selection
        boolean pass = true;
        int [] ranTest = new int[8];// to save results and make sure they are random
        // try 100 attempts
        for (int i = 0; i < 100; i++){
            newPile.setStones(6);
            hal.takeTurn(newPile);
            ranTest[newPile.getStones()] ++; // save result to array
            if (newPile.getStones() > 5 || newPile.getStones() < 3 ){ // test out of range
                pass = false;
                break;
            }
        }        
        
        System.out.println("\tTest Random in range");
        assertTrue(pass);
        
        
        for ( int i = 3; i < ranTest.length; i ++){
            if (ranTest[i] == 100){ // test to make sure not removing same amount every time
                pass = false;
            }
        }
        
         System.out.println("\tTest Random value actually is random");
        assertTrue(pass);
        //System.out.println("***** Random stone selection pass: " + pass);
        
        // test AI win conditions
        int expWin = 1, expLose = 0;
        
        System.out.println("\tTest AI win condition stone selection");
        newPile.setStones(4);        
        hal.takeTurn(newPile);
        assertEquals(expWin, newPile.getStones());
        
        
        newPile.setStones(3);
        hal.takeTurn(newPile);
        assertEquals(expWin, newPile.getStones());
       
        
        newPile.setStones(2);        
        hal.takeTurn(newPile);
        assertEquals(expWin, newPile.getStones());
        
        System.out.println("\tTest AI stone selection force lose");
        newPile.setStones(1);        
        hal.takeTurn(newPile);
        assertEquals(expLose, newPile.getStones());
        
    }

    /**
     * Test of toString method, of class Computer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Computer instance = new Computer();
        String expResult = "An Artificial intelligence named Hal";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}