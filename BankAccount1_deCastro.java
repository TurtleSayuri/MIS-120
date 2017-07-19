//Melissa deCastro
//April 11, 2017
//Exam 3 BankAccount (Post Test)
//Can we go over this in class? I have no idea what I'm doing but it works. so...
public class BankAccount1_deCastro
{
   int accountNumber;
   double balance;
   //sets AN
   BankAccount1_deCastro(int newAccountNumber)
   {
      accountNumber=newAccountNumber;
   }
   //returns AN
   public int getAccountNumber()
   {
      return accountNumber;
   }
   
   //returns Balance
   public double getBalance()
   {
      return balance;
   }

   //sets Balance
   public void setBalance(double inBalance)
   {
      balance=inBalance;
   }
   
   public void deposit(double amount)
   {
      if(amount<1)
      {
         double newDeposit;
         newDeposit=(amount*(-1));
         amount=newDeposit;
      }
      balance=balance+amount;      
   }
   public void withdraw(double amount)
   {
      if(amount<0)
      {
         double newWithdraw;
         newWithdraw=(amount*(-1));
         amount=newWithdraw;
      }
      if(amount>balance)
      {
         System.out.println("You can't withdraw "+ amount+" dollars. Insufficient funds.");
      }
      else
      {
         balance=balance-amount;
      }
      // if(amount>balance)
      // {
         // System.out.println("You have withdrawn more than available funds.");
      // }
      
   }
   //main method
   public static void main(String[] args)
   {
      BankAccount1_deCastro myAccount = new BankAccount1_deCastro(1234);
      myAccount.setBalance(50);
      System.out.println("Account " + myAccount.getAccountNumber()
         + " has a balance of " + myAccount.getBalance());
      myAccount.deposit(50);
      myAccount.withdraw(75);
      System.out.println("Account " + myAccount.getAccountNumber()
         + " has a balance of " + myAccount.getBalance());      
   }
}
