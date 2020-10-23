
/**
 * Assignment 22
 * Write your own Driver class for Greatest 
 * Common Divisors, call them each twice for 
 * two different tests of values. Turn 
 * in both your source code and output.
 * Jhonatan Roopnarine
 * 05/10/2020
 */

import java.util.Scanner;
//Create a public class GCD
public class GCD {
  //Set a and b as integers
    public static int gcd(int a, int b){
    //Create an if statement if b is not equal to 0 or else
    if (b != 0)
      return gcd(b, a%b);
    else
      return a;
  }
  //Main part of program
  public static void main(String args[]) {
    //Initialize m and n as integers
    int m, n;
    Scanner in = new Scanner(System.in);
    //Ask for the first value
    System.out.print("Enter first value: ");
    m = in.nextInt();
    //Ask for the second value 
    System.out.print("Enter second value: ");
    n = in.nextInt();
    //Find gcd od m and n
    int result = gcd(m,n);
    //If result is 1 or else
    if(result==1) {
      System.out.println("GCD is 1");
    }
    else{
      System.out.println("GCD is:" + result);
    }
  }
}