
/**
 * Assignment 14b
 * Test the classes in the main method.
 *
 *Jhonatan Roopnarine
 *04/05/2020
 */


public class MovieNight
{
    //Test the situations in the main method
    public static void main(String[] args)
    {
        Movie movie = new Movie("R", 7548, "Bad Boys For Life");
        Action action = new Action("G", 5790, "Ratatouille");
        Comedy comedy = new Comedy("R", 6797, "American Sniper");
        Drama drama = new Drama("PG-13", 6579, "Batman v Superman");
        System.out.println(movie);
        System.out.println("Late Fee: $" + movie.calcLateFees(6));
        System.out.println(action);
        System.out.println("Late Fee: $" + action.calcLateFees(6));
        System.out.println(comedy);
        System.out.println("Late Fee: $" + comedy.calcLateFees(6));
        System.out.println(drama);
        System.out.println("Late Fee: $" + drama.calcLateFees(6));
    }
}
