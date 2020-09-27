
/**
 * CS21 - Java Programming
 * Author:Joseph Fajardo
 * Assignment: Project 4
 * Instructor:Prof. Kyle Muldrow
 */
import java.util.*;
public class Project4
{
    public static void main (String [] args)
    {
        int x=4;
        int y=4;
        int[][] Array;
        Array=setArray(x,y);
        display(Array,x,y);
        System.out.println();
        rowAvg(Array,x,y);
        System.out.println();
        colAvg(Array,x,y);
        System.out.println();
    }//end main
    
    public static int [][]setArray(int rows, int cols)
    {
        int [] [] a=new int[rows][cols];
        for(int row=0;row<a.length;row++)
        {
            for(int col=0;col<a[row].length;col++)
            {
             Random r=new Random();
             int number=r.nextInt(20)+1;
             a[row][col]=number;
            }
        }
        return a;
    }//end setArray method
    
    public static void display(int[][] a, int b, int c)
    {
        for(int row=0;row<b;row++)
        {
            for(int col=0;col<c;col++)
            {
             System.out.printf("%-3d", a[row][col]);   
            }
            System.out.println();
        }
    }//end display method
    
    public static void rowAvg(int[][]a,int b,int c)
    {
        for(int row=0;row<b;row++)
        {
            double Average=0.0;
            for(int col=0;col<c;col++)
            {
                Average+=a[row][col];   
            }
            double average=Average/c;
            System.out.printf("The average of row "+ (row+1)+" is : %.2f",average);
            System.out.println();
        }
    }//end rowAvg method
    
    public static void colAvg(int[][]a,int b,int c)
    {
        for(int row=0;row<b;row++)
        {
            double Average=0.0;
            for(int col=0;col<c;col++)
            {
                Average+=a[col][row];   
            }
            double average=Average/c;
            System.out.printf("The average of column "+ (row+1)+" is : %.2f",average);
            System.out.println();
        }
    }//end colAvg method
}//end class
