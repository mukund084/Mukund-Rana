// Using .substring(begin, end)
import java.util.*;
public class LastNameFirst
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      
      // Step 1 - Variables
      
      System.out.println("Enter Your Name: "); 
      String fullName = in.nextLine();
     
      String[] firstName = fullName.split(" "); 
      
      System.out.print(firstName[1].toUpperCase() + " " + firstName[0].toLowerCase());
      
             
      
   } // main method
} // DemoSubstring1 class
