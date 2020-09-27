import java.util.*;
/**
 * Write a description of class ERA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ERA
{
    public static void main (String[] args)
    {
        int totalRuns=0;
        double totalInnings=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter players Name: ");
        String name=scan.nextLine();
        System.out.print("Enter the number of starts " + name + " had in the month: ");
        int starts=scan.nextInt();
        if(starts<=0)
        {
            System.out.println("There is no data for the pitcher " + name);
        }
        else
        for (int i=1;i<=starts;i++)
        {
            System.out.print("Enter number of allowed runs for Start "+ i +": ");
            int runs=scan.nextInt();
            System.out.print("Number of innings pitched in Start "+ i +": ");
            double innings=scan.nextDouble();
            totalRuns+=runs;
            totalInnings+=innings;
            System.out.println();
        }
        double ERA=(totalRuns/totalInnings)*9;
        System.out.println("Pitcher: "+name);
        System.out.println("Earned Runs: "+totalRuns);
        System.out.println("Innings Pitched: "+totalInnings);
        System.out.printf("ERA:  %.2f %n", ERA);
    }
}
