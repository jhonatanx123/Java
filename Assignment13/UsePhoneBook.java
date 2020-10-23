
/**
 * Assignment 13
 * Another class that uses the phone book, obtaining its 
 * size as a command line argument. Read in several records, 
 * write one or two of them and write the whole phone book.
 *
 * Jhonatan Roopnarine
 * 03/29/2020
 */

import java.util.Scanner;
public class UsePhoneBook 
{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       //Enter size of phone book
       System.out.print("Size of Phone Book: ");
       int size=sc.nextInt();
       //Max size of phonebook
       PhoneBook phonebook=new PhoneBook(size);
       //Read the record
       phonebook.readRecord();
       phonebook.readRecord();
       phonebook.readRecord();
       phonebook.readRecord();
       //Write the complete phone book
       phonebook.writeBook();
       //Write record 3
       phonebook.writeRecord(3);
       //Return and print record 1
       System.out.println("Record 1 :\n"+phonebook.toString(1));
       sc.close();
   }
}