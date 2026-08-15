class Solution {
    public int longestSubsequence(int[] nums) {
        //note : x^x=0 and x^0=x
        /*logic : if the totalxor is non-zero then return nums.length 
        and if not(totalxor=0) then check if the nums array has a non zero 
        element to be removed, by removing just one non zero element the 
        totalxor would be shifted from being zero( we check and remove only non zero because
         , zero does'nt make any difference )*/
         int hasnonzero=0;
         int totalxor=0;
         for(int i=0;i<nums.length;i++)
         {
           totalxor^=nums[i];
           if(nums[i]!=0)
           {
            hasnonzero=1;
           }
         }
         if(totalxor!=0)
         {
            return nums.length;
         }
         else
         {
            if(hasnonzero==1)
            {
                return nums.length-1;
            }
            else
            {
                return 0;
            }
         }
        
        
        
    }
}