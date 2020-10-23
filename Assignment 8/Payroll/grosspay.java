/**
 * This program is a continuous of the previous payroll program.
 * This program will now take out income tax 
 * depending 
 *
 * Jhonatan Roopnarine
 * 02/09/2020
 */
import java.util.Scanner;
public class grosspay
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ask the user about their relationship
        System.out.println("Is the employee married? 0 = no, 1 = yes");
        int relationship = sc.nextInt();
        //Ask the user how many kids they have
        System.out.println("How many kids does the employee have?");
        int kids = sc.nextInt();
        //Ask the user how many hours they worked
        System.out.println("How many hours did the employee work?");
        int hours = sc.nextInt();
        //Initialize variables
        double payrate = 0;
        double grosspay;
        double tax;
        //Create an if statement for the realtionship status and payrate
        if (relationship == 1)
        {
            payrate = 15;
        }
        else if(relationship == 0)
        {
            payrate = 10;
        }
        else
        {
            System.out.println("Answer with the options given.");
        }
        //Create an if statement for if there are 1-4 kids or greater
        if (kids > 4)
        {
            payrate = payrate+4;
        }
        else if (kids >= 1 && kids <= 4)
        {
            payrate = payrate+kids;
        }
        //Calculate the gross pay depending on hours worked
        if (hours > 40)
          grosspay = 40*payrate + (1.5*payrate*(hours - 40));
        else
          grosspay = hours*payrate;
        //Determine Tax
        if(grosspay>=600){
            tax=grosspay*.10;
        }
        else if(grosspay>=400){
            tax=grosspay*.08;
        }
        else if(grosspay>=300){
            tax=grosspay*.05;
        }
        else{
            tax=0;
        }
        //Calculate net pay
        double netpay=grosspay-tax;
        //Print the total gross pay,income tax,and net pay
        System.out.println("Your gross pay is $" + grosspay);
        System.out.println("Your tax is $" + tax);
        System.out.println("Your net pay $" + netpay);
    }
}

        
        
