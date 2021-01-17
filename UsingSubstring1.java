// Using .substring(begin, end)
public class UsingSubstring1
{
   public static void main (String[] args)
   {
      String subject = "Hello World";
      int length = subject.length();
      System.out.println("The Length is: " + length );
      int j;
      System.out.println(subject);
      System.out.println("01234567891011");
      System.out.println();
      		
      for (int i = 0 ; i <= length/2 ; i++) // i = i +1
      {
         j = length - i;
         System.out.println ("substring (" + i + " ," + j + ") returns \"" + subject.substring(i, j) + "\"");
      } // end for
   } // main method
} // DemoSubstring1 class
