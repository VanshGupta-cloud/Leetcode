import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<String> commonChars(String[] words) {
        // Step 1: Create our "master" hash array and fill it with max values
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        
        // Step 2: Hash the frequency of characters for each word
        for (String word : words) {
            int[] charCount = new int[26]; // Fast hash array for the current word
            for (char ch : word.toCharArray()) {
                charCount[ch - 'a']++; // Hashing and incrementing the count
            }
            
            // Step 3: Intersect frequencies by keeping the minimum values
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        
        // Step 4: De-hash back into the resulting string list
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char)(i + 'a')));
                minFreq[i]--;
            }
        }
        
        return result;
    }
}