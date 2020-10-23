/**
 * Assignment 12
 * The program inputs a degree of difficulty 
 * and seven judges' scores and output the 
 * overall score for that dive.
 *
 *Maninder Singh
 *04/26/20
 */

import java.util.Scanner;
//Create a public class
public class DiverScore 
{
    public static void main(String[] args)
    {
        //Set max_scores to 7 for the most scores able to be recieved
        final int max_scores = 7;
        Scanner keyb = new Scanner(System.in);
        //Double diving score, max score and difficulty since 
        //whole numbers won't be a result
	double divingScores[] = new double[max_scores];
	double difficulty;
	//Ask for the difficulty level
	System.out.print("Please enter the difficulty level (1.2 - 3.8): ");
	difficulty = keyb.nextDouble();
	//Conduct this while statement when difficulty is <1.2 or >3.8
	while(difficulty < 1.2 || difficulty > 3.8)
	{
	    //Ask for the difficulty level
	    System.out.print("Please enter the valid difficulty level: ");
	    difficulty = keyb.nextDouble();
	}
	//Run this for loop until max scores is met
	for(int i = 0; i < max_scores; i++)
	{
	    //Ask for the score of the judge
	    System.out.print("Enter the score of judge " + (i + 1) + " (0 - 10): ");
	    divingScores[i] = keyb.nextDouble();
	    //Conduct this while statement when diving score is <1 or >10 for i
	    while(divingScores[i] < 1 || divingScores[i] > 10)
	    {
	        //Ask for the score of the judge
	        System.out.print("Enter the valid score of judge " + (i + 1) + ": ");
		divingScores[i] = keyb.nextDouble();
            }
	}
	//Double minimum, maximum and total in regards to the score
	double minimum = divingScores[0];
	double maximum = divingScores[0];
	double total = 0;
	//Run this for loop if the max score has not been met yet
	for(int i = 0; i < max_scores; i++)
	{
	    //Run the if loop according to the situation
	    if(divingScores[i] < minimum)
	           minimum = divingScores[i];
	    if(divingScores[i] > maximum)
	           maximum = divingScores[i];
	    //Find the total 
	    total = total + divingScores[i];
		}
	//Calculate the total score
	total = total - maximum - minimum;		
	total = total * difficulty;
	total = total * 0.6;
	//Print out the total score
	System.out.printf("\nThe overall score for the dive: %.1f\n", total);
    }
}