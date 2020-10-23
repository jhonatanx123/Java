/**
 *Assignment 18
 *DayException to ask the user to re-enter the day
 *
 *Jhonatan Roopnarine
 *04/10/2020
 */


import java.util.Scanner;
public class DateException 
{
   public static void main(String[] args) 
   {
       //Declaring variables
       int day, month, year, month_days = 0;
       String date="";
      
       //Create a month_name[] array and initialized
       String month_name[]={"January","February","March","April","May",
       "June","July","August","September","October","November","December"};
      
       //Scanner class object is used to read the inputs entered by the user
       Scanner sc = new Scanner(System.in);

      
       //Getting the date entered by the user
       System.out.println("Enter Date :");
       date = sc.next();
      
       //Parsing the date using the delimeter "/"
       String dat[] = date.split("/");
      
       //Converting the String type to Integer type variable
       month = Integer.parseInt(dat[0]);
       while (true) 
       {
           try 
           {
               //If the month is within the range then throw 
               //Exception and display Error message
               if (month < 1 || month > 12) {
                   throw new MonthException("** Month Exception,Must be between 1-12 **");
                  
               } else
                   break;
           } 
           catch (MonthException e) 
           {
              
               //Getting the Month Entered by the user
               System.out.print("Enter Month :");
               month = sc.nextInt();
               continue;
           }
       }
       //Converting the String to the Integer type
       day = Integer.parseInt(dat[1]);
       //Converting the String type to integer type
       year = Integer.parseInt(dat[2]);
       //If the year is not within range the throw Exception and Display error
      while (true) 
      {
          if (year < 1000 || year > 3000) 
          {
               try 
               {
                   throw new YearException("** Year Exception.Must be between 1000-3000 **");
               } 
               catch (YearException e) 
               {
                   //Getting the year entered by the user
                   System.out.print("Enter Year :");
                   year = sc.nextInt();
                   continue;
               }
          } 
           else
               break;
      }
       //Based on the month entered by the user getting the number of 
       //days in the month
      if (month == 1) 
      {
           month_days = 31;
      } 
       else if (month == 2) 
      {
          
           /* Checking whether the year is leap year or not
           * If yes,then no of days is 29
           * if not,then no of days is 28
           */
           if (year % 400 == 0) 
           {
               month_days = 29;
           } 
           else if (year % 100 == 0) 
           {
               month_days = 28;
           } 
           else if (year % 4 == 0) 
           {
               month_days = 29;
           } 
           else 
           {
               month_days = 28;
           }
      } 
      else if (month == 3) 
      {
           month_days = 31;
      } 
      else if (month == 4) 
      {
           month_days = 30;
      } 
      else if (month == 5) 
      {
           month_days = 31;
      } 
      else if (month == 6) 
      {
           month_days = 30;
      } 
      else if (month == 7) 
      {
           month_days = 31;
      } 
      else if (month == 8) 
      {
           month_days = 31;
      } 
      else if (month == 9) 
      {
           month_days = 30;
      } 
      else if (month == 10) 
      {
           month_days = 31;
      } 
      else if (month == 11) 
      {
           month_days = 30;
      } 
      else if (month == 12) 
      {
           month_days = 31;
      }
      while (true) 
      {
           /* Checking the user entered day is valid or not
           * If not,then throw Exception and Display the error message
           * Prompts again to enter
           */
          if (day < 1 || day > month_days) 
          {
               try 
               {
                   throw new DayException("** Day Exception.Must be between 1-"+month_days+"**");
               } 
               catch (DayException e) 
               {
                   System.out.print("Enter Day :");
                   day = sc.nextInt();
                   continue;
               }
          } 
          else
               break;
      }
       //Displaying the final Output
      System.out.print("\nDate :"+month_name[month-1]+" "+day+","+year);
   }
}