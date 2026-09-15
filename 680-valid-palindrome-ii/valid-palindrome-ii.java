class Solution {
    public boolean validPalindrome(String s) {
      int start=0;
      int end=s.length()-1;

      while(start<end)
      {
        char first=s.charAt(start);
        char last=s.charAt(end);

        if(first==last)
        {
            start++;
            end--;
        }
        else
        return palindrome(s,start+1,end)||palindrome(s,start,end-1);
      }
      return true;

    }
   public boolean palindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}