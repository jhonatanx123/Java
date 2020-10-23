
/**
 * Assignment 18
 * If the user enter anything other than a legal month number 
 * (integers 1 through 12), your program will throw and catch 
 * MonthException and ask the user to re-enter then month.
 *
 *Jhonatan Roopnarine
 *04/10/2020
 */


public class MonthException extends Exception 
{
  public MonthException(String string) 
  {
       System.out.println(string);
  }
}

