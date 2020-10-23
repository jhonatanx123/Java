 
/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
public class BinFile
{
   public static void main(String[] args)
   {
       String textFileName = "records.txt";
       String binFileName = "recs.bin";
       System.out.println("Attempting to read records from " + textFileName + "..");
       ArrayList<Record> records = readDataFromTextFile(textFileName);
       System.out.println("\nAttempting to write records to " + binFileName + "..");
       writeToBinFile(binFileName, records);
       System.out.println("\nAttempting to read records from " + binFileName + "..");
       readFromBinFileAndDisplayRecords(binFileName);
   }
   private static ArrayList<Record> readDataFromTextFile(String filename)
   {
       ArrayList<Record> recs = new ArrayList<>();
       Scanner fileReader;
       try
       {
           fileReader = new Scanner(new File(filename));
           while(fileReader.hasNextLine())
           {
               String[] data = fileReader.nextLine().trim().split(",");
               String firstName = data[0];
               String lastName = data[1];
               int age = Integer.parseInt(data[2]);
               recs.add(new Record(firstName, lastName, age));
           }
           fileReader.close();
           System.out.println(recs.size() + " records were read successfully.");
       }
       catch(FileNotFoundException fnfe)
       {
           System.out.println(filename + " does not exist");
           System.exit(0);
       }
       return recs;
   }
   private static void writeToBinFile(String filename, ArrayList<Record> recs)
   {
       File file = new File(filename);
       FileOutputStream fos;
       try
       {
           fos = new FileOutputStream(file);
           for(Record rec : recs)
           {
               String line = rec.toString();
               byte[] data = line.getBytes(StandardCharsets.UTF_8);
               fos.write(data);
               fos.write(System.lineSeparator().getBytes());
           }
           fos.close();
           System.out.println("Data has been written to " + filename);
       }
       catch(IOException ioe)
       {
           System.out.println("Error in writing to " + filename);
           System.exit(0);
       }
   }
   private static void readFromBinFileAndDisplayRecords(String filename)
   {
       ArrayList<Record> recs = new ArrayList<>();
       File file = new File(filename);
       FileInputStream fis;
       try
       {
           fis = new FileInputStream(file);
           byte[] bytes = new byte[4096];
           while(fis.available() > 0)
           {
               fis.read(bytes);
               String chunk = new String(bytes).trim();
               String[] lines = chunk.split("\\n");
               for(String eachLine : lines)
               {
                   String[] tokens = eachLine.trim().split(",");
                   String firstName = tokens[0];
                   String lastName = tokens[1];
                   int age = Integer.parseInt(tokens[2]);
                   recs.add(new Record(firstName, lastName, age));
               }
           }
           fis.close();
       }
       catch(IOException ioe)
       {
           System.out.println("Error in reading " + filename + ": " + ioe.getMessage());
           System.exit(0);
       }
       System.out.println(recs.size() + " records were read successfully.\n\n"+ "Displaying the records..");
       for(Record rec : recs)
           System.out.println(rec.getFirstName() + " " + rec.getLastName() + " - " + rec.getAge() + " years");
       System.out.println();
   }
}