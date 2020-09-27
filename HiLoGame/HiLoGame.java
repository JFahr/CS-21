
/**
 * CS21 - Java Programming
 * Author: Joseph Fajardo
 * Assignment: Project 3
 * Instructor: Prof. Kyle Muldrow
 * 
 * Name of class: HiLoGame
 */
import java.util.*;
public class HiLoGame
{
    public static void main(String[] args)
    {
        int number;
        int guess;
        int count=0;
        Scanner scan= new Scanner(System.in);
        Random r=new Random();
        number=r.nextInt(100)+1;
        do
        {
            System.out.print("Guess a number between 1-100: ");
            guess=scan.nextInt();
            if(guess>number)
            {
                System.out.println("INCORRECT!!! Number is lower than "+guess+".");
                System.out.println();
            }
            else
            System.out.println("INCORRECT!!! Number is higher than "+guess+".");
            System.out.println();
            count++;
        }while(guess!=number);
        System.out.println("CORRECT!!!");
        System.out.println("It only took you "+count+" guesses.");
    }
}
