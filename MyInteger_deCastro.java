//Melissa deCastro
//May 4, 2017
//Chapter 10 Homework - 10.3

public class MyInteger_deCastro
{
   public static void main(String[] args)
   {
   
      MyInteger num1 = new MyInteger(10);
      MyInteger num3 = new MyInteger(13);
      
      //check first round of methods
      System.out.println("The value is " + num1.getValue());
      System.out.println("Even: " + num1.isEven());
      System.out.println("Odd: " + num1.isOdd());
      System.out.println("Prime: " + num1.isPrime());
      System.out.println(num1.getValue() + " is equal to 9: " + num1.isEqual(9));
      
      System.out.println();
      
      //check second round of methods
      System.out.println("The value is 9");
      System.out.println("Even: " + MyInteger.isEven(9));
      System.out.println("Odd: " + MyInteger.isOdd(9));
      System.out.println("Prime: " + MyInteger.isPrime(9));
      
      System.out.println();
   
      //check third round of methods
      System.out.println("The value is " + num3.getValue());
      System.out.println("Even: " + MyInteger.isEven(num3));
      System.out.println("Odd: " + MyInteger.isOdd(num3));
      System.out.println("Prime: " + MyInteger.isPrime(num3));
      System.out.println(num1.getValue() + " is equal to 9: " + num3.isEqual(num1));
   }
}

class MyInteger
{
   private int value;
   
   public MyInteger(int number)
   {
      value=number;
   }
   public int getValue()
   {
      return value;
   }
   public boolean isEven()
   {
      return (this.value%2)==0;
   }
   
   public static boolean isEven(int num)
   {
      return (num%2)==0;
   }

   public static boolean isEven(MyInteger num)
   {  
      return num.isEven();
   }

   public boolean isOdd()
   {         
      return (this.value%2)==1;
   }
   
   public static boolean isOdd(int num)
   {
      return (num%2)==1;
   }
   
   public static boolean isOdd(MyInteger num)
   {
      return num.isOdd();
   }
   
   public boolean isPrime()
   {  
      if(this.value<2)
      {
         return false;
      }
      if(this.value==2||this.value==3)
      {
         return true;
      }
      if((this.value*this.value-1)%24==0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public static boolean isPrime(int num)
   {
      if(num<2)
      {
         return false;
      }
      if(num==2||num==3)
      {
         return true;
      }
      if((num*num-1)%24==0)
      {
         return true;
      }
      else
      {
         return false;
      }
      
   }
   
   public static boolean isPrime(MyInteger num)
   {
      return num.isPrime();
   }
   
   public boolean isEqual(int num)
   {
      if (num == this.value) 
         return true;
      return false;
   }
   
   public boolean isEqual(MyInteger num)
   {
      if(num.getValue()==this.value)
      {
         return true;
      }
      return false;
   }
   
}