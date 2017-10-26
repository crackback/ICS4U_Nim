/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nimGame;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
public class PlayerTest {
    /**
     * Test of takeTurn method, of class Player.
     */
    @Test
    public void testTakeTurn() {
        System.out.println("takeTurn");
        
        // change input stream to force input from string
        String input;// var to hold input required for this test
        InputStream in ; //input stream to feed Scanner
        
        Pile p = new Pile(10);
        Player instance = new Player("TestPlayer");
        
        System.out.println("\tTesting remove 1, 2, 3,");
            // test remove 3           
            input = "3"; // set up input data for scanner
            // create stream
            in = new ByteArrayInputStream(input.getBytes());
            // redirect Scanner
            System.setIn(in);
            
            instance.takeTurn(p);        
            int expectedPile = 7;
            int actualPile = p.getStones();        
            assertEquals(expectedPile,actualPile);

            // test remove 2
            input = "2"; 
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            
            instance.takeTurn(p);        
            expectedPile = 5;
            actualPile = p.getStones();        
            assertEquals(expectedPile,actualPile);

            // test remove 1
            input = "1"; 
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            
            instance.takeTurn(p);        
            expectedPile = 4;
            actualPile = p.getStones();        
            assertEquals(expectedPile,actualPile);
            
        
        System.out.println("\tUser prompts:");
            // Stream to collect print statements
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            // redirects System.out stream from console to outContent stream
            System.setOut(new PrintStream(outContent));            
            
            // Test pile of 3
            input = "1"; 
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            
            p.setStones(3);
            instance.takeTurn(p);
            assertEquals("Would you like to remove 1, 2, or 3 stones: ", outContent.toString());
            // clear output stream
            outContent.reset();
        
            // Test  pile of 2
             input = "1"; 
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            
            p.setStones(2);
            instance.takeTurn(p);
            assertEquals("Would you like to remove 1, or 2 stones: ", outContent.toString());
            // clear output stream
            outContent.reset();
            
            // Test pile of 1
            input = "1"; 
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            
            p.setStones(1);
            instance.takeTurn(p);
            assertEquals("You must take the last stone: ", outContent.toString());
            // clear output stream
            outContent.reset();
            
            /************** Needs work ************/
            // Test invalid choices
//            input = "4 1"; 
//            in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            
//            p.setStones(2);
//            instance.takeTurn(p);
//            String expected = "21temp"+ " " +"21";            
//            assertEquals(expected, outContent.toString());

            // clear output stream
            outContent.reset();
            
            
            // set output stream back to console
            System.setOut(null);

            
            
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player("TestPlayer");
        String expResult = "Player TestPlayer";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
}