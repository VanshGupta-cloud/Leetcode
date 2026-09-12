class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> stack1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#')
                stack1.push(s.charAt(i));
            else {
                if (stack1.isEmpty())
                    continue;
                else
                    stack1.pop();
            }
        }
         Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#')
                stack2.push(t.charAt(i));
            else {
                if (stack2.isEmpty())
                    continue;
                else
                    stack2.pop();
            }
        }
        if (stack1.equals(stack2))
            return true;
        else
            return false;

    }
}