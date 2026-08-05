class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
        int x=nums[0];
        int y=nums[nums.length-1];
        HashSet<Integer> set=new LinkedHashSet<>();
       
        while(x<=y)
        {
            set.add(x);
            x+=1;
        }
         for(int j=0;j<nums.length;j++)
        {
            if(set.contains(nums[j]))
            {
               set.remove(nums[j]);
            }
        }
        return new ArrayList<>(set);
        
    }
}