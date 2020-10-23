/**
* Assignment 20
* Write a program that will ask the user 
* for a file name. Contained in this file 
* is a series of integers separated by white 
* space. Read in the numbers, displaying them 
* on the screen, adding them up and then 
* calculating their average.
*
* Jhonatan Roopnarine
* 04/25/2020
*/
    
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Create a public class Numbers 
public class Numbers 
{
   //Create a file not found exception
   public static void main(String[] args) throws FileNotFoundException 
   {
       Scanner scan = new Scanner(System.in);
       //Ask the user to enter the file name
       System.out.print("Enter file path name: ");
       String name = scan.nextLine();
       scan.close();
       File path = new File(name);
       Scanner reader = new Scanner(path);
       //Initialize count as a double and total as a long
       double count = 0;
       long total = 0;
       //Run the loop until file has integers
       while(reader.hasNextInt()) {
           //Set number as int and read the following one
           int number = reader.nextInt();
           //Print out the number
           System.out.print(number+" ");
           //Calculate the total
           total = total + number;
           //Increase the count
           count++;
       }
       //System.out.println();
       //Double average since a decimal is possible and find it 
       double average = total/count;
       //Print average
       System.out.printf("Average : %.2f",average);
       //Cose the stream
       reader.close();
   }
}