class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int Maxlen = 0;
        int[] freq = new int[256];
        while (r < n) {

            if (freq[s.charAt(r)] != 1) {
                freq[s.charAt(r)]++;
                Maxlen = Math.max(Maxlen, r - l + 1);
                r++;
            } else {
                freq[s.charAt(l)]--;
                l++;               
            }

        }
        return Maxlen;

    }
}