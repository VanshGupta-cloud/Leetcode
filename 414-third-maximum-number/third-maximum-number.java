class Solution {
    public int thirdMax(int[] nums) {
        Long first=Long.MIN_VALUE;
        Long second=Long.MIN_VALUE;
       Long third=Long.MIN_VALUE;
           int n=nums.length;        
           for(int i=0;i<n;i++)
           {  if(first==nums[i]||nums[i]==second||nums[i]==third)
           {
            continue;
           }
              if(nums[i]>first)
              {
                third=second;
                second=first;
                first=(long)nums[i];
              }
              else if(nums[i]>second)
              {
                third=second;
                second=(long)nums[i];
              }
              else if(nums[i]>third)
              {
                third =(long)nums[i];
              }
           }
           if(third==Long.MIN_VALUE)
           {
            return first.intValue();
           }
           else
           {
            return third.intValue();
           }

    }
}