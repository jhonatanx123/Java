
/**
 * Assignemnt 14b
 * A Comedy class derived from Movie
 *
 * Maninder Singh
 * 04/26/2020
 */


public class Comedy extends Movie
{
    public Comedy()
    {
        super();
    }
    public Comedy(String aRating, int aID, String aTitle)
    {
        super(aRating, aID, aTitle);
    }
    public double calcLateFees(int days)
    {
        return 2.5 * days;
    }
}