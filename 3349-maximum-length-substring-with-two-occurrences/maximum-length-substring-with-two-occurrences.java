class Solution {
    public int maximumLengthSubstring(String s) {
        int[]freq=new int[26];
        int left=0;
        int Maxlen=0;
        for(int right=0;right<s.length();right++)
        {
           freq[s.charAt(right)-97]++;
            while(freq[s.charAt(right)-97]>2)
            {         
              freq[s.charAt(left)-97]--;
                left++;
                
            }          
          Maxlen=Math.max(Maxlen,right-left+1);
        }
        return Maxlen;
    }
}