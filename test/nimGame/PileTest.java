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
public class PileTest {

    /**
     * Test of getStones method, of class Pile.
     */
    @Test
    public void testGetStones() {
        System.out.println("getStones");

        // Case 1
        Pile instance = new Pile(20);
        int expResult = 20;
        int result = instance.getStones();
        assertEquals(expResult, result);

        //Case 2
        Pile instance1 = new Pile(15);
        int expResult1 = 15;
        int result1 = instance1.getStones();
        assertEquals(expResult1, result1);
    }

    /**
     * Test of setStones method, of class Pile.
     */
    @Test
    public void testSetStones() {
        System.out.println("setStones");

        Pile instance = new Pile(20);

        //Case 1
        instance.setStones(15);
        int expResult = 15;
        int result = instance.getStones();
        assertEquals(expResult, result);

        //Case 2
        instance.setStones(7);
        int expResult1 = 7;
        int result1 = instance.getStones();
        assertEquals(expResult1, result1);
    }

    /**
     * Test of removeStones method, of class Pile.
     */
    @Test
    public void testRemoveStones() {
        System.out.println("removeStones");

        Pile instance = new Pile(20);

        //Case 1
        int expResult = 17;
        instance.removeStones(3);
        assertEquals(expResult, instance.getStones());

        // Case 2
        int expResult1 = 16;
        instance.removeStones(1);
        assertEquals(expResult1, instance.getStones());
    }

    /**
     * Test of isGameOver method, of class Pile.
     */
    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");

        // Case 1
        Pile instance = new Pile(20);
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);

        //Case 2
        Pile instance1 = new Pile(0);
        boolean expResult1 = true;
        boolean result1 = instance1.isGameOver();
        assertEquals(expResult1, result1);
    }

    /**
     * Test of toString method, of class Pile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        //Case 1
        Pile instance = new Pile(20);
        String expResult = "This is a pile with 20 stones.";
        String result = instance.toString();
        assertEquals(expResult, result);


        //Case 2
        Pile instance1 = new Pile(7);
        String expResult1 = "This is a pile with 7 stones.";
        String result1 = instance1.toString();
        assertEquals(expResult1, result1);

    }
}