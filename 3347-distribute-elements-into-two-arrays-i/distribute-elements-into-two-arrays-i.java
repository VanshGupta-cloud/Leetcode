class Solution {
    public int[] resultArray(int[] nums) {
        int l=0;
        int r=0;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
       for(int i=2;i<nums.length;i++)
       {
          if(list1.get(l)>list2.get(r))
          {
            list1.add(nums[i]);
            l++;
          }
          else
          {
            list2.add(nums[i]);
            r++;
          }
       }
       int[] c=new int[nums.length];
       int i=0;
      for(int x:list1)
      {
        c[i]=x;
        i++;
      }
      for(int x:list2)
      {
        c[i]=x;
        i++;
      }
      return c;
    }
}