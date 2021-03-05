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
public class LifeInsuranceCalculatorTest {
    
    public LifeInsuranceCalculatorTest() {
    }


    

    @Test
    public void testCalculateInsurance() {
        System.out.println("CalculateInsurance");
        int inputAge = 33;
        int expResult = 465;
        int lifeInsurancePrice = LifeInsuranceCalculator.CalculateInsurance(inputAge);
        assertEquals(expResult, lifeInsurancePrice);
        
    }

    
    
}
