//Melissa deCastro
//March 30, 2017
//Chapter 7 Homework - 7.2 (pg 276)
// Create an array, load it with numbers
//Write a program that reads ten integers and displays
//them in the reverse of the order in which they were read.
import java.util.Scanner;
public class Reverse_Numbers_deCastro
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers = new int[10];
      for (int i = 0; i<numbers.length;i++)
      {
         System.out.print("Enter a number: ");
         numbers[i]=input.nextInt();
      }
      System.out.println();
      reversePrint(numbers);
   }
   
   public static void reversePrint(int[] numbers)
   {
      System.out.println("Inputted numbers in reverse order: ");
      for (int i = 0; i<numbers.length;i++)
      {
         System.out.println("Number " + (numbers.length-i) + ": " + numbers[9-i]);
      }
   }

}