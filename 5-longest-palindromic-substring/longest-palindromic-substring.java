class Solution {
    int maxstart=0;
     int maxend=1;
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2)
        return s;
        for(int i=0;i<n;i++)
        {
            expandfromcentre(s,i,i);
            expandfromcentre(s,i,i+1);

        }
        return s.substring(maxstart,maxend);
    }
    void expandfromcentre(String s,int l,int r)
    {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r))
        {
            if((r-l+1)>maxend-maxstart)
            {
                maxstart=l;
                maxend=r+1;
            }
            l--;
            r++;
        }
    }
}