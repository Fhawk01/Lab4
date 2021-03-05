/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
import java.util.Scanner;
import javax.swing.*;

class LifeInsuranceCalculator {
  public static void main(String[] args) {

    System.out.println("Please enter your age:");
    Scanner keyboard = new Scanner(System.in);
    int inputAge = keyboard.nextInt();
    
    
    int lifeInsurancePrice = CalculateInsurance(inputAge);

    System.out.println("Your life insurance would cost $" + lifeInsurancePrice + "/year");
  }
  public static int CalculateInsurance( int inputAge)
  {
        int lifeInsurancePrice = (inputAge) * 5 + 300;
        
        return lifeInsurancePrice;

    
  }
}
