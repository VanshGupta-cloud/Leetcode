class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        long result=n&n-1;
        if(result==0)
        return true;
        else
        return false;

    }
}