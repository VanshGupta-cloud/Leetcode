class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sc=new StringBuilder();
     for(int i =0;i<s.length();i++)
     {
        char ch = s.charAt(i);
        if(ch>='A'&&ch<='Z')
        {
            sc.append((char)(ch+32));
        }
        else if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
        {
            sc.append(ch);
        }
     }
   String cleaned=sc.toString();
    if(cleaned.equals(sc.reverse().toString()))
    {
        return true;
    }
    else 
    {
       return false;
    }
    }
}