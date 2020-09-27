import java.util.*;
/**
 * Stage1
 * CS21 - Java Programming
 * Author: Joseph Fajardo
 * Assigment: Midterm Exam
 * Instructor: Prof. Kyle Muldrow
 * 
 * Name of class: Midterm
 */
public class Midterm
{
    public static void main (String [] args)
    {
        double high1=0;
        double high2=0;
        int a=0;
        int b=0;
        String place1, place2;
        Scanner scan= new Scanner(System.in);
        //Stage 2
     System.out.println("Enter the name of the burger place: ");  
     place1=scan.nextLine();
     System.out.println("Enter the name of the second burger place: ");
     place2=scan.nextLine();
     System.out.println(place1.toUpperCase() +" vs "+place2.toUpperCase());
     System.out.println();
     //Stage3
     for(int i=1;i<6;i++)
     {
         int j=0;
         System.out.print("Enter burgers sold during day "+ i +" at "+place1+": ");
         j=scan.nextInt();
         a+=j;
         if(high1<j)
         {
             high1=j;
            }
            else
            high1=high1;
     }
     System.out.println();
        for(int i=1;i<6;i++)
        {
            int h=0;
         System.out.print("Enter burgers sold during day "+ i +" at "+place2+": ");
         h=scan.nextInt();
         b+=h;
         if(high2<h)
         {
             high2=h;
            }
            else
            high2=high2;
        }
        double average1=a/5;
        double average2=b/5;
        System.out.println();
        System.out.println("Total burgers sold at "+place1+" is "+a);
        System.out.printf("Average for "+place1+" is %.2f %n",average1);
        System.out.println();
        System.out.println("Total burgers sold at "+place2+" is "+b);
        System.out.printf("Average for "+place2+" is %.2f %n",average2);
        System.out.println();
        
        //Stage4
        String plus="+";
        int plus1=(int)average1/50;
        int plus2=(int)average2/50;
        System.out.print(place1+": ");
        for(int i=0;i<plus1;i++)
        {
            System.out.print(plus);
        }
        System.out.println();
        System.out.print(place2+": ");
        for(int i=0;i<plus2;i++)
        {
            System.out.print(plus);
        }
        System.out.println();
        
        //Stage 5
        double evaluate=average1-average2;
        double Evaluate=Math.abs(evaluate);
        if(Evaluate>300)
        {
            if(average1>average2)
            {
            System.out.println(place1+ " is annihilating "+place2);
        }
        else
        System.out.println(place2+ " is annihilating "+place1);
    }
    else if(Evaluate>200)
    {
        if(average1>average2)
            {
            System.out.println(place1+ " is trouncing "+place2);
        }
        else
        System.out.println(place2+ " is trouncing "+place1);
    }
    else if(Evaluate>100)
    {if(average1>average2)
            {
            System.out.println(place1+ " is beating "+place2);
        }
        else
        System.out.println(place2+ " is beating "+place1);
    }
    else 
    {
    System.out.println("The two places are neck and neck");
}
System.out.println("Total burgers sold at "+place1+" is "+a);
System.out.printf("Average for "+place1+" is %.2f %n",average1);
System.out.println("Highest single day sales for "+place1+" is "+high1);
System.out.println();
System.out.println("Total burgers sold at "+place2+" is "+b);
System.out.printf("Average for "+place2+" is %.2f %n",average2);
System.out.println("Highest single day sales for "+place2+" is "+high2);
}
}