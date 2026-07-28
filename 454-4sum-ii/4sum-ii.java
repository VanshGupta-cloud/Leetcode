class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        HashMap <Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int a:nums1)
        {
           for(int b:nums2)
           {
            map.put(a+b,map.getOrDefault(a+b, 0) + 1);
           }
        }
        for(int a:nums3)
        {
            for(int b:nums4)
            {
                int target=-(a+b);
                if(map.containsKey(target))
                {
                    count+=map.get(target);
                }
            }
        }
        return count;
    }
}