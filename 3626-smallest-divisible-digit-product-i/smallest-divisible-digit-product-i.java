class Solution {
    public int smallestNumber(int n, int t) {
         int p = n;
        if(n>=10){
         p=(n/10)*(n%10);
        }
        while(p%t!=0){
            n++;
            if(n<10)
            {p=n;
            }
            else
            p=(n/10)*(n%10);
        }
        return n;
    }
}