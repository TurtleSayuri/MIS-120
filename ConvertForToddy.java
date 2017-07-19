import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvertForToddy
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("In ounces, enter how much coffee you have:");
      int coffeeAmount = input.nextInt();
      double WATERRATIO = 4.667;
      double waterNeeded = coffeeAmount*WATERRATIO;
      System.out.println("For "+ coffeeAmount + " ounces of coffee, you need " + waterNeeded + " fluid ounces of water.");
      System.out.println();
      directions(coffeeAmount, waterNeeded);
   }
   public static void directions(int coffeeAmount, double waterNeeded)
   {
   //step 1: 8 fl oz of water, 6 oz of coffee
      double step1Water = waterNeeded*0.142857143;
      double step2Water = waterNeeded*0.428571429;
      double step3Water = waterNeeded*0.428571429;
      DecimalFormat df = new DecimalFormat("##.###");
       
      System.out.println(
         "Step 1: Add " + (df.format(step1Water)) + " fluid ounces of water and " + (coffeeAmount/2) + " ounces of coffee.");
      System.out.println(
         "Step 2: Add " + (df.format(step2Water)) + " fluid ounces of water and " + (coffeeAmount/2) + " ounces of coffee.");
      System.out.println(
         "Step 3: Wait 5 minutes. Then, add " + (df.format(step3Water)) + " fluid ounces of water.");
   }
}