import java.util.*;
/**
 * Write a description of class ACT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ACT
{
    public static void main (String [] args)
    {
        int score;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter an ACT Score (1-36): ");
        score=kb.nextInt();
        System.out.println("ACT score of " + score + " is " + rating(score));
    }//end main
    public static String rating(int s)
    {
        if(s<1 || s>36)
        {
            throw new IllegalArgumentException("Score must be between 1 and 36.");
        }
        else if(s<15)
        {
            return "not competitive";
        }
        else if (s<=27)
        {
            return "competitive";
        }
        return "highly competitive";
    }//end rating
    
}//end ACT class
