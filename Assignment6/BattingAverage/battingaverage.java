
/**
 * The program will read in the number of times at bat 
 * and the number of hits for nine (9) players. 
 * Then it will calculate the batting average using the formula:
 * Batting Average = Hits / At Bats
 *
 * Jhonatan Roopnarine
 * 02/03/2020
 */
import java.util.Scanner;
public class battingaverage
{
    public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   //Initialize the values 
   double hits=0;
   double atBats=0;
   double battingaverage;
   int count;
   final int numberofbatters=9;
   //Create a for loop to go up to 9 batters
  for (count=1; count<=numberofbatters;count++){
   //Ask for the number of hits 
   System.out.print("Please enter the number of hits:");
   hits=kb.nextDouble();
   //Ask for the number of times at bat
   System.out.print("Please enter the number of at bats:");
   atBats=kb.nextDouble();
   //Compute the batting average
   battingaverage=(hits/atBats);
   //Print the batting average, hits and times at bat at the end of the run
   System.out.println("Your batting average is:" + battingaverage + ".");
   System.out.println("Your number of hits is:" + hits + ".");
   System.out.println("Your number of times at bats is:" + atBats + ".");
   System.out.println(" ");

}
}
}  
   
   
 