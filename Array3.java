public class Array3 //add up all the elements of array
{
   public static void main(String[]args)
   {
      double total = 0;
      int [] myList = new int[5];
      myList[0]=3;
      myList[1]=2;
      myList[2]=5;
      myList[3]=1;
      myList[4]=2;
      for (int i=0; i<myList.length; i++)
      {
         total+=myList[i];
      }
      System.out.println(total);
   
   }
}