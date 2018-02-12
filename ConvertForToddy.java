import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvertForToddy
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("In ounces, enter how much coffee you have: ");
      double coffeeAmount=0;
      if (input.hasNextDouble())
      
      {
         coffeeAmount = input.nextDouble();
      }
      
      else
      {
         System.out.print("Please enter a number. ");
      }
      if (coffeeAmount>0)
      {
         DecimalFormat df = new DecimalFormat("##.###");
         double WATERRATIO = 4.667; //1 oz of coffee to 4.667 fl oz of coffee
         double waterConvert = 28.3809524; //1 fl oz of water = 28.3809524 grams
         double coffeeConvert = coffeeAmount*28.3495; //1 oz = 28.3495 grams
         //takes the coffee in ounces because I haven't done how much grams you need per gram of coffee)
         double waterNeeded = coffeeAmount*(waterConvert*WATERRATIO);
         System.out.println("For "+ (df.format(coffeeConvert)) + " grams of coffee, you need " + (df.format(waterNeeded)) + " grams of water.");
         System.out.println();
         directions(coffeeConvert, waterNeeded);
      }
      else if (coffeeAmount==0)
      {
         System.out.print("Please enter an amount greater than 0. ");
      }
      else if (coffeeAmount<0)
      {
         System.out.print("Please enter an amount greater than 0. ");
      }
   }
   public static void directions(double coffeeConvert, double waterNeeded)
   {
   //step 1: 8 fl oz of water, 6 oz of coffee
      double step1Water = waterNeeded*0.142857143;
      double step2Water = waterNeeded*0.428571429;
      double step3Water = waterNeeded*0.428571429;
      DecimalFormat df = new DecimalFormat("##.###");
       
      System.out.println(
         "Step 1: Add " + (df.format(step1Water)) + " grams of water and " + (df.format(coffeeConvert/2)) + " grams of coffee.");
      System.out.println(
         "Step 2: Add " + (df.format(step2Water)) + " grams of water and " + (df.format(coffeeConvert/2)) + " grams of coffee.");
      System.out.println(
         "Step 3: Wait 5 minutes. Then, add " + (df.format(step3Water)) + " grams of water.");
   }
}