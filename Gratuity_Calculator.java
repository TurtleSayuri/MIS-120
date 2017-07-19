import java.util.Scanner;

public class Gratuity_Calculator
{

    public static void main( String[] args )
    {
        double total = 0.0;
        double totalBill = 0.0;
        double gratuityPercentage = 0.0;
        double totalGratuity = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Enter your total bill: ");
        total = input.nextDouble();
        System.out.print ("Enter a percentage for gratuity: ");
        gratuityPercentage = input.nextDouble();
        
        totalGratuity = total * gratuityPercentage;
        
        totalBill = totalGratuity + total;
        
        System.out.println( "You have a total bill of $" + totalBill + " which consists of $" + total + " bill and a $" + totalGratuity + " tip");
    }
}