class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == val) {
                if (nums[r] != val) {
                    int temp=nums[r];
                    nums[r]=nums[l];
                    nums[l]=temp;
                    l++;
                    r--;
                } else {
                    r--;
                }
            } else if (nums[r] == val) {
                r--;
            } else {
                l++;
            }

        }
        return l;
    }
}