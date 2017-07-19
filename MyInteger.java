public class MyInteger{

   int value;

   public MyInteger(int number){
      this.value = number;
   }

   public int getInt(){
      return value;
   }

   public boolean isEven(){
      return value%2==0;
   }
   
   public boolean isOdd(){
      return value%2==1;
   }

   public boolean isPrime(){
      boolean returningBool = true;
      
      if(value>=0 && value<=3){
         return true;
      }else{
         for(int i=2;i<value;i++){
            if(value%i==0){
               returningBool=false;
            }
         }
      }
      return returningBool;
   }

   public static boolean isEven(int number){
      return number%2==0;
   }

   public static boolean isOdd(int number){
      return number%2==1;
   }

   public static boolean isPrime(int number){
      MyInteger fish = new MyInteger(number);
      return fish.isPrime();
   }

   public static boolean isEven(MyInteger number){
      return isEven(number.getInt());
   }

   public static boolean isOdd(MyInteger number){
      return isOdd(number.getInt());
   }

   public static boolean isPrime(MyInteger number){
      return isPrime(number.getInt());
   }

   public boolean equals(int number){
      return value==number;
   }

   public boolean equals(MyInteger mint){
      return this.getInt()==mint.getInt();
   }


   public static void main(String[] args){
      String str = "00000123";
      char[] c= str.toCharArray();
   
   
      MyInteger test = new MyInteger(7);
   
      System.out.println(isOdd(test));
   }

}