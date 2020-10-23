/**
 * Write a program that will ask the user 
 * for the number of values to be averaged.
 *
 *Jhonatan Roopnarine
 *04/19/2020
 */

import java.util.Scanner;
import java.lang.Exception;
//Public class calculator 
public class Calculator 
{
    public static void main(String[] args) throws NegativeNumberException
    {
        //Empty space before asking for user's input
        System.out.println("");
        //Ask user for how many inputs they wish to enter
        System.out.println("How many numbers you want to enter?");
        Scanner scanner = new Scanner(System.in);
        //Declare n as an int for the amount of inputs 
        int n = scanner.nextInt();
        //Initialize the other variables
        double[] arr = new double[n];
        double total = 0;
        double x;
        //Keep asking for an input according the the user's amount of inputs
        for(int i=0; i<arr.length; i++)
        {
                //Ask the user to enter to enter their choice of number
                System.out.print("Enter Element No."+(i+1)+": ");
                arr[i] = scanner.nextDouble();
                //Pass the exception for the negatives
                if(arr[i]<0)
                {
                    NegativeNumberException exp= new NegativeNumberException();
                    //throw(exp);
                }
        }
        //Find the total or sum of all entered numbers
        scanner.close();
        for(int j=0; j<arr.length; j++)
        {
            total = total + arr[j];
        }
        //Find the average
        double average = total / arr.length;
        //Print average
        System.out.format("The average is: %.3f", average);
    }
}

