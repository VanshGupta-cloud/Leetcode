class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int count =0;
        int f=-1;
        int l=-1;
        while(s<=e)
        {  
            int mid = s+(e-s)/2;
            if(nums[mid]==target)
            {  f=mid;
              e=mid-1;
            }
            else if(nums[mid]<target)
            {
            s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
            s=0;
            e=nums.length-1;
         while(s<=e)
        {  
            int mid = s+(e-s)/2;
            if(nums[mid]==target)
            {  l=mid;
              s=mid+1;
            }
            else if(nums[mid]<target)
            {
            s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(f==-1&&l==-1)
        {
            return new int[]{-1,-1};
        }
        else
        return new int[]{f,l};
    }
}