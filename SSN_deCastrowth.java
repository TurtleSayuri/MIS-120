//Melissa deCastro
//February 21, 2017
//MIS 120 - Ch 4 Homework
import java.util.Scanner;

public class SSN_deCastro
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your Social Security Number(SSN): ");
      String social = input.next();
      if (social.length() == 11)
      {
         if (social.charAt(3) == '-' && social.charAt(6) == '-')
         {
         if (Character.isDigit(social.charAt(0) & (1)))
            {
            yay(social);
            }
            else
            {
            nah(social);
            }
         }
         else
         {
         nah(social);
         }
      }
      else
      {
      nah(social);
      }
   }
   public static void nah(String social)
   {
   System.out.println(social + " is not a valid social security number.");
   }
   public static void yay(String social)
   {
   System.out.println(social + " is a valid social security number.");
   }
}