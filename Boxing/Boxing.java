import java.util.*;
/**
 * Write a description of class Boxing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boxing
{
    public static void main (String [] args)
    {
        double weight =0.0;
        String name;
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter boxer's name: ");
        name=kb.nextLine();
        System.out.print("Enter weight for "+name+": ");
        weight=kb.nextDouble();
        
        if(isFeatherweight(weight))
        {
            System.out.println(name+" is a featherweight.");
        }
        else if(isFlyweight(weight))
        {
            System.out.println(name+" is a flyweight.");
        }
        else if(isBantamweight(weight))
        {
            System.out.println(name+" is a bantamweight");
        }
        else if(isLightweight(weight))
        {
            System.out.println(name+" is a lightweight.");
        }
        else if(isLightwelterweight(weight))
        {
            System.out.println(name+" is a light welterweight.");
        }
        else if(isWelterweight(weight))
        {
            System.out.println(name+" is a welterweight.");
        }
        else if(isMiddleweight(weight))
        {
            System.out.println(name+" is a middleweight.");
        }
        else if(isLightheavyweight(weight))
        {
            System.out.println(name+" is a light heavyweight.");
        }
        else
        {
            System.out.println(name+" is a heavyweight");
        }
    }//end main
    
    public static boolean isFeatherweight(double w)
    {
        return (w>=105.0 && w<=114.5);
    }//end isFeatherweight
    
    public static boolean isFlyweight(double w)
    {
        return (w>=114.6 && w<=123.4);
    }
    
    public static boolean isBantamweight(double w)
    {
        return (w>=123.5 && w<=132.2);
    }
    
    public static boolean isLightweight(double w)
    {
        return (w>=132.3 && w<=141.0);
    }
    
    public static boolean isLightwelterweight(double w)
    {
        return (w>=141.1 &&w<=152.0);
    }
    
    public static boolean isWelterweight(double w)
    {
        return (w>=152.1 && w<=165.2);
    }
    
    public static boolean isMiddleweight(double w)
    {
        return (w>=165.3 && w<=178.5);
    }
    
    public static boolean isLightheavyweight(double w)
    {
        return (w>=178.6 && w<=200.5);
    }
}//end Boxing class
