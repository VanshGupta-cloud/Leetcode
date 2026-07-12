class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 1. Ensure nums1 is the smaller array to optimize binary search complexity to O(log(min(m, n)))
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int leftSize = (m + n + 1) / 2;

        int low = 0;
        int high = m;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = leftSize - mid1;

            // Get the partition boundaries, handling out-of-bounds with Min/Max values
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            // Correct partition found
            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0; // Divide by 2.0 to preserve decimal
                } else {
                    return Math.max(l1, l2);
                }
            }
            // Too many elements from nums1's left side, move left
            else if (l1 > r2) {
                high = mid1 - 1;
            }
            // Too few elements from nums1's left side, move right
            else {
                low = mid1 + 1;
            }
        }

        return 0.0; // Fallback (should never be reached if arrays are sorted)
    }
}