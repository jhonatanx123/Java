
/**
 * Assignment 14b
 * A Drama class derived from Movie.
 *
 * Jhonatan Roopnarine
 * 4/05/2020
 */


public class Drama extends Movie 
{
    public Drama()
    {
        super();
    }
    public Drama(String aRating, int aID, String aTitle)
    {
        super(aRating, aID, aTitle);
    }
    public double calcLateFees(int days)
    {
        return 2.0 * days;
    }
}