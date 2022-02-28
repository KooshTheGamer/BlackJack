package Assignments;
import java.util.*;

public class Gradebook 
{

    public static void main(String args[])
    {
        Scanner readLine = new Scanner(System.in);
        HashMap<String, Double> gradebook = new HashMap<String, Double>();
    

        while (true)
        {
            String newStudent =  readLine.nextLine();
            System.out.println("New Student (type 'end' to end): ");
            
            if (newStudent == "end")
            {
                break;
            }
            else
            {
                Double newGrade = readLine.nextDouble();
                System.out.println("Student Grade: ");
                gradebook.put(newStudent, newGrade);


                System.out.println()
            }
    
        }
        
    }




}
