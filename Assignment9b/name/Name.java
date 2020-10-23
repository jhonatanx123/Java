
/**
 * Assignment9b
 * This program allows the user to set their name and then enter 
 * a random name to check if these two names are the same.
 * This program was worked on with Maninder Singh as the lab 
 * assistant helped us.
 *
 * Jhonatan Roopnarine
 * 02/26/2020
 */
import java.util.Scanner;
public class Name extends driver
{
    //Initialize the variables with first being a string, 
    //middle being a character and last being a string.
    public String first;
    public char middle;
    public String last;
    public Name()
    {
        //Set the user's name-default constructor
        first = "Jhonatan";
        middle = 'B';
        last = "Roopnarine";
    }
    public Name(String first,char middle,String last)
    {
        //Set the variables to accept the three 
        //parameters-conversion constructor
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    public Name(String first,String last)
    {
        //Set the variables to accept the two
        //parameters-conversion constructor
        this.first = first;
        this.middle = ' ';
        this.last = last;
    }
    public Name(Name other) 
    {
        //Check the other name
        first = new String (other.first);
        middle = (other.middle);
        last = new String (other.last);
    }
    public void readName()
    {
        //Take the input from the user
        Scanner keyb =  new Scanner(System.in);
        System.out.println("Please enter the first name:");
        first = keyb.next();
        System.out.println("Please enter the last name:");
        last = keyb.next();
        System.out.println("Please enter the middle initial:");
        String temp = keyb.next();
        middle = temp.charAt(0);
    }
    //Print out the first,middle and last name
    public void writeName()
    {
        System.out.print(first + " " + middle + " " + last);
    }
    //Check whether the names are equal or the same
    public boolean equals(Name otherName)
    {
        return(first.equals(otherName.first) && (last.equals(otherName.last)) && (middle == otherName.middle));
    }
    //Return the string of the name
    public String toString()
    {
        return(first + " " + middle + " " + last);
    }
    //Use the precedes method to check order and return true 
    public boolean precedes(Name otherName)
    {
        return(last.compareTo (otherName.last))<0
            || (last.equals (otherName.last) && first.compareTo (otherName.first)<0)
            || (last.equals (otherName.last) && (first.equals (otherName.first))
            && (middle < otherName.middle));    
    }
}