/*Melissa deCastro
May 16, 2017
Final Exam - MIS 120
Thank you :) I had a great time in this class.
I'll probably bother you along road for job stuff!*/

public class SavingsAccount_deCastro extends Account
{
   private double tempBalance;
   SavingsAccount_deCastro(String fName, String lName, int accountNumber, double balance)
   {
      super(fName, lName, accountNumber, balance);
   }
   
   SavingsAccount_deCastro(String fName, String lName)
   {
      super(fName, lName);
   }
   
   public void deposit(double amount)
   {
      if(getAccountNumber()==0) //does this work?
      {
         System.out.println("Error: can not deposit money, no Account Number defined");
      }
      else
      {
         tempBalance=getBalance()+amount;
         setBalance(tempBalance);
      }
   }
   
   public void withdraw(double amount)
   {
      if(amount>getBalance())
      {
         System.out.println("Error: can not withdraw money, overdraft of account");
      }
      else
      {
         tempBalance=getBalance()-amount;
         setBalance(tempBalance);
      }
   }
   
   public String toString()
   {
      return
         "Name: " + getlName() + " " + getfName()
         + " Account Number: " + getAccountNumber()
         + " Balance: " + getBalance();
   }
   
   public static void main(String[] args)
   {
      SavingsAccount_deCastro account1 = new SavingsAccount_deCastro("Joe", "Smith", 12345, 200.00); 
      System.out.println(account1);
      SavingsAccount_deCastro account2 = new SavingsAccount_deCastro("Molly", "Brown"); 
      System.out.println(account2);
      
      //test methods time
      account1.deposit(50);
      System.out.println(account1);
      account2.deposit(100);
      System.out.println(account2);
      account1.withdraw(100);
      System.out.println(account1);
      account2.withdraw(100);
      System.out.println(account2);
   
   }
}