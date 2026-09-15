class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int allow=n/2;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(candyType[i]);
        }
        int max=set.size();
        if(max<=allow)
        {
            return max;
        }
        else{
            return allow;
        }
    }
   
}