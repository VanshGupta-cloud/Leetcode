class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int ps=0;
        int minps=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            ps+=nums[i];
            minps=Math.min(minps,ps);
        }
        if(minps>0)return 1;
        else
        return Math.abs(minps)+1;
    }
}