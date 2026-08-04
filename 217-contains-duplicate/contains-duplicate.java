class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
        int i=0;
        while(i<n)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
            i++;
        }
        return false;
    }
}