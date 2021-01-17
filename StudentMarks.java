// Using .substring(begin, end)
import java.util.*;
public class StudentMarks

{
   public static void main (String[] args)
   {
   
   ClassAverageMarks classroom1 = new ClassAverageMarks(4);
   
   StudentClass Student1 = new StudentClass("Mukund", 3);
   StudentClass Student2 = new StudentClass("Rishabh", 3);
   StudentClass Student3 = new StudentClass("Mom", 3);
   StudentClass Student4 = new StudentClass("Dad", 3);
   
   
   
   System.out.println(Student1.toString());  
   System.out.println(Student2.toString()); 
   System.out.println(Student3.toString());
   System.out.println(Student4.toString()); 
   
   System.out.println("The class average is: " + classroom1.getAverage());
   
   System.out.println(Student1.getAssignmentGrade());

          
    
      
      
      
                   
      
   } // main method
} // DemoSubstring1 class