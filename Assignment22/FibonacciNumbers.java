
/**
 * Assignment 22
 * Write your own Driver class for Fibonacci 
 * numbers. Call them each twice for 
 * two different tests of values. Turn 
 * in both your source code and output.
 * Jhonatan Roopnarine
 * 05/10/2020
 */

import java.util.Scanner;
//Create a public class fibonacci numbers
public class FibonacciNumbers {
    //Run fib and initialize n as an integer
    public static int fib(int n){
        //if n=0
        if(n == 0){
            return 0;
        }
        //if n=1
        if(n == 1){
            return 1;
        }
        //else other circumstance
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    //main program
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n;
        //ask for the input
        System.out.println("Input an integer for the sequence:");
        n = scanner.nextInt();
        //print the result
        System.out.println("fibonacci("+n+") = "+ fib(n+1));
    }
}