import java.util.*;
import java.io.*;
/**
 * Write a description of class Coins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coins
{
    public static void main (String [] args ) throws FileNotFoundException
    {
        File f = new File("coins.txt");
        Scanner input = new Scanner(System.in);
        countCoins(input);
    }

    public static void countCoins( Scanner x)
    {
        double total = 0.0;
        while(x.hasNext())
        {
            int count =x.nextInt();
            String coinType = x.next();
            coinType=coinType.toLowerCase();
            if(coinType.equals("quarters"))
            {
                total+=.25*count;
            }
            else if(coinType.equals("nickels"))
            {
                total+=count*.05;
            }
            else if(coinType.equals("dimes"))
            {
                total+=count*.1;
            }
            else if(coinType.equals("pennies"))
            {
                total+=count*.01;
            }
        }
        System.out.printf("Total money: $%.2f\n",total);
    }
}
