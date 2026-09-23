class Solution {
    public String majorityFrequencyGroup(String s) {
        //freq counting of characters
        int[] charfreq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            charfreq[s.charAt(i) - 97]++;
        }
        //store the same freq count together
        int[] storefreq = new int[n + 1];
        for (int i = 0; i < charfreq.length; i++) {
            if (charfreq[i] > 0) {
                storefreq[charfreq[i]]++;
            }
        }
        //counts the maxlen string with common freq and if two or more same then bestfreq one out of them
        int bestfreq = 0;
        int maxlen = 0;
        for (int freq = 1; freq <= s.length(); freq++) {

            if (maxlen < storefreq[freq] || maxlen == storefreq[freq] && bestfreq < freq) {
                maxlen = storefreq[freq];
                bestfreq = freq;
            }
        }
        //every character matching the frequency of bestfreq is part of ans ,as bestfreq sticks with maxlength
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (charfreq[i] == bestfreq) {
                sb.append((char) (97 + i));
            }
        }
        return sb.toString();
    }
}