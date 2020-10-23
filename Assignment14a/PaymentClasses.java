
/**
 *Assignment 14a
 *Redefine paymentDetails method to include 
 *all credit card information in the printout. 
 *Create a main method that creates at least two 
 *CashPayment and two CreditCardPayment objects 
 *with different values and calls paymentDetailfor each.
 *
 * Jhonatan Roopnarine
 * 04/05/2020
 */


import java.util.Scanner;
public class PaymentClasses
{
    //public class Payment driver 
    public static void main(String[] args)
    {
        //Assign payments and details relating to the card
        CashPayment cash1 = new CashPayment(50), cash2 = new CashPayment(75);
        CreditCardPayment credit1 = new CreditCardPayment(10.5, "Bob", "10/05/2023", "4556361844622775");
        CreditCardPayment credit2 = new CreditCardPayment(20, "Marley", "07/15/2023", "343150081732553");
        System.out.println("Cash 1 details:");
        cash1.paymentDetails();
        System.out.println();
        System.out.println("Cash 2 details:");
        cash2.paymentDetails();
        System.out.println();
        System.out.println("Credit 1 details:");
        credit1.paymentDetails();
        System.out.println();
        System.out.println("Credit 2 details:");
        credit2.paymentDetails();
        System.out.println();
    }
   }
   