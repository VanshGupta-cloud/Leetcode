class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
       int n=time.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++)
       { int k=time[i]%60;
       int target=(60-k)%60;
        if(map.containsKey(target))
        {
           count+=map.get(target);
        }
        map.put(k,map.getOrDefault(k, 0) + 1);
        
       }
       return count;
    }
}