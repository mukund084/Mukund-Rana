import java.util.*;
import java.util.ArrayList;

class Course{
	
   private String CourseName;
   private ArrayList<Student> studentList;
  Scanner nameInput = new Scanner(System.in);
  
   public Course(String CourseName){
   
 
   
      this.CourseName = CourseName;
   }
   
   
   public void setNumberOfStudents(Student s1){
   
      studentList = new ArrayList<Student>();
   
      s1 = new Student();
   
      this.studentList.add(s1);
   
   }
   
     public int getNumberOfStudents(Student s1){
   
   
      return  this.studentList.size();      
      
   }
   
   
   
   public void AddCourse(Student s1){
   
   System.out.println("Enter Course name:  ");
   CourseName = nameInput.nextLine();
   this.CourseName = CourseName;
   System.out.println("Student Course is:" + CourseName);
   System.out.println("Number of students in course is : " + this.studentList.size());


   
    
   }
   
  
	
	
}


