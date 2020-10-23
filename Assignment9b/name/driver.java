
/**
 * This class checks to make sure all the methods work correctly.
 *
 * Jhonatan Roopnarine
 * 02/26/2020
 */
public class driver{
public static void main(String [] args){
    //Call the constructor
    Name name1 = new Name ();
    Name name2 = new Name("Jhonatan", 'B', "Roopnarine");
    Name name3 = new Name("Jhonatan", "Roopnarine");
    //Initialize name1,name2 and name3
    name1.readName();
    name2.readName();
    name3.readName();
    System.out.println();
    //Print the name that comes alphabetically after going through the loop
    if (name1.precedes(name2))
    {
        if(name1.precedes(name3))
        {
            System.out.println(name1);
        }
        else
        {
            System.out.println(name3);
        }
    }
    else
    {
        if (name2.precedes(name3))
        {
            System.out.println(name2);
        }
        else
        {
            System.out.println(name3);
        }
    }
}
}

        
        
        
    

    
