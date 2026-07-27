class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        int m=intervals.length;
        int n=intervals[0].length;
//2d array sorted on the basis of first coloumn
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<int[]> list=new ArrayList<>();
          list.add(intervals[0]) ;     
         for(int i=1;i<m;i++)
         {
            int[] lastadded=list.get(list.size()-1);
          int current_end=lastadded[1];
           int nextstart=intervals[i][0];
           int nextend=intervals[i][1];

           if (nextstart<=current_end)
           {
            lastadded[1]=Math.max(current_end,nextend);
           }
           else
           {
            list.add(intervals[i]);
           }
         }
         return list.toArray(new int[list.size()][]);
        
    }
}