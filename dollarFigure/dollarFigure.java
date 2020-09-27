
/**
 * CS21 - Java Programming
 * Author: Joseph Fajardo
 * Assignment:Chapter 2 Homework
 * Instructor: Prof. Kyle Muldrow
 */
public class dollarFigure
{
    public static void main (String[] args)
    {
        for (int line=1;line<=5;line++)
        {
            System.out.println();
            //loop for dashes on left of each line
            for (int i=5;i>=line;i--)
            {
                System.out.print("-");
            }
            //loop for dollars sign on each line
            for(int i=1;i<=2*line-1;i++)
            {
                System.out.print("$");
            }
            //loop for dashes on right of each line
            for (int i=5;i>=line;i--)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
