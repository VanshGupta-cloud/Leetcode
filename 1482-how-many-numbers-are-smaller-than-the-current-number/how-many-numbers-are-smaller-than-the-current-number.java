class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[]freq=new int[101];
      for(int i=0;i<nums.length;i++)
      {
        freq[nums[i]]++;
      }
     int prefixsum=0;
      for(int i=0;i<freq.length;i++)
      {      
        int temp=freq[i];
        freq[i]=prefixsum;
        prefixsum+=temp;
      }
      for(int i=0;i<nums.length;i++)
      {
        nums[i]=freq[nums[i]];
      }
      return nums;
    }
}