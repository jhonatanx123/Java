
/**
 * Assignment 14b
 * A class called Movie that can be used with your video 
 * rental business. The Movie class should track the movie 
 * Picture Association of America (MPAA) rating (e.g., Rated G, PG, PG-13, R), 
 * ID Number, and movie title with appropriate accessor and mutator methods.
 * Also, create an equals() method that overrides Object's method, where two 
 * movies are equal if their ID number is identical.
 *
 * Maninder Singh
 * 04/26/202
 */

import java.util.Scanner;
//Make the Movie class
public class Movie
{
    //initialize variables
    private String rating;
    private int ID;
    private String title;
    //Set each variable
    public Movie()
    {
        rating = "";
        ID = 0;
        title = "";
    }
    //Accept a rating, id and title
    public Movie(String aRating, int aID, String aTitle)
    {
        rating = aRating;
        ID = aID;
        title = aTitle;
    }
    //Return the rating
    public String getRating()
    {
        return rating;
    }
    //Set the rating but return nothing
    public void setRating(String aRating)
    {
        rating = aRating;
    }
    //Return the ID
    public int getID()
    {
        return ID;
    }
    //Set the ID but return nothing
    public void setID(int aID)
    {
        ID = aID;
    }
    //Return the title 
    public String getTitle()
    {
        return title;
    }
    //Set the title but return nothing
    public void setTitle(String aTitle)
    {
        title = aTitle;
    }
    //Return the late fee
    public double calcLateFees(int days)
    {
        return 2.0 * days;
    }
    //If nothing is entered return false
    //If information does not match return false
    //Else return rating, ID, title
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        else if(getClass() != obj.getClass())
            return false;
        else
        {
            Movie other = (Movie)obj;
            return (rating.equals(other.rating) && ID == other.ID 
                    && title.equals(other.title));
        }
    }
    //Return rating, ID and title
    public String toString()
    {
        return "\nMPAA Rating: " + rating + "\nID Number: " + ID
                + "\nMovie Title: " + title;
    }
}