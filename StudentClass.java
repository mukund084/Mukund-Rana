import java.util.*;

public class StudentClass
{

   Scanner marksInput = new Scanner(System.in);

   ArrayList<Double> assignMarks = new ArrayList<Double>(); // Array list to store all the marks for numbers of assignments

   public int assignNumber = 0;  // What inputted number -1 is used to find the assignment. 

   private static int assignTotal;      // Total Number of Assignment

   public double total = 0; 

   public String names; 


// Constructor 
// Parameters are the name of student of total number of assignments 
   public StudentClass(String names, int assignTotal){
   
   // Defining the name and amount of assignments entered into the parameter 
   
      this.names = names; 
      this.assignTotal = assignTotal;
   
   // Enters a mark and calculates the total when adding up the marks 
   
      for (int i = 1; i <= this.assignTotal; i++){
      
         System.out.println("Please input mark for assigmnet " + i);
      
         double inputMark = marksInput.nextDouble();
      
         assignMarks.add((i-1),inputMark);
      
         this.total += inputMark;
      
      
      }
   
   
   
   }

   // Gets the name of student
   
   public String getNames (){
     
      return this.names;
     
   }
   

   // Gives the student Average
   
   public double getStudentAverage(){
   
      return ((this.total/assignTotal)*100.0)/100.0;
   
   }
   
   // Gives the individual grade for each assignment 

   public double getAssignmentGrade(){
   
      System.out.println("What assignment do you want to get: ");
      int assignIndexNumber = (int)(marksInput.nextInt()-1);
   
      return assignMarks.get(assignIndexNumber);
   
   
   }
   

   // Prints students name and average
   
   public String toString (){
     
      return "Student Name: " + this.names + " Average is: " + this.getStudentAverage();
     
     
   }
   
   
   
   
   




}