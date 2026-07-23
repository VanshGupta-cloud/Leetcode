class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        // Build until length >= b.length()
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        
        // Check 1: Fits exact or minimum length
        if (sb.toString().contains(b)) return count;
        
        // Check 2: Fits with 1 extra boundary shift
        if (sb.append(a).toString().contains(b)) return count + 1;
        
        return -1;
    }
}