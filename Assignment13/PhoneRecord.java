/**
 * Assignment13
 * PhoneRecord class where the properties will be public, 
 * and it should have two constructors: one which 
 * simply constructs the string and another that 
 * accepts values for first name, lastname and phone number.
 *
 * Jhonatan Roopnarine
 * 03/29/2020
 */

//Phone record Class
public class PhoneRecord {
   //Create the variables in Phone record class as public
   public String firstName;
   public String lastName;
   public String number;
   //Constructor that constructs the string
   public PhoneRecord()
   {
       this.firstName=null;
       this.lastName=null;
       this.number=null;
   }
   //Constructor accepts values for first name, last name and 
   //phone number as strings.
   public PhoneRecord(String firstName,String lastName,String number)
   {
       this.firstName=firstName;
       this.lastName=lastName;
       this.number=number;
   }
}