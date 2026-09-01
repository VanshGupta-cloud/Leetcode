class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           if(ch!='*')
           {
            stack.push(ch);
           }
           else{
            stack.pop();
           }
        }
        StringBuilder sb=new StringBuilder();
     while(!stack.isEmpty())
     {
        sb.append(stack.pop());
     }
     return sb.reverse().toString();

    }
}