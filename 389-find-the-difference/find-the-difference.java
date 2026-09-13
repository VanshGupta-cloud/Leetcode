class Solution {
    public char findTheDifference(String s, String t) {
       char[] arr=new char[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-97]++;
        }
        int i=0;
        for(;i<t.length();i++)
        {
              if(arr[t.charAt(i)-97]>0)
              {
                arr[t.charAt(i)-97]--;
                continue;
              }
              else
              {
                break;
              }
        }
        return t.charAt(i);
    }
}