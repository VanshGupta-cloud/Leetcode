class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
       Arrays.sort(nums);
       int maxlen=1;
        int count=1;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]==nums[i-1])continue;
        if(nums[i]==nums[i-1]+1)
        {
           count++;
           
        }
        else{
          maxlen=Math.max(maxlen,count);
          count=1;
        }
       }
       return Math.max(maxlen,count);
    }
}