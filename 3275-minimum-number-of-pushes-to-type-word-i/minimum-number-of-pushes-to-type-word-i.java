class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int p=1;
       int pushes=0;

       while(n>8)
        {
            pushes+=p*8;
            n=n-8;
            p++;     
        }
        pushes+=n*p;
        return pushes;
    }
}