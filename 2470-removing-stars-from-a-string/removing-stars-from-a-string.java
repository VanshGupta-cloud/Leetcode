class Solution {
    public String removeStars(String s) {
     List<Character> list = new ArrayList<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                list.remove(list.size() - 1); // Removes the last element
            } else {
                list.add(ch);
            }
        }
        
        // Convert List<Character> back to String
        StringBuilder sb = new StringBuilder(list.size());
        for (char ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }
}