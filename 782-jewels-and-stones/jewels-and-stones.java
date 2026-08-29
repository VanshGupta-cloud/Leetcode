class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int[]arr=new int[128];
     for(int i=0;i<jewels.length();i++)
     {
        arr[jewels.charAt(i)]++;
     }
     int count=0;
     for(int i=0;i<stones.length();i++)
     {
        if(arr[stones.charAt(i)]>0)
        {
            count++;
        }
     }
      return count;
    }
}