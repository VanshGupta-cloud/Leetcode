class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven=n*(n+1);
        int sumodd=n*n;

        while(sumeven!=0)
        {
            int temp=sumeven;
            sumeven=sumodd%sumeven;
            sumodd=temp;
        }
        return sumodd;
    }
}