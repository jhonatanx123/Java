
/**
 *Write a program that will accept an single integer input 
 *(and check to make sure that it is a positive integer n 
 *and print out the nth Fibonacci number.
 *Please note that F0 is defined as 0 and F1 is defined as 1.
 *
 *Jhonatan Roopnarine
 *02/05/2020
 */
import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args) {
   //Ask for the integer number 
   System.out.print("Enter a single integer number:");
   Scanner n = new Scanner(System.in);
   //Initialize the variables
   int counter=0;
   int y=1;
   int x=0;
   int p=n.nextInt();  
   //Create a while statement for all the conditions
   while(counter<p)
   {
   //Increase the counter
   counter++;
   //Create a condition for if x>y or any other scenario
   if(x>y)
   {    
   y=x+y;
   }
   else
   {
       x=x+y;
   }
}
//Print out the fibronacci number
if (x<y)
{
    System.out.println("The fibonacci number is:" + x);  
}
else 
{
    System.out.println("The fibonacci number is:" + y);
}
}
}

   
   
       
   

    
        
    
    
    
        
    
