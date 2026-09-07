class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack= new ArrayDeque<>();
        int value=0;
        for(int i=0;i<tokens.length;i++)
        { 
            if((tokens[i]).equals("+"))
            {
                int a=stack.pop();
                int b=stack.pop();
                value+=a+b;
                 stack.push(value); 
                 value=0;
            }
            else if((tokens[i]).equals("-"))
            {
                int a=stack.pop();
                int b=stack.pop();
                value+=b-a;
                 stack.push(value);
                  value=0;
            }
            else if((tokens[i]).equals("*"))
            {
                int a=stack.pop();
                int b=stack.pop();
                value+=b*a;
                stack.push(value);
                 value=0;
            }
             else if((tokens[i]).equals("/"))
            {
                int a=stack.pop();
                int b=stack.pop();
                value+=b/a;
                 stack.push(value);
                  value=0;
            }
            else{
            int x=Integer.parseInt(tokens[i]);
            stack.push(x);
            }
        }
        return stack.pop();
    }
}