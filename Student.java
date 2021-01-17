import java.util.*;

class Student{
	
   private String firstName;
   private String lastName;
   private int studentNumber;
	
   private ArrayList<Course> courseList;
   private ArrayList<Assessment> AssessmentList;
   
   private int mark; 
   
   private static int i = 0;  // public static since I want a class variable that can be accessed by other classes
   
   Scanner nameInput = new Scanner(System.in);
   
   
   public Student (){
   
      courseList = new ArrayList<>();
   
      this.courseList.add(new Course("Math"));
      this.courseList.add(new Course("English"));
      this.courseList.add(new Course("Science"));
      this.courseList.add(new Course("Comp-Sci"));
      
      AssessmentList = new ArrayList<>();
      
      this.AssessmentList.add(new Assessment("Project", mark));
      this.AssessmentList.add(new Assessment("Test", mark));
      this.AssessmentList.add(new Assessment("Assignment", mark));
      this.AssessmentList.add(new Assessment("Summative", mark));

   
   
      i++;
   
   }
	
   
   public void setNameAndStudentNum(){
   
      System.out.println("Enter your first name:  ");
   
      firstName = nameInput.nextLine();
      this.firstName = firstName;
   
      System.out.println("Enter your last name:  ");
   
      lastName = nameInput.nextLine();
      this.lastName = lastName;
   
      System.out.println("Enter your Student Number:  ");
   
      studentNumber = nameInput.nextInt();
      this.studentNumber = studentNumber;
   
   
   }
  
   
   public int getStudentNum(){
   
      return this.studentNumber; 
   
   
   }
   
   
   public String getName(){
   
      return this.firstName + this.lastName; 
   
   
   }
   
   public String toString(){
   
      return "Your Name is: " +  this.firstName + " " + this.lastName;
   
   
   }
   
   // Counts the number of students that created 
   
           
   public static int getcounter(){
   
      return i;
   }
	
	
	
	
	
	
	
}