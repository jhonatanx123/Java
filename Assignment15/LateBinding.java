
/**
 *Assignment 15
 *To satisfy yourself that you understand what late binding 
 *is and how it works, enter and run the LateBinding program 
 *after your enter and compile the base class Sale and 
 *the derived classDiscountSale.
 *
 *Jhonatan Roopnarine
 *04/06/2020
 */

import java.util.Scanner;
// Demonstrates late binding
public class LateBinding {
  public static void main(String[] args) {
    // One item at $10
    Sale simple = new Sale("floor mat", 10.00);
    // One item at $11 with a 10% discount
    DiscountSale discount 
      = new DiscountSale("floor mat", 11.00, 10);
    System.out.println(simple);
    System.out.println(discount);

    // lessThan will use different versions of
    // bill()
    if (discount.lessThan(simple))
      System.out.println("Discounted item is cheaper.");
    else
      System.out.println("Discounted item is not cheaper.");
    
    // One item at $10
    Sale regularPrice = new Sale("cup holder", 9.90);
    // One item at $11 with a 10% discount
    DiscountSale specialPrice = new DiscountSale("cup holder", 11.00, 10);
    System.out.println(regularPrice);
    System.out.println(specialPrice);

    // equals will use different versions of
    // bill()
    if (specialPrice.equalDeals(regularPrice))
      System.out.println("Deals are equal.");
    else
      System.out.println("Deals are not equal.");
  }
}