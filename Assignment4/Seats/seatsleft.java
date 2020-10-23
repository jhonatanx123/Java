
/**
 * This program reads two (2) inputs: 
 * the number of students in a class 
 * and the number of total seats in the classroom.
 * The program will print the amount of seats left, 
 * or "Invalid" depending on what is entered.
 *
 * Jhonatan Roopnarine
 * 01/30/2020
 */
import java.util.Scanner;
public class seatsleft
{
    public static void main(String[] args){
        //Initialize the variables and set them to integers
        //Accept the input from the user
        //Create a condition for if the numbers entered are not positive
        //Print out the result
        int seatsleft;
        Scanner keyb=new Scanner(System.in);
        System.out.println("Enter the number of students in the class:\t");
        int students=keyb.nextInt();
        System.out.println("Enter the total seats in the class:\t");
        int seats=keyb.nextInt();
        seatsleft=seats-students;
        if (students<0){
            System.out.println("Invalid \t");
        }
        else if (seats<0){
            System.out.println("Invalid \t");
        }
        else{
            System.out.println("The number of seats left is:" +seatsleft);
        }
    }
}
        
        
        
