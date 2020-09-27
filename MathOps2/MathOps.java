import java.util.*;
/**
 * Write a description of class MathOps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOps
{
    public static void main (String [] args)
    {
        double num1, num2;
        char op;
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1=kb.nextDouble();
        System.out.print("Enter another number: ");
        num2=kb.nextDouble();
        System.out.print("Enter A to add, S to subtract, M to multiply, D to divide: ");
        op=kb.next().charAt(0);
        if(op=='a' || op == 'A')
        {
            System.out.println(num1+ " + "+num2+ " = "+ (num1+num2));
        }
        else if (op == 's' || op== 'S')
        {
            System.out.println(num1 +" - " + num2 + " = " + (num1-num2));
        }
        else if (op == 'm' || op == 'M')
        {
            System.out.println(num1 +" * " + num2 + " = " + (num1*num2));
        }
        else if ((op == 'd' || op == 'D') && num2!=0)
        {
            System.out.println(num1 +" / " + num2 + " = " + (num1/num2));
        }
        else
        {
            System.out.println("Invalid operation.");
        }// end if-else
    }//end main
}//end MathOps class
