
/**
 * Assignment 13
 * A class called Phone Book. It should contain an
 * array of Phone Records and a count of howmany 
 * records there actually are. 
 *
 * Maninder Singh
 * 04/26/2020
 */

import java.util.Scanner;
// Create a phone book Class
public class PhoneBook 
{
   static Scanner sc=new Scanner(System.in);
   //Create the array of phone records 
   PhoneRecord array[];
   //Count amount of records
   public int count=0;
   //Total amount of arrays
   int total_records;
   //Constructor that takes how many records should store maximum
   public PhoneBook(int total_records)
   {
       this.total_records=total_records;
       //Initialize the array with max records
       array=new PhoneRecord[total_records];
   }
   //Read the record
   public void readRecord()
   {
       //Conduct if statement if the book is full
       if(count==total_records)
       {
           //Print book is full
           System.out.println("Phone Book is Full ");
           return;
       }
       //Conduct if the book is not full
       else
       {
           //Print these statements for input and increase count
           System.out.println("- - - Reading Phone Record - - - ");
           System.out.print("First name: ");
           String firstName=sc.nextLine();
           System.out.print("Last name: ");
           String lastName=sc.nextLine();
           System.out.print("Number: ");
           String number=sc.nextLine();
           array[count]=new PhoneRecord(firstName,lastName,number);
           count++;
       }
   }
   //Method to return Phone records details at specific index number
   public String toString(int i)
   {
       //ASSUMING RECORD NUMBERS START FROM 1
       if(i>=count)//if try to take non existing record
       {
           return null;
       }
       //if record found of specific record then return
       return array[i-1].firstName+" "+array[i-1].lastName+" "+array[i-1].number;
   }
   //Method to write phone records details at specific index number
   public void writeRecord(int i)
   {
       //Assuming records number starts from 1
       //Conducts if statement if no record is found
       if(i>=count)
       {
           System.out.println("No record found..");
       }
       //If record found at specific record then print records
       System.out.println("Phone record "+i);
       PhoneRecord record=array[i-1];
       System.out.println(record.firstName+" "+record.lastName+" "+record.number);
   }
   //Method to Write the complete phoneBook
   public void writeBook()
   {
       //Conduct if statement if no records in book
       if(count==0) 
       {
           System.out.println("No Records in PhoneBook ");
       }
       //Conduct if statement if records in phone book
       else
       {
           System.out.println("Phone Book: ");
           for(int i=0;i<count;i++)
           {
               PhoneRecord record=array[i];
               System.out.println(record.firstName+" "+record.lastName+" "+record.number);
           }
       }
       System.out.println();
   }
}