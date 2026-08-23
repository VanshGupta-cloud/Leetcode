class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev0=cost[0];
        int prev1=cost[1];
        int minval=0;
        for(int i=2;i<n;i++)
        {
         minval=Math.min(prev0+cost[i],prev1+cost[i]);
         prev0=prev1;
         prev1=minval;
        }
        return Math.min(prev0,prev1);
    }
}