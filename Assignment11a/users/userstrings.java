
/**
 * Assignment 11a
 * Write a program that prompts the user for a line of text, 
 * prints it and repeats this until the user types "The end"
 *
 * Jhonatan Roopnarine
 * 03/09/20
 */

import java.util.Scanner;
//Create a public class named userstrings
public class userstrings
{
   public static void main(String[] args)
   {
      Scanner keyb=new Scanner(System.in);
      //Take the string from the user
      String inString = new String();
      //Ask the user for the string or if they want to end
      System.out.println("Please begin typing." + "End by typing \'The end'");
      //Read the input as a string
      inString=keyb.nextLine();
      //Create a while statement for when the string is not "the end"
      //Run the code again 
      while (!inString.equalsIgnoreCase("the end"))
      { 
          System.out.println(inString);
          System.out.println("Please begin typing." + "End by typping \'The end'");
          inString = keyb.nextLine();
      }
   }
}