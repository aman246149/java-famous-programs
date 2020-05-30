import java.util.*;
class Solution {
    public static int searchInsert(int[] nums, int target) {
      int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                count=i;
             break;
                
            }
           
            System.out.println(count);
        }
        return count;
        
    }


     
      public static void main(String[] args)
      {
      int [] aman={1,3,5,6};
      int nofrom;
      nofrom=searchInsert(aman,5);
      System.out.println(nofrom);
      
      }
}
