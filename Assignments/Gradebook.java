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

        

        double lowestGrade = lowest(gradebook);
        int lowestStudent = 0;
        for(int i = 0; i < gradebook.length; i++)
        {
            if(lowestGrade == gradebook[i])
            {
               lowestStudent =  (i + 1);            
            }
        }

        double highestGrade = highest(gradebook);
        int highestStudent = 0;
        for(int i = 0; i < gradebook.length; i++)
        {
            if(highestGrade == gradebook[i])
            {
               highestStudent =  (i + 1);            
            }
        }

        System.out.println("Average Grade: " + average(gradebook));
        System.out.println("Student " + lowestStudent + " has the lowest grade with a " + lowestGrade);
        System.out.println("Student " + highestStudent + " has the highest grade with a " + highestGrade);
        
        
    }

    // This is 
    public static double average(double[] gradebook)
    {
        double total = 0;
        for(int i = 0; i < gradebook.length; i++)
        {
            total += gradebook[i];
        }

        return total / gradebook.length;
    }

    public static double lowest(double[] gradebook)
    {
        double lowest = gradebook[0];
        for(int i = 0; i < gradebook.length; i++)
        {
            if(lowest > gradebook[i])
            {
                lowest = gradebook[i];
            }

            
        }
        return lowest;
    }

    public static double highest(double[] gradebook)
    {
        double highest = gradebook[0];
        for(int i = 0; i < gradebook.length; i++)
        {
            if(gradebook[i] > highest)
            {
                highest = gradebook[i];
            }
            
  
        }
        return highest;
    }



}
