class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
     int left=0;
     
     HashMap<Integer,Integer> map=new HashMap<>();
      int maxlen=Integer.MIN_VALUE;
     for(int right=0;right<nums.length;right++)
     {  //setting till every map freq reaches k=2
        map.put(nums[right],map.getOrDefault(nums[right],0)+1);

        //shrinking left because hashmap value for right>k,means extra freq is added to the map
        while(map.get(nums[right])>k)
        {
          map.put(nums[left],map.get(nums[left])-1);
          left++;
        }
         maxlen=Math.max(maxlen,right-left+1);
     }
     return maxlen;
    }
}