import java.util.Scanner;
public class Array //March 28, 2017
{
   public static void main(String[] args)
   {
   
   //int [] myList = new int[18];
   int [] myList = {15, 3, 3+4};
   int [] myList2 = {15, 3, myList[0]+myList[1]};
   //myList[0]=(int)(Math.random()*19);
   //myList[1]=(int)(Math.random()*19);
   //myList[2]=(int)(Math.random()*19);
   //myList[3]=myList[0]+myList[1];
   
   System.out.println(myList[0]);
   System.out.println(myList[1]);
   System.out.println(myList[2]);
   System.out.println(myList2[0]);
   System.out.println(myList2[1]);
   System.out.println(myList2[2]);
   }
}