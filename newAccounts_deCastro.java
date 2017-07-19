//Melissa deCastro
//May 11, 2017
//Chapter 11 HW - 11.7
import java.util.Date;
public class newAccounts_deCastro 
{
   public static void main(String[] args)
   {
      //test Account Class
      Account account = new Account(1122, 20000);
      System.out.println(account);
      account.setAnnualInterestRate(4.5);
      account.withdraw(2500);
      System.out.println(account);
      account.deposit(3000);
      //print balance, monthly interest, date
      System.out.println(account);
      
      SavingsAccount saving = new SavingsAccount(1234, 1000);
      System.out.println(saving);
      saving.withdraw(200);
      System.out.println(saving);
      saving.deposit(450);
      System.out.println(saving);
   
      CheckingAccount checking = new CheckingAccount(1843, 77.66);
      System.out.println(checking);
      checking.deposit(824.45);
      System.out.println(checking);
      checking.withdraw(152.33);
      System.out.println(checking);
   }
}

class Account
{
   private int id=0;
   private double balance = 0;
   private double annualInterestRate = 0;//samce for all accounts
   private Date dateCreated; //date when account was created

   Account()
   {
      id=0;
      balance=0;
      annualInterestRate=0;
      dateCreated = new Date();
   }
   
   Account(int id, double balance)
   {
      this.id=id;
      this.balance=balance;
      dateCreated = new Date();
   }
   
   //accessor = get___
   
   public int getId()
   {
      return id;
   }

   public double getBalance()
   {
      return balance;
   }

   public double getAnnualInterestRate()
   {
      return annualInterestRate;
   }
   
   public Date dateCreated()
   {
      return dateCreated;
   }
   
   //mutator = set____
   
   public void setId(int id)
   {
      this.id=id;
   }
   public void setBalance(double balance)
   {
      this.balance=balance;
   }
   public void setAnnualInterestRate(double annualInterestRate)
   {
      this.annualInterestRate=annualInterestRate;
   }
   
   
   //third round of methods
   
   public double getMonthlyInterestRate()
   {
      double monthlyInterestRate;
      monthlyInterestRate=((this.annualInterestRate/100)/12);
      return monthlyInterestRate;
   }
   
   public double getMonthlyInterest()
   {
      double monthlyInterestRate;
      monthlyInterestRate=((this.annualInterestRate)/12);
      double monthlyInterest;
      monthlyInterest=(monthlyInterestRate*balance);
      return monthlyInterest;
   }
   
   public void withdraw(double withdraw)
   {
      balance-=withdraw;
   }
   
   public void deposit(double deposit)
   {
      balance+=deposit;
   }
   public String toString()
   {
      return "\nAccount Number: " + this.id
         + "\nBalance: " + this.balance
         + "\nDate Created: " + this.dateCreated;
   }
}

//man this is going to take forever. savings
class SavingsAccount extends Account
{
   //private Date dateCreated;
   SavingsAccount()
   {
   }
   
   SavingsAccount(int id, double balance)
   {
      setId(id);
      setBalance(balance);
      this.dateCreated = new Date();      
   }
   
   public String toString()
   {
      return "\nSavings Account Number: " + getId()
         + "\nBalance: " + getBalance()
         + "\nDate Created: " + this.dateCreated;
   }

}

class CheckingAccount extends Account
{
   private Date dateCreated;
   CheckingAccount()
   {
   }
   CheckingAccount(int id, double balance)
   {
      setId(id);
      setBalance(balance);
      this.dateCreated = new Date();
   }
   
   public String toString()
   {
      return "\nChecking Account Number: " + getId()
         + "\nBalance: " + getBalance()
         + "\nDate Created: " + this.dateCreated;
   }
}

