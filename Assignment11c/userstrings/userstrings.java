
/**
 *Assignment 11c
 *The program will replace every occurrence of "is" 
 *with the string "was" and count the number of changes made. 
 *
 * Jhonatan Roopnarine
 * 03/22/2020
 */
import java.util.Scanner;
public class userstrings
{
  // Change every occurrence of "is" in the
  // text of a form letter to "was"
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    // There are two strings - the input string
    // inString and the output string outString
    String inString = new String(),
    outString = new String();
    // indexOfis is the position within the
    // string where the next occurrence of is
    // begins.
    //initialize counter to check the changes
    int indexOfis;
    int counter=0;
    // Prompt the user and instruct him/her how
    // to indicate the end of the letter
    System.out.println("Please begin typing."
         + "End by typing \'The End\'");
    inString = keyb.nextLine();
    // Keep changing as long as (s)he didn't 
    // type "the end"
    while
       (!inString.equalsIgnoreCase("The End"))  {
      // Find the occurrence of is
      indexOfis = inString.indexOf("is");
      // As long as there are more occurrences of 
      // is, replace it with was
      while (indexOfis != -1){
        // create a string with everything up to
        // "is"
        outString = inString.substring(0,indexOfis);
        // Add "was" at the end of the
        // substring
        outString = outString.concat("was");
        counter++;
        // Concatenate everything in the input
        // string after the next occurrence of
        // "is"
        outString = outString.concat(
              inString.substring(indexOfis+2));
              // This replaces the input string – get
              // the new value for indexOfis
              inString = outString;
              indexOfis = inString.indexOf("is");
      }
      // Output the new line of text
      //Output the amount of changes
      System.out.println(outString);
      System.out.println("Is counter: " + counter);
      // Get the next line
      inString = keyb.nextLine();
    }
  }
}


    

