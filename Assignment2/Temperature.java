import java.util.Scanner;
/**
 * You are going to write a program that reads 
 * in a temperature in degrees Kelvin 
 * and then prints the same temperature 
 * expressed in degrees Celsius and degrees Fahrenheit.
 *
 * Jhonatan Roopnarine
 * 
 */
public class Temperature
{
    public static void main (String args[])
    {
        Scanner keyb=new Scanner(System.in);
        //Get the temperature input in kelvin
        //Once you derive the Celcius formula, use the second formula to
        //convert into Fahrenhwewit
        //Print the temperature in Fahrenheit and Celcius
        System.out.println ("Enter temperature in Kelvin");
        double kelvin=keyb.nextDouble();
        double celcius=kelvin-273.15;
        double fahrenheit=(celcius*(1.8))+32;
        System.out.println ("The celcius value is" +celcius);
        System.out.println ("The fahrenheit value is" +fahrenheit);
    }
}

