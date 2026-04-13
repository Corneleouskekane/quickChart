/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package corneleouskekane.seiarachat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.engine.TestTag;

/**
 *
 * @author corneleous
 */
public class SeiaraChatTest {
    
    public SeiaraChatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SeiaraChat.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SeiaraChat.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
      // unit test are giving me a challenge
    public void testPasswordCompl (){
        String testData = "CH&&sec@ke99!";
        boolean result = SeiaraChat.isValidPassword(testData);
        assertTrue(SeiaraChat.isValidPassword(result));
    }
    
    public void testCellphoneNumber() {
        
        String testData = "+27838968976";
        String result = SeiaraChat.isValidCellPhoneNumber(testData);
        assertEquals("cellphone succesfully captured" , result);
    
}
    public void testFCellphoneNumber() {
        
        String testData = "08966553";
        String result = SeiaraChat.isValidCellPhoneNumber(testData);
        assertEquals("cellphone number is incorrectly formatted or does not contain intenational code please correct number and try again" , result);
    }
    
   // im trying to unit test multiple scenarios
    public void testUserNameValid(){
        SeiaraChat seiraChat = new SeiaraChat();
        assertTrue(seiraChat.isValidUsername("Samuel"));
        assertFalse(seiraChat.isValidUsername("Sam Uel"));
        assertFalse(seiraChat.isValidUsername("samuel"));
        assertFalse(seiraChat.isValidUsername(""));
        
    }
    
}
