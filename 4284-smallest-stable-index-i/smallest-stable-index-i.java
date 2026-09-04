class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[]store=new int[n];
        store[n-1]=nums[n-1];
        int min=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
           min=Math.min(min,nums[i]);
           store[i]=min;
        }
        int max=nums[0];
        for(int i=0;i<n;i++)
        {
           max=Math.max(max,nums[i]);
           if(max-store[i]<=k)
           return i;
        }       
        return -1;
    }
}