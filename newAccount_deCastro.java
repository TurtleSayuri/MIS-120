//Melissa deCastro
//May 9 , 2017
//Chapter 11 Homework, part a - 9.7

public class newAccount_deCastro
{
   public static void main(String[] args)
   {
      Account account1 = new Account(1122, 20000);
      System.out.println(account1);
   
      account1.setAnnualInterestRate(4.5);
      account1.withdraw(2500);
      System.out.println(account1);
   
      account1.deposit(3000);
   //print balance, monthly interest, date
      System.out.println(account1);
   }
}

class Account
{
   private int id=0;
   private double balance = 0;
   private double annualInterestRate = 0;//samce for all accounts
   private java.util.Date dateCreated; //date when account was created

   Account()
   {
      id=0;
      balance=0;
      annualInterestRate=0;
   }
   
   Account(int id, double balance)
   {
      this.id=id;
      this.balance=balance;
      this.dateCreated = new java.util.Date();
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
   
   public java.util.Date dateCreated()
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
