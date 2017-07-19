//Melissa deCastro
//February 21, 2017
//MIS 120 - Ch 4 Homework
import java.util.Scanner;

public class ValidateSSN_deCastro
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
            if (Character.isDigit(social.charAt((0))))
            {
               if (Character.isDigit(social.charAt((1))))
               {
                  if (Character.isDigit(social.charAt((2))))
                  {
                     if (Character.isDigit(social.charAt((4))))
                     {
                        if (Character.isDigit(social.charAt((5))))
                        {
                           if (Character.isDigit(social.charAt((7))))
                           {
                              if (Character.isDigit(social.charAt((8))))
                              {
                                 if (Character.isDigit(social.charAt((9))))
                                 {
                                    if (Character.isDigit(social.charAt((10))))
                                    {validSSN(social);}
                                    else
                                    {invalidSSN(social);}
                                 }
                                 else
                                 {invalidSSN(social);}
                              }
                              else
                              {invalidSSN(social);}
                           }
                           else
                           {invalidSSN(social);}
                        
                        }
                        else
                        {invalidSSN(social);}
                     }
                     else
                     {invalidSSN(social);}
                  }
                  else
                  {invalidSSN(social);}
               }
               else
               {invalidSSN(social);}
            }
            else
            {invalidSSN(social);}
         }
         else
         {invalidSSN(social);}
      }
      else
      {
         invalidSSN(social);
      }
   }
   public static void invalidSSN(String social)
   {
      System.out.println(social + " is not a valid social security number.");
   }
   public static void validSSN(String social)
   {
      System.out.println(social + " is a valid social security number.");
   }
}