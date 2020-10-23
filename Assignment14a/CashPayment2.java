
/**
 * Assignment 14a
 * A class named CashPayment that is derived 
 * from Payment. This class should redefine the paymentDetails 
 * methods to indicate that the payment is in cash. 
 * 
 *
 * Maninder Singh
 * 04/26/2020
 */

import java.util.Scanner;
//CashPayment class
class CashPayment extends Payment
{
    public CashPayment( )
    {
        super( );
    }
    public CashPayment(double amt)
    {
        super(amt);
    }
    public void paymentDetails( )
    {
        System.out.println("The cash payment amount is "+ getPayment( ));
    }
}