//Melissa deCastro
//February 14, 2017
//MIS 120 - Exam #1
import java.util.Scanner;

public class TaxCalculator_deCastro
{
   public static void main(String[]args)
   {
      final double TAXRATE = 0.35; //constant
      double income = 0.0;
      double taxPaid = 0.0;
      double taxOwed = 0.0;
      double refund = 0.0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print ("Enter your income: ");
      income = input.nextDouble();
      taxOwed = income * TAXRATE;
      
      System.out.print ("Enter the tax you paid: ");
      taxPaid = input.nextDouble();
      refund = taxPaid-taxOwed;
      
      if (refund>0)
      {
         System.out.print ("You have a refund of " + refund);
      }
      else
      {
         refund = refund*-1;
         System.out.print ("You owe taxes of " + refund);
      }
   }
   
}