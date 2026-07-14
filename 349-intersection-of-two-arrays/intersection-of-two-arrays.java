import java.util.HashMap;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Map stores: Key = Number, Value = State code
        // State 1: Present in nums1
        // State 2: Present in both nums1 and nums2 (Intersection found)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 1. Mark all elements of nums1 with state 1
        for (int num : nums1) {
            map.put(num, 1);
        }
        
        int intersectionCount = 0;
        
        // 2. Scan nums2 to identify matches and count unique intersections
        for (int num : nums2) {
            Integer state = map.get(num);
            if (state != null && state == 1) {
                map.put(num, 2); // Upgrade state to 2 (Matched)
                intersectionCount++; // Increment counter so we know the exact array size
            }
        }
        
        // 3. Directly create the perfectly-sized primitive array
        int[] result = new int[intersectionCount];
        int index = 0;
        
        // 4. Fill the array by collecting keys that reached State 2
        for (int num : map.keySet()) {
            if (map.get(num) == 2) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}