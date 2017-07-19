import java.util.Scanner;
public class IfElseExample
{
   public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter radius: ");
         double radius = input.nextInt();
         double area;
         
         if (radius >=0){
         area = radius * radius * 3.14159;
         
         System.out.println("The area for the circle of radius " + radius
         + " is " + area);
         
         }
         
         else 
         {System.out.println("Negative input");
         }
         
      }
}