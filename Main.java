import java.util.*;

class Main {

static int count = 0;

   public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
      System.out.println("This is a student module:");
      
      


      while(true){
         System.out.println("Please enter the following numbers 1-4 for the following tasks  \n   1-Enter a new Student  \n   2-Enter a new Course  \n   3-Enter a new Assessment  \n   4-To add new Student  \n   5-quit    ");
        
         String nameCourse = "null";
       
   
        
         
      
       //Enter n + 3 number of students since the first number is always in index 1
         
         Student s[] = new Student[4];
         
         s[count] = new Student();
         Course c1=new Course(nameCourse);
         
         
      
      
          
       
      
         String task = myObj.nextLine();  // Read user input
       
         if (task.equals("1")){
            System.out.println("Enter New Student: ");
                
            System.out.println();
            s[count].setNameAndStudentNum();  // Output user input
            System.out.println();
            
            System.out.println(s[count].toString());
            System.out.println(count);
            
            count = count + 1;
         

         
           
       
         }
         
         else if (task.equals("2")){
            System.out.println("add a student in the course class"  );
            
            c1.setNumberOfStudents(s[count]);
    
            System.out.println();
            c1.AddCourse(s[count]); // Output user input
         
         }
         else if (task.equals("3")){
            System.out.println("task is: " + task);  // Output user input
         
         }
         
         
         else if (task.equals("5")){
            System.out.println("Good Bye");  // Output user input
         
            break;
         }
         else{
            System.out.println("Invalid response... Try Again");
            continue;
         }
       
      
      
      
      }
    
    
    
   }
}