
/**
 * Assignment 14b
 * An action class derived from Movie.
 *
 *Maninder Singh
 * 04/26/2020
 */


public class Action extends Movie 
{
    public Action()
    {
        super();
    }
    public Action(String aRating, int aID, String aTitle)
    {
        super(aRating, aID, aTitle);
    }
    public double calcLateFees(int days)
    {
        return 3.0 * days;
    }
}