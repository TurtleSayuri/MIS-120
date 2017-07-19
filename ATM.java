//Melissa deCastro
//May 11, 2017 - ATM Test

import java.util.Date;
import java.util.Scanner;
import java.lang.*;

public class ATM 
{
   public static void main(String[] args)
   {
      
      //Savings or checking account?
      System.out.print("Would you like to access a Savings Account or Checking Account?" +
         "\nInput '1' for Savings Account.\nInput '2' for Checking Account."
         + "\nInput: ");
      Scanner input1 = new Scanner(System.in);
      String accountType=input1.next(); //checking input
      System.out.println();
      //SAVINGS ACCOUNT
      if(accountType.charAt(0)=='1')
      {
         System.out.println("Yay you have an Savings Account with us!");
         accountType="Savings Account";
         SavingsAccount savingsAccount = new SavingsAccount();
         Scanner input2 = new Scanner(System.in);
         System.out.print("What is your Savings Account number? "); //account# input
         savingsAccount.setId(input2.nextInt());
      
         //Do you want to withdraw, deposit, or see balance?
         System.out.println();
      
         System.out.print("For your " + accountType
            + ", Please select one of the following options:"
            + "\na: See balance & account information"
            + "\nb: Withdraw Money"
            + "\nc: Deposit Money"
            + "\nInput: ");
         Scanner input3 = new Scanner(System.in);
         String action=input3.next();
      
      //display balance
         if(action.charAt(0)=='a'||action.charAt(0)=='A')
         {
            System.out.println(savingsAccount);
         }
      //withdraw money
         if(action.charAt(0)=='b'||action.charAt(0)=='B')
         {
            System.out.println("How much would you like to deposit?");
            Scanner input4 = new Scanner(System.in);
            double amount=input4.nextDouble();
            savingsAccount.withdraw(amount);
            System.out.println(savingsAccount);
         }
      }
      //CHECKING ACCOUNT
      if(accountType.charAt(0)=='2')
      {
         System.out.println("Yay you have a Checking Account with us!");
         accountType="Checking Account";
         CheckingAccount checkingAccount = new CheckingAccount();
         Scanner input2 = new Scanner(System.in);
         System.out.print("What is your Checking Account number? "); //account# input
         checkingAccount.setId(input2.nextInt());
         System.out.println();
      
      //Do you want to withdraw, deposit, or see balance?
      
         System.out.print("For your " + accountType
            + ", Please select one of the following options:"
            + "\na: See balance & account information"
            + "\nb: Withdraw Money"
            + "\nc: Deposit Money"
            + "\nInput: ");
         Scanner input3 = new Scanner(System.in);
         String action=input3.next();
      //display balance
         if(action.charAt(0)=='a'||action.charAt(0)=='A')
         {
            System.out.println(checkingAccount);
         }
      //withdraw money
         if(action.charAt(0)=='b'||action.charAt(0)=='B')
         {
            System.out.println("How much would you like to deposit?");
            Scanner input4 = new Scanner(System.in);
            double amount=input4.nextDouble();
            checkingAccount.withdraw(amount);
            System.out.println(checkingAccount);
         }
      }        
   }
   
   public static void seeTeller()
   {
      System.out.println("Please go to a local branch and see a bank teller.");
   }
}


