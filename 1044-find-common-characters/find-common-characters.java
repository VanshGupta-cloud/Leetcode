import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {
        // Step 1: Put all character counts of the first word into the master map
        Map<Character, Integer> masterMap = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            masterMap.put(ch, masterMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Compare with the rest of the words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentMap = new HashMap<>();
            for (char ch : words[i].toCharArray()) {
                currentMap.put(ch, currentMap.getOrDefault(ch, 0) + 1);
            }

            // Update the master map to keep only the minimum frequency
            Map<Character, Integer> updatedMap = new HashMap<>();
            for (char ch : masterMap.keySet()) {
                if (currentMap.containsKey(ch)) {
                    // Keep the character, but use the smaller of the two counts
                    int minCount = Math.min(masterMap.get(ch), currentMap.get(ch));
                    updatedMap.put(ch, minCount);
                }
            }
            masterMap = updatedMap; // The intersection becomes the new master map
        }

        // Step 3: Convert the map results into the final List<String>
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : masterMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int j = 0; j < count; j++) {
                result.add(String.valueOf(ch));
            }
        }

        return result;
    }
}