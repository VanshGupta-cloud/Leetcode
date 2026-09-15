class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        //stack is used to remember the no. of days recorded such that 
        for (int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty()&& temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
         return result ;
    }
}