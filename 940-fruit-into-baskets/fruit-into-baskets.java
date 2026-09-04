

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If we exceed 2 fruit types, shift left pointer ONCE instead of a while loop.
            // This maintains the maximum window size found so far.
            if (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++; // Shift left by 1 to keep window size constant
            }
        }

        // The maximum window size is simply the final distance between right and left
        return fruits.length - left;
    }
}