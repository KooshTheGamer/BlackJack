package Assignments;
import java.util.*;

public class Gradebook 
{

    public static void main(String args[])
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("How many students? ");
        int numStudents = readLine.nextInt();
        
        double[] gradebook = new double[numStudents];

        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("Student " + (i + 1)  + " Grade: ");
            double grade = readLine.nextDouble();

            gradebook[i] = grade;
            
        }

        System.out.println("Average Grade: " + average(gradebook));


        
        
    }

    public static double average(double[] gradebook)
    {
        double total = 0;
        for(int i = 0; i < gradebook.length; i++)
        {
            total += gradebook[i];
        }

        return total / gradebook.length;
    }

    public static int lowest(double[] gradebook)
    {
        double lowest = gradebook[0];
        for(int i = 0; i < gradebook.length; i++)
        {
            if(gradebook[i] <= gradebook[i +1])
            {
                
            }
        }
    }



}
