//Melissa deCastro
//February 23, 2017
//Chapter 4 In-Class Assignment
//Note: I thought this was extra credit and not an assignment. Hope everything is well!

import java.util.Scanner;
public class Scrabble_deCastro
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int wordTotal = 0;
      int inx = 0;
      int bonus = 0;
      System.out.print ("Enter a word in uppercase or lowercase: ");
      String word = input.next();
      for (int i = 0; i<word.length(); i++)
         {
         inx = word.charAt(i);
         switch (inx)
            {
            //+1
            case 'a': case 'A':
            wordTotal += 1; break; 
            case 'e': case 'E':
            wordTotal += 1; break;
            case 'i': case 'I':
            wordTotal += 1; break;
            case 'u': case 'U':
            wordTotal += 1; break;
            case 'n': case 'N':
            wordTotal += 1; break;
            case 'r': case 'R':
            wordTotal += 1; break;
            case 'o': case 'O':
            wordTotal += 1; break;
            case 's': case 'S':
            wordTotal += 1; break;
            case 'l': case 'L':
            wordTotal += 1; break;
            case 't': case 'T':
            wordTotal += 1; break;
            //+2
            case 'g': case 'G':
            wordTotal += 2; break;
            case 'd': case 'D':
            wordTotal += 2; break;
            //+3
            case 'm': case 'M':
            wordTotal += 3; break;
            case 'b': case 'B':
            wordTotal += 3; break;
            case 'c': case 'C':
            wordTotal += 3; break;
            case 'p': case 'P':
            wordTotal += 3; break;
            //+4
            case 'y': case 'Y':
            wordTotal += 4; break;
            case 'f': case 'F':
            wordTotal += 4; break;
            case 'v': case 'V':
            wordTotal += 4; break;
            case 'w': case 'W':
            wordTotal += 4; break;
            case 'h': case 'H':
            wordTotal += 4; break;
            //+5
            case 'k': case 'K':
            wordTotal += 5; break;
            //+8
            case 'j': case 'J':
            wordTotal += 8; break;
            case 'x': case 'X':
            wordTotal += 8; break;
            //+10
            case 'q': case 'Q':
            wordTotal += 10; break;
            case 'z': case 'Z':
            wordTotal += 10; break;
            }
         }
      System.out.println ("Total for the word " + word + " is: " + wordTotal);
      if (word.length() > 4);
      {
      determineBonus(word, wordTotal, bonus);
      }
   }
   
   public static void determineBonus(String word, int wordTotal, int bonus)
   {
   //if word length >4, * wordTotal by 2
   if (word.length() >4 && word.length() <8)
   {
   bonus = wordTotal * 2;
   }
   //if word length >8, * wordTotal by 3
   if (word.length() >8 && word.length() <12)
   {
   bonus = wordTotal * 3;
   }
   //if word length >12, * wordTotal by 4
   if (word.length() >12)
   {
   bonus = wordTotal * 4;
   }
   System.out.println("Bonus for word " + word + " is: " + bonus);
   }
}