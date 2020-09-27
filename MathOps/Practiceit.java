
/**
 * Write a description of class Practiceit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practiceit
{
    public static void main (String [] args)
    {
        System.out.println();
        first();
        third();
        second();
        third();
    }
    public static void first()
    {
        System.out.println("Inside first method.");
    }
    public static void second()
    {
        System.out.println("Inside second method");
        first();
    }
    public static void third()
    {
        System.out.println("Inside third method.");
        first();
        second();
    }
}
