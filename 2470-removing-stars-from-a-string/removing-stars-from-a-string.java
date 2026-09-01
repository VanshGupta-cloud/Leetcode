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
     for(int i=stack.size()-1;i>=0;i--)
     {
        sb.insert(0,stack.pop());
     }
     return sb.toString();

    }
}