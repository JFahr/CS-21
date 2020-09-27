
/**
 * Write a description of class EggStop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EggStop
{
    public static void main (String[] args)
    {
     System.out.println();
     hex();
     teaCup();
     stopSign();
     hat();
    }//end main
    
    public static void hex()
    {
        topHalf();
        bottomHalf();
        System.out.println();
    }//end of hex
    
    public static void teaCup()
    {
        bottomHalf();
        line();
        System.out.println();
    }//end of teaCup
    
    public static void stopSign()
    {
        topHalf();
        System.out.println("|  STOP  |");
        bottomHalf();
        System.out.println();
    }//end of stopSign
    
    public static void hat()
    {
        topHalf();
        line();
    }//end hat
    
    public static void topHalf()
    {
        System.out.println("  ______  ");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }//end topHalf
    
    public static void bottomHalf()
    {
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------  ");   
    }//end bottomHalf
    
    public static void line()
    {
        System.out.println("+--------+");
    }//end line
}//end ICA2