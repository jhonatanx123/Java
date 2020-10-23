
/**
 * This class checks to make sure all the methods work correctly.
 *
 * Jhonatan Roopnarine
 * 02/20/2020
 */
public class driver
{
public static void main(String [] args) {
    Name name1 = new Name ();
    Name name2 = new Name("Jhonatan", 'B', "Roopnarine");
    Name name3 = new Name("Jhonatan", "Roopnarine");
    name1.readName();
    name1.writeName();
    System.out.println(name1.equals(name2));
    }
}