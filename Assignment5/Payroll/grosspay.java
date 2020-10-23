/**
 * You are working for a company that is somewhat 
 * progressive in their pay scale. 
 * Single people get paid $10 per hour; married people 
 * get paid $15 per hour. In either case, they get paid 
 * an extra $1 per hour for their first four children.
 *
 * Jhonatan Roopnarine
 * 01/31/2020
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
        //Print the employee's grosspay
        System.out.println("The employee makes a total of " + grosspay + ".");
    }
}
        
