class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
      long m=divisor;
      long n=dividend;
        boolean val=false;
       if(m<0)
       {
        m=-m;
        val=!val;
       }
       if(n<0)
       {
        n=-n;
        val=!val;
       }
        int count=0; 
        if(m==1)count=(int)n;
        else{
        while(n>=m&&m>1)
        {
         n=n-m;
         count++;
        }
        }
        if(val)count=-count;
        if(count>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        
        return count;
    }
}