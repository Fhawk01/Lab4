/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Faith
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testCalculateBankChargesCase1() {
        System.out.println("CalculateBankCharges");
        int amountOfChecks = 5;
        double expResult = 10.5;
        double result = Main.CalculateBankCharges(amountOfChecks);
        assertEquals(expResult, result, 0.0);
        
    }
    
        @Test
    public void testCalculateBankChargesCase2() {
        System.out.println("CalculateBankCharges");
        int amountOfChecks = 25;
        double expResult = 12.0;
        double result = Main.CalculateBankCharges(amountOfChecks);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
    public void testCalculateBankChargesCase3() {
        System.out.println("CalculateBankCharges");
        int amountOfChecks = 45;
        double expResult = 13.6;
        double result = Main.CalculateBankCharges(amountOfChecks);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
    public void testCalculateBankChargesCase4() {
        System.out.println("CalculateBankCharges");
        int amountOfChecks = 65;
        double expResult = 15.2;
        double result = Main.CalculateBankCharges(amountOfChecks);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
