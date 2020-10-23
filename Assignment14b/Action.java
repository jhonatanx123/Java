
/**
 * Assignment 14b
 * An action class derived from Movie.
 *
 *Jhonatan Roopnarine
 * 04/05/2020
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