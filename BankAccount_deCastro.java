//Melissa deCastro
//April 11, 2017
//Exam 3 BankAccount
//Can we go over this in class? I have no idea what I'm doing but it works. so...
class BankAccount_deCastro
{
   int accountNumber;
   double balance;
   //sets AN
   BankAccount_deCastro(int newAccountNumber)
   {
      accountNumber=newAccountNumber;
   }
   //returns AN
   public int getAccountNumber()
   {
      return accountNumber;
   }
   //sets Balance
   void setBalance(double newBalance)
   {
      balance=newBalance;
   }
   //returns Balance
   public double getBalance()
   {
      return balance;
   }
   void deposit(double deposit)
   {
      if(deposit<1)
      {
         double newDeposit;
         newDeposit=(deposit*(-1));
         deposit=newDeposit;
      }
      balance=balance+deposit;      
   }
   void withdraw(double withdraw)
   {
      if(withdraw<0)
      {
         double newWithdraw;
         newWithdraw=(withdraw*(-1));
         withdraw=newWithdraw;
      }
      balance=balance-withdraw;
   
      if(withdraw>balance)
      {
         System.out.println("You have an overdraft of "+ (balance*-1));
      }
   }
   //main method
   public static void main(String[] args)
   {
      //BankAccount_deCastro accountNumber = new BankAccount_deCastro(1234);
      //BankAccount_deCastro balance = new BankAccount_deCastro(5);
      balance.setBalance(50);
      System.out.println("Account " + accountNumber.getAccountNumber()
         + " has a balance of " + balance.getBalance());
      balance.deposit(50);
      balance.withdraw(175);
      System.out.println("Account " + accountNumber.getAccountNumber()
         + " has a balance of " + balance.getBalance());
   
   }
}
