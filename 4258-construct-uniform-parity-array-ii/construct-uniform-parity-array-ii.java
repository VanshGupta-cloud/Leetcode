class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int minodd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                if (minodd > nums1[i]) {
                    minodd = nums1[i];
                }
            }
        }
        if (minodd == Integer.MAX_VALUE) {
            return true;
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums1[i] % 2 != 0) {
                    count++;
                } else {
                    int p = nums1[i] - minodd;
                    if (p >= 1) {
                        count++;
                    }
                }
            }
            if (count == n) {
                return true;
            }
        }
        return false;
    }
}