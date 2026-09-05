class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int mineven = Integer.MAX_VALUE;
        int minodd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                if (mineven > nums1[i]) {
                    mineven = nums1[i];
                }
            } else {
                if (minodd > nums1[i]) {
                    minodd = nums1[i];
                }
            }
        }
        if (mineven == Integer.MAX_VALUE) {
            return true;
        }
        if (minodd == Integer.MAX_VALUE) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                list.add(nums1[i]);
            } else {
                int p = nums1[i] - minodd;
                if (p >= 1) {

                    list.add(p);
                }
            }
        }
        if (list.size() == n) {
            return true;
        }
        list.clear();
        for(int i=0;i<n;i++)
        {
            if(nums1[i]%2!=0)
            {
              list.add(nums1[i]);
            }
            else
            {
                int p = nums1[i] - minodd;
                if (p >= 1) {
                    list.add(p);
                }
            }
        }
        if(list.size() == n) {
            return true;
        }
        return false;
    }
}