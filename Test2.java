import java.util.Arrays;
public class Test2{

   public static void main(String args[])
   {
      int nums[] = {5, 17, 9, 7, 4, 6, 1, 0};
      
      int n = nums.length;
      for (int i = 0; i < n-1; i++){
      
         System.out.println(i);
         for (int j = 0; j < n; j++){
            if (nums[j-1] > nums[j])
            {
                    // swap temp and nums[i]
               int temp = nums[j-1];
               nums[j-1] = nums[j];
               nums[j] = temp;
               
               System.out.println("The answer is : " + Arrays.toString(nums));
              

               
               
          
            }
            }
            
            }
            
            

            
   }
   
       


                
}                
               


