
/**
 * Write a description of class Cubes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cubes
{
    public static void main(String [] args)
    {
        //Use a loop to display cubes of numbers 1-7
        for(int x=1; x<=7; x++)
        {
            System.out.println(x + " cubed is " + x*x*x);
        }//end for loop
        System.out.println();
        //Use a loop to display cubes of numbers from 7 to 1
        for (int x=7;x>=1;x--)
        {
            System.out.print(x*x*x + " ");
        }//end for loop
        System.out.println();
        System.out.println("Author : Joseph Fajardo");
    }//end main
}//end Cubes class
