import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Map will store: Key = the number, Value = has it been added to the result?
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. Put all numbers from nums1 into the map. 
        // We set the value to false because it hasn't been added to the intersection yet.
        for (int num : nums1) {
            map.put(num, false);
        }
        
        // 2. Check elements of nums2 against the map
        for (int num : nums2) {
            // If the map contains the key AND we haven't already added it to the result
            if (map.containsKey(num) && map.get(num) == false) {
                list.add(num);
                map.put(num, true); // Mark as true so we don't add duplicates from nums2
            }
        }
        
        // 3. Convert the ArrayList back to a primitive int[] array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}