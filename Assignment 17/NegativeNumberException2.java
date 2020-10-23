/**
 *Assignment 17
 *A class that will allow the user to enter that number 
 *of non-negative values. If the user enters a negative value, 
 *handle it by throwing a NegativeNumberException.
 *
 * Maninder Singh
 * 04/26/2020
 */

//NegativeNumberException.java
import java.io.*;
public class NegativeNumberException extends
                              Exception {
  // No-arg constructor with super() call
  public NegativeNumberException(){
    System.out.println("positive number expected");
  }
  // String-arg constructor with super() call
  public NegativeNumberException(String msg){
    super(msg);
  }
}