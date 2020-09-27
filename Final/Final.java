
/**
 * CS21- Java Programming
 * Author:  Joseph Fajardo
 * Assignment: Final
 * Instructor: Prof. Kyle Muldrow
 */
import java.util.*;
import java.io.*;
public class Final
{
    public static void main (String []args) throws FileNotFoundException
    {
        int [] games= new int[20];
        int [] teams= new int[20];
        int [] goals= new int[20];
        String [] names= new String[20];
        int count=0;
        
        File f= new File("hockeydata.txt");
        Scanner input=new Scanner(f);
        while(input.hasNext())
        {
            games[count]=input.nextInt();
            teams[count]=input.nextInt();
            goals[count]=input.nextInt();
            names[count]=input.nextLine();
            count++;
        }//end of while loop
        printSentences(names, games, goals);
        System.out.println();
        printHighestLowest(names,goals);
        System.out.println();
        oneTeam(names,teams);
        System.out.println();
        thousand(names,games);
    }//end of main
    
    public static void printSentences(String []name, int [] game, int [] goal)
    {
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]+" scored "+goal[i]+" goals in "+game[i]+" games.");
        }//end of for loop
    }//end of printSentences method
    
    public static void printHighestLowest(String []name, int [] goal)
    {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        a=goal[0];
        b=goal[0];
        for(int i=1;i<goal.length;i++)
        {
            if(a<goal[i])
            {
                a=goal[i];
                c=i;
            }
            if(b>goal[i])
            {
                b=goal[i];
                d=i;
            }
        }//end of for loop
        System.out.println(name[c]+" has the highest goals with: "+goal[c]+" goals.");
        System.out.println(name[d]+" has the lowest goals with: "+goal[d]+" goals.");
    }//end of printHighestLowest method
    
    public static void oneTeam(String[] name, int[] team)
    {
        int a=0;
        System.out.println("The following players played with one team for their entire NHL careers:");
        for(int i=0;i<team.length;i++)
        { 
            if(team[i]==1)
            {
                System.out.println(name[i]);
            }//end of if statement
        }//end of for loop
    }//end of oneTeam method
    
    public static void thousand(String[] name, int[] game)
    {
        int a=0;
        System.out.println("The following players played 1000 or more game in their NHL careers:");
        for(int i=0;i<game.length;i++)
        { 
            if(game[i]>1000)
            {
                System.out.println(name[i]+"("+game[i]+")");
            }//end of if statement
        }
    }//end of thousand method
}//end of class
