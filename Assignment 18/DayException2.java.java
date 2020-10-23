
/**
 *Assignment 18
 *If the user enters anything other than a valid day 
 *number (integers 1 through 28, 29, 30, or 31 depending 
 *on the month and year), then your program will throw 
 *and catch a DayException and ask the user to re-enter the day.
 *
 *Maninder Singh
 *04/29/2020
 */


public class DayException extends Exception 
{
   public DayException(String string) 
   {
       System.out.println(string);
   }
}