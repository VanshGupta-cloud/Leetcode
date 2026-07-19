class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> lastseen = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            lastseen.put(s.charAt(i),i);
        }
        HashSet<Character> visited = new HashSet<>();
        StringBuilder stack = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        { 
            char ch=s.charAt(i);
         if(visited.contains(ch))
        {
            continue;
        }
            
            while(stack.length()>0 &&stack.charAt(stack.length()-1)>ch&&lastseen.get(stack.charAt(stack.length()-1))>i)
            {
                char top=stack.charAt(stack.length()-1);
                  stack.deleteCharAt(stack.length()-1);
              visited.remove(top);
            }
            stack.append(ch);
            visited.add(ch);
        }
        return stack.toString();
    }
}