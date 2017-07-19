//Melissa deCastro
//March 3, 2017
//MIS 120 - Ch 5 Homework
//look at pg 79

public class Test_deCastro
{

   public static void main(String[] args)
   {
      //constants for spacing
      final String THREE_SPACING = "   ";
      final String FOUR_SPACING = "    ";
      final String FIVE_SPACING = "     ";
      final String THIRTEEN_SPACING = "             ";
      final String FOURTEEN_SPACING = "              ";
      //header
      System.out.println(FOUR_SPACING + "Numbers Divisble by 5 or 6");
      System.out.println(FOUR_SPACING + "Divisble by 5" + THREE_SPACING + "Divisble by 6");
      System.out.println("------------------------------");
      //numbers listed
      for (int i = 10; i <= 100; i++)
      {
         System.out.printf("%4s", i + "|");
         if (i%5==0 && i%6==0)
         {
            System.out.print(FOUR_SPACING + "Yes" + THIRTEEN_SPACING + "Yes");
         }
         if (i%5==0 && i%6!=0)
         {
            System.out.print(FOUR_SPACING + "Yes" + THIRTEEN_SPACING + "No");
         }
         if (i%5!=0 && i%6==0)
         {
            System.out.print(FOUR_SPACING + "No" + FOURTEEN_SPACING + "Yes");
         }
         if (i%5!=0 && i%6!=0)
         {
            System.out.print(FOUR_SPACING + "No" + FOURTEEN_SPACING + "No");
         }
         System.out.println();
      }
   }
}