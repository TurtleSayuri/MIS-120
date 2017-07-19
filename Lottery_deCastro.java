//Melissa deCastro
//March 9, 2017
//MIS 120 - Exam #2

public class Lottery_deCastro
{

   public static void main(String[] args)
   {
      int lotteryNumber1 = 0;
      int lotteryNumber2 = 0;
      int lotteryNumber3 = 0;
      boolean invalidInput = true; //true, bad data. false, good data.
      
      while (invalidInput == true) //single = is assignment, double = is comparison
      {
         lotteryNumber1=(int)(Math.random()*49);
         lotteryNumber2=(int)(Math.random()*49);
         lotteryNumber3=(int)(Math.random()*49);
         
         if (lotteryNumber1!=lotteryNumber2
         && lotteryNumber1!=lotteryNumber3
         && lotteryNumber2!=lotteryNumber3)
         {
            invalidInput = false;
            break;
         }
      }
      //System.out.println("The three lottery numbers are "
      //      + lotteryNumber1
      //      + ", " + lotteryNumber2
      //      + ", and " + lotteryNumber3);
      printNumbers(lotteryNumber1, lotteryNumber2, lotteryNumber3);
      
   }
   public static void printNumbers(int num1, int num2, int num3)
   {
      /*System.out.println("The three lottery numbers are "
           + num1
            + ", " + num2
            + ", and " + num3);*/
      //sorting alg
      int temp;
      if(num1 > num2)
      {
         temp = num1;
         num1 = num2;
         num2 = temp;
      } 
      
      if (num2 > num3) 
      {
         temp = num2; 
         num2 = num3;
         num3 = temp;
      }
      
      if (num1 > num3)
      {
         temp = num1;
         num1 = num3;
         num3 = temp;
      }
      
      if(num1 > num2)
      {
         temp = num1;
         num1 = num2;
         num2 = temp;
      } 
      
      System.out.printf("The three lottery numbers are %d, %d, and %d", num1, num2, num3);
   }
}
