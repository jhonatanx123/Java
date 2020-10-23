import java.util.Scanner;
/**
 * Converting a weight in kilograms to pounds and printing it out
 *
 * Jhonatan Roopnarine  
 * 01/27/2020
 */
public class ConvertKilograms  {
public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    Double pounds;
    final Double lbsPerKg = 2.2046;
    
    // Get the weight in kilograms
    System.out.println
              ("What is the weight in kilograms?:");
    double kg = keyb.nextDouble();
    // Ensure that the weight in kilograms is
    // valid. If it is valid, calculate and
    // display the weight in pounds
    if (kg < 0)
      System.out.println(kg
                   + " is not a valid weight.");
    else  {
      pounds= kg*lbsPerKg;
      System.out.println("The weight is:" 
                          + pounds + " pounds");
    }
  }
}
