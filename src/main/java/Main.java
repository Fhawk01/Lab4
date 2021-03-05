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
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    DecimalFormat df2 = new DecimalFormat("#.##");

    System.out.println("How many checks have you written this month: ");
    

    Scanner keyboard = new Scanner(System.in);
    int amountOfChecks = keyboard.nextInt();

   double serviceFee = CalculateBankCharges(amountOfChecks);
    
    System.out.println("Your service fee for this month is: $" + String.format("%.2f", serviceFee));
  }


  public static double CalculateBankCharges(int amountOfChecks){
    double result = 10;

    if (amountOfChecks < 20) {
      result += amountOfChecks * 0.1;
    } else if (amountOfChecks >= 20 || amountOfChecks <= 39) {
      result += amountOfChecks * 0.08;
    } else if (amountOfChecks >= 40 || amountOfChecks <= 59) {
      result += amountOfChecks * 0.06;
    } else {
      result += amountOfChecks * 0.04;
    }
    
    return result;
    
  }
  
}
