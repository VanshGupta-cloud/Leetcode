import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        // 1. Populate the list with ALL characters from the very first word
        List<String> commonList = new ArrayList<>();
        for (char ch : words[0].toCharArray()) {
            commonList.add(String.valueOf(ch));
        }
        
        // 2. Intersect this list with every subsequent word
        for (int i = 1; i < words.length; i++) {
            List<String> currentWordChars = new ArrayList<>();
            for (char ch : words[i].toCharArray()) {
                currentWordChars.add(String.valueOf(ch));
            }
            
            // Temporary list to hold characters common to both commonList and the current word
            List<String> intersection = new ArrayList<>();
            
            for (String s : commonList) {
                // If the current word contains the character, it's a match!
                if (currentWordChars.contains(s)) {
                    intersection.add(s);
                    // Remove it from the current word list so duplicate letters aren't reused incorrectly
                    currentWordChars.remove(s); 
                }
            }
            
            // Update our master list to only contain elements that survived the intersection
            commonList = intersection;
        }
        
        return commonList;
    }
}