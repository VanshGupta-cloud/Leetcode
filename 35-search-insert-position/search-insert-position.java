class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int k=0;
        while(left<=right)
        {
         int mid=left+(right-left)/2;
          k=mid;
         if(nums[mid]==target)
         {
            return mid;
         }
         else if(nums[mid]>target)
         {
             right=mid-1;
         }
         else{
           left=mid+1;
         }
        }
        if(nums[k]>target)
        return k;
        else
        return k+1;
    }
}