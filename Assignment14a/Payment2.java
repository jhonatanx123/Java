
/**
 * Assignment 14a
 * A class named Payment that contains a instance 
 * variable of type double that stores the amount of the 
 * payment and appropriate accessor and mutator methods. 
 * A method named paymentDetails that outputs an 
 * English sentence to describe the amount of the payment.
 *
 * Maninder Singh
 * 04/26/2020
 */

import java.util.Scanner;
//Payment class
class Payment 
{
    //Store the amount of payment
    private double amount;
    //Create constructor and set amount to 0
    public Payment( )           
    {
        amount = 0;
    }
    //Argument constructor 
    public Payment(double amount)
    {
        this.amount = amount;
    }
    //Properties
    public void setPayment(double amount)
    {
        this.amount = amount;
    }
    //Properties 
    public double getPayment( )
    {
        return amount;
    }
    //Payment details method
    public void paymentDetails( )
    {
        System.out.println("The payment amount is " + amount);
    }
}