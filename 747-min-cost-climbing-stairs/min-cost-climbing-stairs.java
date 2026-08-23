class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]arr=new int[n];
        arr[0]=cost[0];
        arr[1]=cost[1];
        int minval=0;
        for(int i=2;i<n;i++)
        {
         minval=Math.min(arr[i-1]+cost[i],arr[i-2]+cost[i]);
         arr[i]=minval;
        }
        return Math.min(arr[n-1],arr[n-2]);
    }
}