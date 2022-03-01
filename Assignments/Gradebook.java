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
            
            System.out.println("New Student (type 'end' to end): ");
            String newStudent =  readLine.nextLine();
            if (newStudent == "end")
            {
                break;
            }
            else
            {
                System.out.println("Student Grade: ");
                Double newGrade = readLine.nextDouble();
                
                gradebook.put(newStudent, newGrade);
            
                
                
            }
    
        }
        
    }




}
