import java.util.*;
/**
 * CS21 - Java Programming
 * Author: Joseph Fajardo
 * Assignment: Chapter 3 Homework
 * Instructor: Prof. Kyle Muldrow
 */
public class Cone
{
    public static void main (String [] args)
    {
        Scanner kb=new Scanner(System.in);
        getSurfaceArea(kb);
    }
    public static void getSurfaceArea(Scanner scan)
    {
        System.out.print("Enter the radius of the Cone: ");
        double radius=scan.nextDouble();
        System.out.print("Enter the height of the Cone: ");
        double height=scan.nextDouble();
        double area;
        double a =Math.PI*radius;
        double b=Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        double c=Math.PI*Math.pow(radius,2);
        area=a*b+c;
        System.out.println("The area of the Cone is " + area);
    }
}
