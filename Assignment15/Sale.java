
/**
 * Assignment 15
 * Base class Sale
 *
 * Jhonatan Roopnarine
 * 04/06/2020
 */


// Class for a simple sale of one item with no
// tax, no discount or other adjustments.
// Class invariants: The price is always
// non-negative:
// The name is a nonempty string.
public class Sale { 
  private String name; // A non-empty string
  private double price; // non-negative

  // Sale() - A defaul construcctor
  public Sale () {
    name = "No name yet";
    price = 0;
  }
  
  // Sale() - A conversion constructor
  // Preconditions: theName is a nonempty string
  //                the Price is non-negative
  public Sale(String theName, double thePrice) {
    setName(theName);
    setPrice(thePrice);
  }

  // Sale() - A copy constructor
  public Sale(Sale originalObject) {
    if (originalObject == null) {
      System.out.println
        ("Error: null Sale object.");
      System.exit(0);
    }
    // else
    name = originalObject.name;
    price = originalObject.price;
  }
  
  public static void announcement() {
    System.out.println("This is the Sale class.");
  }

  // getName() - an accessor
  public String getName() {
    String newName = new String(name);
    return newName;
  }

  // getPrice() - an accessor
  public double getPrice() {
    return price;
  }
  
  // setName() - a mutator
  // Precondition - name is a nonempty string
  public void setName(String newName) {
    if (newName != null && newName != "")
      name = newName;
    else {
      System.out.println("Error: Improper name value.");
      System.exit(0);
    }
  }

  //setPrice() - A mutator
  // Precondition: newPrice is non-negative
  public void setPrice(double newPrice) {
    if (newPrice >= 0 )
      price = newPrice;
    else {
      System.out.println
        ("Error: negative price.");
      System.exit(0);
    }
  }

  // toString() - returns the name and formatted
  //              price as a string
  public String toString() {
    return (name + " Price and total cost = $ "
              + String.format("%4.2f", price));
  }

  // bill() - returns the price of the item
  public double bill() {
    return price;
  }

  // equalsDeals() - Returns true if the names
  //                 are the same and the bill for the
  //                 calling object is equal to the bill for
  //                 otherSale. Otherwise returns false.
  //                 Also returns false if otherObject is null
  public boolean equalDeals(Sale otherSale) {
    if (otherSale == null)
      return false;
    else
      return (name.equals(otherSale.name)
                && bill() == otherSale.bill());
    // will use the appropriate bill() method for
    // the other object
  }


  // lessThan() - Returns true if the bill for
  //              the callingObject is less than
  //              the bill for otherSale;
  //              otherwise returns false
  // Precondition: otherSale is not null.
  public boolean lessThan(Sale otherSale) {
    if (otherSale == null) {
      System.out.println("Error: null Sale object.");
      System.exit(0);
    }
    // else
    return (bill() < otherSale.bill());
    // will use the appropriate bill() method for
    // the other object
  }
  
  // equals() - Returns true if the objects are
  //            equal
  public boolean equals(Object otherObject) {
    // If otherObject is null, they can't be
    // equals
    if (otherObject == null)
      return false;
    
    // getClass() returns a representation of the
    // object's class we can use it to compare
    // two object to see if they are of the same
    // class. If they aren't, they can't be
    // equal.
    else if (getClass() != otherObject.getClass())
      return false;
    else {
      Sale otherSale = (Sale)otherObject;
      return(name.equals(otherSale.name)
               && (price == otherSale.price));
    }
  }
}