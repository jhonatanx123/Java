
/**
 *Assignment 23
 *Implement f(x), assuming that the parameter 
 *and the result are both integer. 
 *Write a driver for it that test it with both positive 
 *and negative values (at least 4 cases).
 *
 *Jhonatan Roopnarine
 *05/05/2020
 */

//Create a public class
public class Recursive 
{
    //Set up if statements for the different scenarios
    public static int f(int x) 
    {
        //If x is less than 0
        if (x < 0)
            return f(-x);
        //If x is greater than 1
        else if (x > 1)
            return 4 * f(x - 1) + 3;
        //If x is 1
        else if (x == 1)
            return 12;
        //If none of the scenarios matches signifying x is 0
        else
            return 5;
    }
    //Test the four scenarios 
    public static void main(String[] args) 
    {
        System.out.println("f(-8) = " + f(-8));
        System.out.println("f(8) = " + f(8));
        System.out.println("f(1) = " + f(1));
        System.out.println("f(0) = " + f(0));
    }
}