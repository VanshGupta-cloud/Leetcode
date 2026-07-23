class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        boolean[] charInA = new boolean[26];

        for (char c : a.toCharArray()) {
            charInA[c - 'a'] = true;
        }

        for (char c : b.toCharArray()) {
            if (!charInA[c - 'a']) return -1;
        }
        
        int minRepeats = (b.length() + a.length() - 1) / a.length();

        for (int i = 0; i < minRepeats; i++) {
            sb.append(a);
        }

        if (sb.indexOf(b) != -1) return minRepeats;

        sb.append(a);
        if (sb.indexOf(b) != -1) return minRepeats + 1;

        return -1;
    }
}