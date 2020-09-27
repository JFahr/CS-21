import java.util.*;
/**
 * Write a description of class BoxOffice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxOffice
{
    public static void main (String [] args )
    {
        int weeks;
        double total=0.0;
        Scanner kb = new Scanner(System.in);
        System.out.print("How many weeks of box office? ");
        weeks = kb.nextInt();
        double [] panther = new double[weeks];
        double[] incred = {269.4, 124.7, 81.2, 44.2, 46.2, 19.8};
        for(int x=0;x<panther.length;x++)
        {
            System.out.print("Enter box office for Week #" +(x+1)+": ");
            panther[x]=kb.nextDouble();
            total+=panther[x];
        }//end for loop
        
        for(int x=0;x<panther.length;x++)
        {
            System.out.println("For Week #"+(x+1)+", Black Panther made $"+panther[x]+" million.");
        }
        
        System.out.printf("Total for "+panther.length+" weeks is $%.1f million.\n",total);
        String[] titles = compare(panther, incred, "Black Panther", "Incredibles 2");
        int wk=1;
        for (String s:titles)
        {
            System.out.println(s + " had the bigger box office figures in week "+ wk);
            wk++;
        }//end for-each loop
    }//end main
    
    public static String [] compare(double m1[], double m2[], String t1, String t2)
    {
        String [] titles = new String [m1.length];
        for (int x=0;x<m1.length;x++)
        {
            if(m1[x]>m2[x])
            {
                titles[x]=t1;
            }
            else
            {
                titles[x]=t2;
            }//end if-else
        }//end for loop
        return titles;
    }//end compare
}//end BoxOffice class
