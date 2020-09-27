import java.util.*;
import java.io.*;
/**
 * Write a description of class Files here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Files
{
    public static void main (String [] args) throws FileNotFoundException
    {
        Scanner input = new Scanner (new File ("baseball.txt"));
        int count = 0;
        while(input.hasNextLine())
        {
            System.out.println("input: " + input.nextLine());
            count++;
        }
        System.out.println(count + " total");
    }//end main
}//end Files class
