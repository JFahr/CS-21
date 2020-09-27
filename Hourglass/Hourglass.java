
/**
 * CS21 - Java Programming
 * Author: Joseph Fajardo
 * Assignment: Project 1 Hourglass
 * Instructor: Prof. Kyle Muldrow
 */
public class Hourglass
{
   public static void main (String[] args)
   {
       System.out.println();
       Line();
       topHalf();
       System.out.println("     ||");
       bottomHalf();
       Line();
    }
    public static void Line()
    { 
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }//end of Line
    public static void topHalf()
    {//beginning of method
        //loop for rows
        for (int i=1;i<=4;i++)
        {
            //loop for spaces on left
            for (int x=1;x<=i;x++)
            {
                System.out.print(" ");
            }//end loop of spaces
            System.out.print("\\");
            //loop for colons
            for(int y=10-(2*i);y>=1;y--)
            {
                System.out.print(":");
            }//end loop colons
            System.out.println("/");
        }//end loop rows
    }//end of topHalf
    
    //bottomHalf method
    public static void bottomHalf()
    {
        //loops for rows
        for(int i=1;i<=4;i++)
        {
            //loops for spaces
            for (int x=4;x>=i;x--)
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for(int y=1;y<=2*i;y++)
            {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }//end of bottomHalf
}//end of class
