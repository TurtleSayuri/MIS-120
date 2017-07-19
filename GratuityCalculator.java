//Melissa deCastro
//February 14, 2017
//MIS 120 - Exam #1

import java.util.Scanner;
public class GratuityCalculator
{
   public static void main (String[]args)
   {
      double total;
      double totalBill;
      double gratuityPercentage;
      double totalGratuity;
      double grandTotal;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your total bill: ");
      total = input.nextDouble();
      
      if (total !=
      
      System.out.print("Enter a percentage for a gratuity: ");
      gratuityPercentage = input.nextDouble();
      
      totalGratuity = total * gratuityPercentage;
      totalBill = total + totalGratuity;
      
      System.out.println("You have a total bill of " + totalBill +
      " which consists of " + total + " bill and a " + totalGratuity + " tip.");
   }
}
       