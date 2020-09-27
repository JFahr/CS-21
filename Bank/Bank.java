
/**
 * Author:Joseph Fajardo
 * CS-21
 * Professor:Kyle Muldrow
 * Assignment:Project 2
 */
public class Bank
{
    public static void main (String [] args)
    {
        Table(1000,25,.065,100);
    }
    public static void Table( int x, int i, double z, int y)
    {
        int Balance=x;
        System.out.print("Year\tInterest\tDeposit\t\tNew Balance\n");
        System.out.println("1\t\t\t$"+Balance+"\t\t$"+Balance+".00");
        double NewBalance=1000.00;
        for(int j=2;j<26;j++)
        {
            NewBalance=((NewBalance+y)*z)+NewBalance+y;
            System.out.println(j+"\t"+"65%"+"\t\t$"+y+"\t\t$"+Table(NewBalance));
        }
    }
    public static double Table(double x)
    {
        return (int) (x * 100) / 100.0; 
    }
}